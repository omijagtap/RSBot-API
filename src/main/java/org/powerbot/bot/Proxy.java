package org.powerbot.bot;

import java.lang.ref.WeakReference;

public class Proxy<T> {
	public final Reflector reflector;
	public final WeakReference<Object> obj;

	public final WeakReference<T> wrapped;

	public Proxy(final Reflector reflector, final Object obj) {
		this.reflector = reflector;
		if (obj instanceof Proxy) {
			this.obj = ((Proxy) obj).obj;
		} else {
			this.obj = new WeakReference<>(obj);
		}
		this.wrapped = null;
	}

	public Proxy(final T wrapped) {
		this.wrapped = new WeakReference<>(wrapped);
		this.reflector = null;
		this.obj = null;
	}

	public boolean isTypeOf(final Class<? extends Proxy> c) {
		if (wrapped != null) {
			return true;
		}

		return reflector.isTypeOf(obj.get(), c);
	}

	public boolean isNull() {
		return get() == null;
	}

	@Override
	public int hashCode() {
		if (wrapped != null) {
			return System.identityHashCode(wrapped.get());
		}

		return System.identityHashCode(obj.get());
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof Proxy)) {
			return false;
		}
		if (this.wrapped != null) {
			final T unwrapped = this.wrapped.get();
			return unwrapped != null && unwrapped == ((Proxy) o).wrapped.get();
		}
		final Object obj = this.obj.get();
		return obj != null && obj == ((Proxy) o).obj.get();
	}

	public Object get() {
		if (wrapped != null) {
			return wrapped.get();
		}

		return obj != null ? obj.get() : null;
	}
}
