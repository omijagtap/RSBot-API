package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IItemPile;

public class ItemPile extends Proxy<IItemPile> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache();

	public ItemPile(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public ItemPile(final IItemPile wrapped) {
		super(wrapped);
	}

	public ItemNode getItem1() {
		if (wrapped != null) {
			//TODO support this
			return null;
			//return new ItemNode(wrapped.get().getItem1());
		}

		return new ItemNode(reflector, reflector.access(this, a));
	}

	public ItemNode getItem2() {
		if (wrapped != null) {
			//TODO support this
			return null;
			//return new ItemNode(wrapped.get().getItem2());
		}

		return new ItemNode(reflector, reflector.access(this, b));
	}

	public ItemNode getItem3() {
		if (wrapped != null) {
			//TODO support this
			return null;
		//	return new ItemNode(wrapped.get().getItem3());
		}

		return new ItemNode(reflector, reflector.access(this, c));
	}

	public int getY() {
		return reflector.accessInt(this, d);
	}
}
