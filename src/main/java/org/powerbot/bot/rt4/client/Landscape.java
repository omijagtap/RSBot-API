package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.ILandscape;
import org.powerbot.bot.rt4.client.internal.ITile;

public class Landscape extends Proxy<ILandscape> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache();

	public Landscape(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Landscape(final ILandscape wrapped) {
		super(wrapped);
	}

	public Tile[][][] getTiles() {
		if (wrapped != null) {
			final ITile[][][] tiles = wrapped.get().getTiles();
			if (tiles == null) {
				return null;
			}

			final Tile[][][] wrapped = new Tile[tiles.length][][];
			for (int i = 0; i < tiles.length; i++) {
				final ITile[][] sub = tiles[i];
				if (sub == null) {
					wrapped[i] = null;
					continue;
				}
				final Tile[][] sub2 = new Tile[sub.length][];
				wrapped[i] = sub2;
				for (int i2 = 0; i2 < sub.length; i2++) {
					final ITile[] sub2_1 = sub[i2];
					if (sub2_1 == null) {
						sub2[i] = null;
						continue;
					}
					final Tile[] sub2_2 = new Tile[sub2_1.length];
					sub2[i2] = sub2_2;
					for (int i3 = 0; i3 < sub2_1.length; i3++) {
						sub2_2[i3] = new Tile(sub2_1[i3]);
					}
				}
			}

			return wrapped;
		}

		final Object[][][] arr = reflector.access(this, a, Object[][][].class);
		if (arr == null) {
			return null;
		}
		final Tile[][][] arr2 = new Tile[arr.length][][];
		for (int i = 0; i < arr.length; i++) {
			final Object[][] sub = arr[i];
			if (sub == null) {
				arr2[i] = null;
				continue;
			}
			final Tile[][] sub2 = new Tile[sub.length][];
			arr2[i] = sub2;
			for (int i2 = 0; i2 < sub.length; i2++) {
				final Object[] sub2_1 = sub[i2];
				if (sub2_1 == null) {
					sub2[i] = null;
					continue;
				}
				final Tile[] sub2_2 = new Tile[sub2_1.length];
				sub2[i2] = sub2_2;
				for (int i3 = 0; i3 < sub2_1.length; i3++) {
					sub2_2[i3] = new Tile(reflector, sub2_1[i3]);
				}
			}
		}
		return arr2;
	}
}
