package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IFloorObject;

public class FloorObject extends BasicObject<IFloorObject> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache();

	public FloorObject(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public FloorObject(final IFloorObject wrapped) {
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
		return -1;
	}

	@Override
	public int getZ() {
		return -1;
	}

	@Override
	public int getX1() {
		return -1;
	}

	@Override
	public int getY1() {
		return -1;
	}

	@Override
	public int getX2() {
		return -1;
	}

	@Override
	public int getY2() {
		return -1;
	}
}
