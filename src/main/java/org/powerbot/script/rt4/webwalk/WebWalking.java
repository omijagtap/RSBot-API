package org.powerbot.script.rt4.webwalk;

import org.powerbot.script.Locatable;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.webwalk.requests.ClosestNodeRequest;
import org.powerbot.script.rt4.webwalk.requests.PathBetweenRequest;
import org.powerbot.script.rt4.webwalk.requests.Request;
import org.powerbot.util.HttpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class WebWalking extends ClientAccessor {

	private final WebService webService = new WebService();

	public WebWalking(final ClientContext ctx) {
		super(ctx);
	}

	public boolean moveTo(final Locatable target) {
		final WebPath path = findPath(ctx.players.local(), target);
		return path.valid() && path.traverse(ctx);
	}

	public boolean moveToBank(final WebBank bank) {
		return moveTo(bank.getTile());
	}

	public WebPath findPath(final Locatable a, final Locatable b) {
		return webService.requestPathBetween(a, b);
	}

	public WebNode closestNodeTo(final Locatable target) {
		return webService.requestClosestNodeTo(target);
	}

	private static class WebService {

		private final Map<Locatable, WebNode> closestCache = new HashMap<>();
		private final Map<String, WebPath> pathCache = new HashMap<>();

		WebNode requestClosestNodeTo(final Locatable target) {
			if (closestCache.containsKey(target)) {
				return closestCache.get(target);
			}
			final WebNode closest = submitRequest(new ClosestNodeRequest(target));
			closestCache.put(target, closest);
			return closest;
		}

		WebPath requestPathBetween(final Locatable a, final Locatable b) {
			final String key = a.toString() + b.toString();
			if (pathCache.containsKey(key)) {
				return pathCache.get(key);
			}
			final WebPath path = submitRequest(new PathBetweenRequest(a, b));
			pathCache.put(key, path);
			return path;
		}

		private <T> T submitRequest(final Request<T> request) {
			try {
				final URL url = new URL("https://powerbot.org/api/web" + request.getEndpoint());
				final BufferedReader reader = new BufferedReader(HttpUtils.openReader(url));
				final StringBuilder sb = new StringBuilder();
				String line;
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
				return request.parseResponse(sb.toString());
			} catch (final IOException e) {
				e.printStackTrace();
			}
			return null;
		}
	}
}
