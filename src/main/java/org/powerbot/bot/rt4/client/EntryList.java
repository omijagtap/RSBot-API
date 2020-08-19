package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IEntryList;

public class EntryList extends Proxy<IEntryList> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public EntryList(final Reflector reflector, final Object obj) {
		super(reflector, obj);
	}

	public EntryList(final IEntryList wrapped) {
		super(wrapped);
	}

	public Entry getSentinel() {
		if (wrapped != null) {
			return new Entry(wrapped.get().getSentinel());
		}

		return new Entry(reflector, reflector.access(this, a));
	}
}
