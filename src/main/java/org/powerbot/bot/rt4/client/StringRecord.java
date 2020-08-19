package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IStringRecord;

public class StringRecord extends Proxy<IStringRecord> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public StringRecord(final Reflector engine, final Object parent) {
		super(engine, parent);
  }

	public StringRecord(final IStringRecord wrapped) {
		super(wrapped);
	}

	public String getValue() {
		if (wrapped != null) {
			return wrapped.get().getValue();
		}

		return reflector.accessString(this, a);
	}
}
