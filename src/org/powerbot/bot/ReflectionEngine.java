package org.powerbot.bot;

import java.util.Map;

public class ReflectionEngine {
	private final ClassLoader loader;
	private final Map<String, Map<String, Field>> fields;

	public ReflectionEngine(final ClassLoader loader, final Map<String, Map<String, Field>> fields) {
		this.loader = loader;
		this.fields = fields;
	}

	public static class Field {
		private final String parent, name;
		private final boolean virtual;

		public Field(final String parent, final String name, final boolean virtual) {
			this.parent = parent;
			this.name = name;
			this.virtual = virtual;
		}
	}

	public boolean accessBool(final ContextAccessor accessor) {
		return accessBool(accessor, false);
	}

	public boolean accessBool(final ContextAccessor accessor, final boolean d) {
		final Boolean b = access(accessor, Boolean.class);
		return b != null ? b : d;
	}

	public int accessInt(final ContextAccessor accessor) {
		return accessInt(accessor, -1);
	}

	public int accessInt(final ContextAccessor accessor, final int d) {
		final Integer i = access(accessor, Integer.class);
		return i != null ? i : d;
	}

	public long accessLong(final ContextAccessor accessor) {
		return accessLong(accessor, -1l);
	}

	public long accessLong(final ContextAccessor accessor, final long d) {
		final Long i = access(accessor, Long.class);
		return i != null ? i : d;
	}

	public Object access(final ContextAccessor accessor) {
		return access(accessor, Object.class);
	}

	public <T> T access(final ContextAccessor accessor, final Class<T> type) {
		if (accessor.parent == null) {
			return null;
		}
		final StackTraceElement e = getCallingAPI();
		final String c = e.getClassName(), m = e.getMethodName();
		System.out.println(c + " " + m);
		final Map<String, Field> map = fields.get(c);
		if (map == null || !map.containsKey(m)) {
			System.out.println("not in map");
			return null;
		}
		final Field f = map.get(m);
		Class<?> c2;
		if (f.virtual) {
			c2 = accessor.parent.getClass();
		} else {
			final String s = f.parent;
			if (s == null || s.isEmpty()) {
				return null;
			}
			try {
				c2 = loader.loadClass(s);
			} catch (final ClassNotFoundException ignored) {
				return null;
			}
		}
		java.lang.reflect.Field f2 = null;
		if (f.virtual) {
			while (f2 == null && c2 != Object.class) {
				try {
					f2 = c2.getDeclaredField(f.name);
				} catch (final NoSuchFieldException ignored) {
					c2 = c2.getSuperclass();
				}
			}
		} else {
			try {
				f2 = c2.getDeclaredField(f.name);
			} catch (final NoSuchFieldException ignored) {
			}
		}
		if (f2 == null) {
			return null;
		}
		final boolean a2 = f2.isAccessible();
		f2.setAccessible(true);
		Object o = null;
		try {
			o = f2.get(f.virtual ? accessor.parent : null);
		} catch (final IllegalAccessException ignored) {
		}
		f2.setAccessible(a2);
		return type.cast(o);
	}

	private StackTraceElement getCallingAPI() {
		final String n = ReflectionEngine.class.getName();
		final StackTraceElement[] arr = Thread.currentThread().getStackTrace();
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == null || arr[i].getClassName().equals(n)) {
				continue;
			}
			return arr[i];
		}
		return arr[arr.length - 1];
	}
}