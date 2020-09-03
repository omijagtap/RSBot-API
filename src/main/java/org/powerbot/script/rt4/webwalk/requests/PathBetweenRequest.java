package org.powerbot.script.rt4.webwalk.requests;

import org.powerbot.script.Locatable;
import org.powerbot.script.rt4.webwalk.WebPath;

public class PathBetweenRequest implements Request<WebPath> {

	private final Locatable a, b;

	public PathBetweenRequest(final Locatable a, final Locatable b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String getEndpoint() {
		return "/path_between";
	}

	@Override
	public WebPath parseResponse(final String raw) {
		return null;
	}
}
