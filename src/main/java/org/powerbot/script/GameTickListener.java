package org.powerbot.script;

import java.util.EventListener;

/**
 * GameTickListener
 * A listener for game loops (ticks)
 */
public interface GameTickListener extends EventListener {
	/**
	 * Fired upon a game loop
	 *
	 * @param event the event representing the message
	 */
	void loop(GameTickEvent event);
}
