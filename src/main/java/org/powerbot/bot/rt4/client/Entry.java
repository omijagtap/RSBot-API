package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IEntry;

public class Entry<T extends IEntry> extends Node<T> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public Entry(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Entry(final T wrapped) {
		super(wrapped);
	}

	public Entry getNext() {
		if (wrapped != null) {
			return new Entry(wrapped.get().getNext());
		}

		return new Entry(reflector, reflector.access(this, a));
	}
}
