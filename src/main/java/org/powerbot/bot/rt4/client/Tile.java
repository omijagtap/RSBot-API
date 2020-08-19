package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IGameObject;
import org.powerbot.bot.rt4.client.internal.INodeDeque;
import org.powerbot.bot.rt4.client.internal.ITile;
import org.powerbot.script.rt4.GroundItem;

public class Tile extends Proxy<ITile> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache(),
			e = new Reflector.FieldCache(),
			f = new Reflector.FieldCache();

	public Tile(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Tile(final ITile wrapped) {
		super(wrapped);
	}

	public ItemPile getItemPile() {
		if (wrapped != null) {
			return new ItemPile(wrapped.get().getItemPile());
		}

		return new ItemPile(reflector, reflector.access(this, a));
	}

	public BoundaryObject getBoundaryObject() {
		if (wrapped != null) {
			return new BoundaryObject(wrapped.get().getBoundaryObject());
		}

		return new BoundaryObject(reflector, reflector.access(this, b));
	}

	public WallObject getWallObject() {
		if (wrapped != null) {
			return new WallObject(wrapped.get().getWallObject());
		}

		return new WallObject(reflector, reflector.access(this, c));
	}

	public FloorObject getFloorObject() {
		if (wrapped != null) {
			return new FloorObject(wrapped.get().getFloorObject());
		}

		return new FloorObject(reflector, reflector.access(this, d));
	}

	public GameObject[] getGameObjects() {
		if (wrapped != null) {
			final IGameObject[] objects = wrapped.get().getGameObjects();
			final GameObject[] wrapped = objects != null ? new GameObject[objects.length] : null;
			if (objects != null) {
				for (int i = 0; i < objects.length; i++) {
					wrapped[i] = new GameObject(objects[i]);
				}
			}
			return wrapped;
		}

		final Object[] arr = reflector.access(this, e, Object[].class);
		final GameObject[] arr2 = arr != null ? new GameObject[arr.length] : null;
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = new GameObject(reflector, arr[i]);
			}
		} else {
			return new GameObject[0];
		}
		return arr2;
	}

	public int getGameObjectLength() {
		if (wrapped != null) {
			return wrapped.get().getGameObjectLength();
		}

		return reflector.accessInt(this, f);
	}
}
