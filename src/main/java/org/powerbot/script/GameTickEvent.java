package org.powerbot.script;

import org.powerbot.bot.AbstractEvent;

import java.util.EventListener;

public class GameTickEvent extends AbstractEvent {

	public static final int GAME_TICK_EVENT = 0x120;
	private static final long serialVersionUID = -7903518949319501594L;

	public GameTickEvent() {
		super(GAME_TICK_EVENT);
	}

	@Override
	public void call(final EventListener e) {
		((GameTickListener) e).loop(this);
	}
}
