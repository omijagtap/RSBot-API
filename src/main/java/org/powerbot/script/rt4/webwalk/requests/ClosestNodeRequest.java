package org.powerbot.script.rt4.webwalk.requests;

import org.powerbot.script.Locatable;
import org.powerbot.script.rt4.webwalk.WebNode;

public class ClosestNodeRequest implements Request<WebNode> {

	private final int x, y, z;

	public ClosestNodeRequest(final Locatable locatable) {
		this.x = locatable.tile().x();
		this.y = locatable.tile().y();
		this.z = locatable.tile().floor();
	}

	@Override
	public String getEndpoint() {
		return "/closest_node/" + x + "/" + y + "/" + z;
	}

	@Override
	public WebNode parseResponse(final String raw) {
		return null;
	}
}
