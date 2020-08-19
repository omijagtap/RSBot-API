package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IProjectile;

public class Projectile extends Proxy<IProjectile> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache(),
			e = new Reflector.FieldCache(),
			f = new Reflector.FieldCache(),
			g = new Reflector.FieldCache(),
			h = new Reflector.FieldCache(),
			i = new Reflector.FieldCache(),
			j = new Reflector.FieldCache(),
			k = new Reflector.FieldCache(),
			l = new Reflector.FieldCache(),
			m = new Reflector.FieldCache(),
			n = new Reflector.FieldCache();

	public int getId() {
		return reflector.accessInt(this, i);
	}

	public Projectile(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Projectile(final IProjectile wrapped) {
		super(wrapped);
	}

	public int getTargetIndex() {
		if (wrapped != null) {
			return wrapped.get().getTargetIndex();
		}

		return reflector.accessInt(this, b);
	}

	public int getStartX() {
		if (wrapped != null) {
			return wrapped.get().getStartX();
		}

		return reflector.accessInt(this, c);
	}

	public int getStartY() {
		if (wrapped != null) {
			return wrapped.get().getStartY();
		}

		return reflector.accessInt(this, d);
	}

	public int getPlane() {
		if (wrapped != null) {
			return wrapped.get().getPlane();
		}

		return reflector.accessInt(this, e);
	}

	public boolean isStarted() {
		if (wrapped != null) {
			return wrapped.get().isStarted();
		}

		return reflector.accessBool(this, f);
	}

	public int getSlope() {
		if (wrapped != null) {
			return wrapped.get().getSlope();
		}

		return reflector.accessInt(this, g);
	}

	public int getEndHeight() {
		if (wrapped != null) {
			return wrapped.get().getEndHeight();
		}

		return reflector.accessInt(this, h);
	}

	public int getOrientation() {
		if (wrapped != null) {
			return wrapped.get().getOrientation();
		}

		return reflector.accessInt(this, j);
	}

	public int getStartDistance() {
		if (wrapped != null) {
			return wrapped.get().getStartDistance();
		}

		return reflector.accessInt(this, k);
	}

	public int getCycleStart() {
		if (wrapped != null) {
			return wrapped.get().getCycleStart();
		}

		return reflector.accessInt(this, l);
	}

	public double getX() {
		if (wrapped != null) {
			return wrapped.get().getX();
		}

		return reflector.accessDouble(this, m);
	}

	public double getY() {
		if (wrapped != null) {
			return wrapped.get().getY();
		}

		return reflector.accessDouble(this, n);
	}


}
