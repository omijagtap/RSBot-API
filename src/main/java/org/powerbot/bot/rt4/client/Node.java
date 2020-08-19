package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.INode;

public class Node<T extends INode> extends Proxy<T> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache();

	public Node(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Node(final T wrapped) {
		super(wrapped);
	}

	public Node getNext() {
		if (wrapped != null) {
			return new Node(wrapped.get().getNext());
		}

		return new Node(reflector, reflector.access(this, a));
	}

	public long getNodeId() {
		if (wrapped != null) {
			return wrapped.get().getNodeId();
		}

		return reflector.accessLong(this, b);
	}

	/**
	 * @deprecated Use Node#getNodeId
	 */
	public long getId() {
		if (wrapped != null) {
			return wrapped.get().getNodeId();
		}

		return reflector.accessLong(this, b);
	}
}
