package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IBarComponent;

public class BarComponent extends Proxy<IBarComponent> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public BarComponent(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public BarComponent(final IBarComponent wrapped) {
		super(wrapped);
	}

	public int getWidth() {
		if (wrapped != null) {
			return wrapped.get().getWidth();
		}

		return reflector.accessInt(this, a);
	}
}
