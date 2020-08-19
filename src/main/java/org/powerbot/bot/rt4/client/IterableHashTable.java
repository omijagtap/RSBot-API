package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Proxy;
import org.powerbot.bot.Reflector;
import org.powerbot.bot.rt4.client.internal.IIterableHashTable;
import org.powerbot.bot.rt4.client.internal.INode;

import java.util.Arrays;

public class IterableHashTable extends Proxy<IIterableHashTable> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache();

	public IterableHashTable(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public IterableHashTable(final IIterableHashTable wrapped) {
		super(wrapped);
	}

	public Node[] getBuckets() {
		if (wrapped != null) {
			final INode[] nodes = wrapped.get().getBuckets();
			final Node[] buckets = nodes != null ? new Node[nodes.length] : null;
			if (nodes != null) {
				for (int i = 0; i < nodes.length; i++) {
					buckets[i] = new Node(nodes[i]);
				}
			}

			return buckets;
		}

		final Object[] arr = reflector.access(this, a, Object[].class);
		final Node[] arr2 = arr != null ? new Node[arr.length] : null;
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = new Node(reflector, arr[i]);
			}
		}
		return arr2;
	}

	public int getSize() {
		if (wrapped != null) {
			return wrapped.get().getSize();
		}

		return reflector.accessInt(this, b);
	}
}
