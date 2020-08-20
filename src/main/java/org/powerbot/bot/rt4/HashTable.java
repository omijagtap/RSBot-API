package org.powerbot.bot.rt4;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashTable<N> implements Iterator<N>, Iterable<N> {
	private final org.powerbot.bot.rt4.client.HashTable table;
	private final Class<N> type;
	private int bucket_index = 0;
	private Node curr;
	private Node next;

	public HashTable(final org.powerbot.bot.rt4.client.HashTable table, final Class<N> type) {
		if (type == null) {
			throw new IllegalArgumentException();
		}
		this.table = table;
		this.type = type;
	}

	@Override
	public Iterator<N> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		final org.powerbot.bot.rt4.client.Node[] buckets = !table.isNull() ? table.getBuckets() : null;
		if (buckets == null) {
			return false;
		}
		final long c = curr != null ? curr.getNodeId() : -1L;
		if (bucket_index > 0 && bucket_index <= buckets.length && buckets[bucket_index - 1].getNodeId() != c) {
			next = curr;
			curr = curr.getNext();
			return next != null;
		}
		while (bucket_index < buckets.length) {
			final org.powerbot.bot.rt4.client.Node n = buckets[bucket_index++].getNext();
			if (buckets[bucket_index - 1].getNodeId() != n.getNodeId()) {
				next = n;
				curr = n.getNext();
				return next != null;
			}
		}
		return false;
	}

	@Override
	public N next() {
		if (!hasNext()) {
			return null;
		}

		return IteratorUtils.newInstance(table, next, type);
	}


	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	public static <E extends Proxy> E lookup(final org.powerbot.bot.rt4.client.IterableHashTable table, final long id, final Class<E> type) {
		if (table == null) {
			return null;
		}

		final Node[] buckets = table.getBuckets();
		if (buckets == null || buckets.length == 0) {
			return IteratorUtils.newInstance(table, null, type);
		}

		final Node n = buckets[(int) (id & buckets.length - 1)];
		for (Node o = n.getNext(); !o.equals(n) && !o.isNull(); o = o.getNext()) {
			if (o.getNodeId() == id) {
				return IteratorUtils.newInstance(table, o, type);
			}
		}

		return IteratorUtils.newInstance(table, null, type);
	}
}

