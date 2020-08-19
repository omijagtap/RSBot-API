package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.ILinkedList;
import org.powerbot.bot.rt4.client.internal.INode;

public class LinkedList<T> extends Proxy<ILinkedList> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public LinkedList(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public LinkedList(final ILinkedList wrapped) {
		super(wrapped);
	}

	public Node getSentinel() {
		if (wrapped != null) {
			return new Node(wrapped.get().getSentinel());
		}

		return new Node(reflector, reflector.access(this, a));
	}
}
