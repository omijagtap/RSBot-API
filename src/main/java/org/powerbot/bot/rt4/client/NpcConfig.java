package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.INpcConfig;

public class NpcConfig extends Proxy<INpcConfig> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache(),
			e = new Reflector.FieldCache(),
			f = new Reflector.FieldCache(),
			g = new Reflector.FieldCache();

	public NpcConfig(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public NpcConfig(final INpcConfig wrapped) {
		super(wrapped);
	}

	public int getId() {
		if (wrapped != null) {
			return wrapped.get().getId();
		}

		return reflector.accessInt(this, a);
	}

	public int getLevel() {
		if (wrapped != null) {
			return wrapped.get().getLevel();
		}

		return reflector.accessInt(this, b);
	}

	public String getName() {
		if (wrapped != null) {
			return wrapped.get().getName();
		}

		return reflector.accessString(this, c);
	}

	public String[] getActions() {
		if (wrapped != null) {
			return wrapped.get().getActions();
		}

		return reflector.access(this, d, String[].class);
	}

	public int[] getConfigs() {
		if (wrapped != null) {
			return wrapped.get().getConfigs();
		}

		return reflector.accessInts(this, e);
	}

	public int getVarpbitIndex() {
		if (wrapped != null) {
			return wrapped.get().getVarpbitIndex();
		}

		return reflector.accessInt(this, f);
	}

	public int getVarbit() {
		if (wrapped != null) {
			return wrapped.get().getVarbit();
		}

		return reflector.accessInt(this, g);
	}
}
