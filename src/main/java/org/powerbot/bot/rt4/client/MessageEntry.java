package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IEntry;
import org.powerbot.bot.rt4.client.internal.IMessageEntry;

public class MessageEntry extends Entry<IMessageEntry> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache();

	public MessageEntry(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public MessageEntry(final IMessageEntry wrapped) {
		super(wrapped);
	}

	public String getSender() {
		if (wrapped != null) {
			return wrapped.get().getSender();
		}

		return reflector.accessString(this, a);
	}

	public String getMessage() {
		if (wrapped != null) {
			return wrapped.get().getMessage();
		}

		return reflector.accessString(this, b);
	}

	public int getType() {
		if (wrapped != null) {
			return wrapped.get().getType();
		}

		return reflector.accessInt(this, c);
	}
}
