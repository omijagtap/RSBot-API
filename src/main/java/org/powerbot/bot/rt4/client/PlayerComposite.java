package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IPlayerComposite;

public class PlayerComposite extends Proxy<IPlayerComposite> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public PlayerComposite(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public PlayerComposite(final IPlayerComposite wrapped) {
		super(wrapped);
	}

	public int[] getAppearance() {
		if (wrapped != null) {
			return wrapped.get().getAppearance();
		}

		return reflector.accessInts(this, a);
	}
}
