package org.powerbot.script.rt4.webwalk;

import org.powerbot.script.Tile;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.webwalk.conditions.HandlerCondition;

public abstract class AbstractActionHandler {

	protected final Tile source;
	protected final Tile target;

	public AbstractActionHandler(final Tile source, final Tile target) {
		this.source = source;
		this.target = target;
	}

	abstract boolean interact(final ClientContext ctx);

	abstract boolean valid(final ClientContext ctx);

	abstract HandlerCondition success();

	public Tile getSource() {
		return source;
	}

	public Tile getTarget() {
		return target;
	}
}
