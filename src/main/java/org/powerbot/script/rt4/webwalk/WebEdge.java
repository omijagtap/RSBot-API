package org.powerbot.script.rt4.webwalk;

public class WebEdge {

	private final WebNode target;
	private final AbstractActionHandler handler;

	public WebEdge(final WebNode target, final AbstractActionHandler handler) {
		this.target = target;
		this.handler = handler;
	}

	public AbstractActionHandler getHandler() {
		return handler;
	}

	public WebNode getTarget() {
		return target;
	}
}
