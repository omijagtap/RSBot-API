package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IGameObject;

public class GameObject extends BasicObject<IGameObject> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache(),
			e = new Reflector.FieldCache(),
			f = new Reflector.FieldCache(),
			g = new Reflector.FieldCache(),
		h = new Reflector.FieldCache(),
	i = new Reflector.FieldCache();

	public GameObject(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public GameObject(final IGameObject wrapped) {
		super(wrapped);
	}

	@Override
	public long getUid() {
		if (wrapped != null) {
			return wrapped.get().getUid();
		}

		return reflector.accessLong(this, a);
	}

	@Override
	public int getMeta() {
		if (wrapped != null) {
			return wrapped.get().getMeta();
		}

		return reflector.accessInt(this, b);
	}

	@Override
	public int getX() {
		if (wrapped != null) {
			return wrapped.get().getX();
		}

		return reflector.accessInt(this, c);
	}

	@Override
	public int getZ() {
		if (wrapped != null) {
			return wrapped.get().getZ();
		}

		return reflector.accessInt(this, d);
	}

	@Override
	public int getX1() {
		if (wrapped != null) {
			return wrapped.get().getX1();
		}

		return reflector.accessInt(this, e);
	}

	@Override
	public int getY1() {
		if (wrapped != null) {
			return wrapped.get().getY1();
		}

		return reflector.accessInt(this, f);
	}

	@Override
	public int getX2() {
		if (wrapped != null) {
			return wrapped.get().getX2();
		}

		return reflector.accessInt(this, g);
	}

	@Override
	public int getY2() {
		if (wrapped != null) {
			return wrapped.get().getY2();
		}

		return reflector.accessInt(this, h);
	}
}
