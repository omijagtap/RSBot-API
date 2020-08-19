package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.ICache;

public class Cache extends Proxy<ICache> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public Cache(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Cache(final ICache wrapped) {
		super(wrapped);
	}

	public IterableHashTable getTable() {
		if (wrapped != null) {
			return new IterableHashTable(wrapped.get().getTable());
		}

		return new IterableHashTable(reflector, reflector.access(this, a));
	}
}
