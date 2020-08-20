package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IItemPile;

public class ItemPile extends Proxy<IItemPile> {

	public ItemPile(final IItemPile wrapped) {
		super(wrapped);
	}

	public ItemNode getItem1() {
		if (!isNull()) {
			//TODO support this
			return null;
			//return new ItemNode(wrapped.get().getItem1());
		}

		return null;
	}

	public ItemNode getItem2() {
		if (!isNull()) {
			//TODO support this
			return null;
			//return new ItemNode(wrapped.get().getItem2());
		}

		return null;
	}

	public ItemNode getItem3() {
		if (!isNull()) {
			//TODO support this
			return null;
		//	return new ItemNode(wrapped.get().getItem3());
		}

		return null;
	}

	public int getY() {
		return -1;
	}
}
