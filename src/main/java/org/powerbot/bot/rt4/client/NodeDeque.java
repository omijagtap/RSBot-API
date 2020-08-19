package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.INodeDeque;

public class NodeDeque extends Proxy<INodeDeque> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public NodeDeque(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public NodeDeque(final INodeDeque wrapped) {
		super(wrapped);
	}

	public Node getSentinel() {
		if (wrapped != null) {
			return new Node(wrapped.get().getSentinel());
		}

		return new Node(reflector, reflector.access(this, a));
	}
}
