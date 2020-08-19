package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IWidgetNode;

public class WidgetNode extends Node<IWidgetNode> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public WidgetNode(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public WidgetNode(final IWidgetNode wrapped) {
		super(wrapped);
	}

	public int getUid() {
		if (wrapped != null) {
			return wrapped.get().getUid();
		}

		return reflector.accessInt(this, a);
	}
}
