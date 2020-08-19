package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IPlayer;

public class Player extends Actor<IPlayer> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache();

	public Player(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Player(final IPlayer wrapped) {
		super(wrapped);
	}

	public int getCombatLevel() {
		if (wrapped != null) {
			return wrapped.get().getCombatLevel();
		}

		return reflector.accessInt(this, a);
	}

	public String getName() {
		if (wrapped != null) {
			return new StringRecord(wrapped.get().getName()).getValue();
		}

		return new StringRecord(reflector, reflector.access(this, b)).getValue();
	}

	public int getTeam() {
		if (wrapped != null) {
			return wrapped.get().getTeam();
		}

		return reflector.accessInt(this, c);
	}

	public PlayerComposite getComposite() {
		if (wrapped != null) {
			return new PlayerComposite(wrapped.get().getComposite());
		}

		return new PlayerComposite(reflector, reflector.access(this, d));
	}
}
