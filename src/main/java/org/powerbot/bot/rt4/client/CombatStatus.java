package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.ICombatStatus;

public class CombatStatus extends Proxy<ICombatStatus> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
												b = new Reflector.FieldCache();

	public CombatStatus(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public CombatStatus(final ICombatStatus wrapped) {
		super(wrapped);
	}

	public LinkedList getList() {
		if (wrapped != null) {
			return new LinkedList(wrapped.get().getList());
		}

		return new LinkedList(reflector, reflector.access(this, a));
	}

	public BarComponent getBarComponent() {
		if (wrapped != null) {
			return new BarComponent(wrapped.get().getBarComponent());
		}

		return new BarComponent(reflector, reflector.access(this, b));
	}
}
