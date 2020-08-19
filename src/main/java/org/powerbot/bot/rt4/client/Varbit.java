package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IVarbit;

public class Varbit extends Node<IVarbit> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache();

	public Varbit(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Varbit(final IVarbit wrapped) {
		super(wrapped);
	}

	public int getIndex() {
		if (wrapped != null) {
			return wrapped.get().getIndex();
		}

		return reflector.accessInt(this, a);
	}

	public int getStartBit() {
		if (wrapped != null) {
			return wrapped.get().getStartBit();
		}

		return reflector.accessInt(this, b);
	}

	public int getEndBit() {
		if (wrapped != null) {
			return wrapped.get().getEndBit();
		}

		return reflector.accessInt(this, c);
	}
}
