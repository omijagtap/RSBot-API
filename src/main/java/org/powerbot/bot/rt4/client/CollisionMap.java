package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.ICollisionMap;

public class CollisionMap extends Proxy<ICollisionMap> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache();

	public CollisionMap(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public CollisionMap(final ICollisionMap wrapped) {
		super(wrapped);
	}

	public int[][] getFlags() {
		if (wrapped != null) {
			return wrapped.get().getFlags();
		}

		return reflector.access(this, a, int[][].class);
	}

	public int getOffsetX() {
		if (wrapped != null) {
			return wrapped.get().getOffsetX();
		}

		return reflector.accessInt(this, b);
	}

	public int getOffsetY() {
		if (wrapped != null) {
			return wrapped.get().getOffsetY();
		}

		return reflector.accessInt(this, c);
	}
}
