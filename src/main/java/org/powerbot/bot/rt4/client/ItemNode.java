package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IItemNode;

public class ItemNode extends Node<IItemNode> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache();

	public ItemNode(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public ItemNode(final IItemNode wrapped) {
		super(wrapped);
	}

	public int getItemId() {
		if (wrapped != null) {
			return wrapped.get().getItemId();
		}

		return reflector.accessInt(this, a);
	}

	public int getStackSize() {
		if (wrapped != null) {
			return wrapped.get().getStackSize();
		}

		return reflector.accessInt(this, b);
	}
}
