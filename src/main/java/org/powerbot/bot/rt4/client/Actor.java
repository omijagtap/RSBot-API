package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IActor;

public class Actor<T extends IActor> extends Proxy<T> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache(),
			e = new Reflector.FieldCache(),
			f = new Reflector.FieldCache(),
			g = new Reflector.FieldCache(),
			h = new Reflector.FieldCache(),
			i = new Reflector.FieldCache();

	public Actor(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Actor(final T wrapped) {
		super(wrapped);
	}

	public int getX() {
		if (wrapped != null) {
			return wrapped.get().getX();
		}

		return reflector.accessInt(this, a);
	}

	public int getZ() {
		if (wrapped != null) {
			return wrapped.get().getZ();
		}

		return reflector.accessInt(this, b);
	}

	public int getHeight() {
		if (wrapped != null) {
			return wrapped.get().getHeight();
		}

		return reflector.accessInt(this, c);
	}

	public int getAnimation() {
		if (wrapped != null) {
			return wrapped.get().getAnimation();
		}

		return reflector.accessInt(this, d);
	}

	public int getSpeed() {
		if (wrapped != null) {
			return wrapped.get().getSpeed();
		}

		return reflector.accessInt(this, e);
	}

	public String getOverheadMessage() {
		if (wrapped != null) {
			return wrapped.get().getOverheadMessage();
		}

		return reflector.accessString(this, f);
	}

	public int getOrientation() {
		if (wrapped != null) {
			return wrapped.get().getOrientation();
		}

		return reflector.accessInt(this, g);
	}

	public int getInteractingIndex() {
		if (wrapped != null) {
			return wrapped.get().getInteractingIndex();
		}

		return reflector.accessInt(this, h);
	}

	public LinkedList getCombatStatusList() {
		if (wrapped != null) {
			return new LinkedList(wrapped.get().getCombatStatusList());
		}

		return new LinkedList(reflector, reflector.access(this, i));
	}
}
