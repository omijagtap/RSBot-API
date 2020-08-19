package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.ICombatStatusData;

public class CombatStatusData extends Proxy<ICombatStatusData> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache();

	public CombatStatusData(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public CombatStatusData(final ICombatStatusData wrapped) {
		super(wrapped);
	}

	public int getHealthRatio() {
		if (wrapped != null) {
			return wrapped.get().getHealthRatio();
		}

		return reflector.accessInt(this, a);
	}

	public int getCycleEnd() {
		if (wrapped != null) {
			return wrapped.get().getCycleEnd();
		}

		return reflector.accessInt(this, b);
	}
}
