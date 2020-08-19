package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IItemConfig;

public class ItemConfig extends Node<IItemConfig> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache();

	public ItemConfig(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public ItemConfig(final IItemConfig wrapped) {
		super(wrapped);
	}

	public String getName() {
		if (wrapped != null) {
			return wrapped.get().getName();
		}

		return reflector.accessString(this, a);
	}

	public boolean isMembers() {
		if (wrapped != null) {
			return wrapped.get().isMembers();
		}

		return reflector.accessBool(this, b);
	}

	public String[] getActions1() {
		if (wrapped != null) {
			return wrapped.get().getActions1();
		}

		return reflector.access(this, c, String[].class);
	}

	public String[] getActions2() {
		if (wrapped != null) {
			return wrapped.get().getActions2();
		}

		return reflector.access(this, d, String[].class);
	}
}
