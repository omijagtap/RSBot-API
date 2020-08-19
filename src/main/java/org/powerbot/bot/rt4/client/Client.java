package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.*;

import javax.security.auth.PrivateCredentialPermission;

public class Client extends Proxy<IClient> implements org.powerbot.script.Client {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache(),
			e = new Reflector.FieldCache(),
			f = new Reflector.FieldCache(),
			i = new Reflector.FieldCache(),
			j = new Reflector.FieldCache(),
			k = new Reflector.FieldCache(),
			l = new Reflector.FieldCache(),
			m = new Reflector.FieldCache(),
			n = new Reflector.FieldCache(),
			o = new Reflector.FieldCache(),
			p = new Reflector.FieldCache(),
			q = new Reflector.FieldCache(),
			r = new Reflector.FieldCache(),
			s = new Reflector.FieldCache(),
			t = new Reflector.FieldCache(),
			u = new Reflector.FieldCache(),
			v = new Reflector.FieldCache(),
			w = new Reflector.FieldCache(),
			x = new Reflector.FieldCache(),
			y = new Reflector.FieldCache(),
			z = new Reflector.FieldCache(),
			aa = new Reflector.FieldCache(),
			ab = new Reflector.FieldCache(),
			ac = new Reflector.FieldCache(),
			ad = new Reflector.FieldCache(),
			ae = new Reflector.FieldCache(),
			af = new Reflector.FieldCache(),
			ag = new Reflector.FieldCache(),
			ah = new Reflector.FieldCache(),
			ai = new Reflector.FieldCache(),
			aj = new Reflector.FieldCache(),
			ak = new Reflector.FieldCache(),
			al = new Reflector.FieldCache(),
			am = new Reflector.FieldCache(),
			an = new Reflector.FieldCache(),
			ao = new Reflector.FieldCache(),
			ap = new Reflector.FieldCache(),
			aq = new Reflector.FieldCache(),
			ar = new Reflector.FieldCache(),
			as = new Reflector.FieldCache(),
			at = new Reflector.FieldCache(),
			au = new Reflector.FieldCache(),
			av = new Reflector.FieldCache(),
			aw = new Reflector.FieldCache(),
			ax = new Reflector.FieldCache(),
			ay = new Reflector.FieldCache(),
			az = new Reflector.FieldCache(),
			ba = new Reflector.FieldCache(),
			bb = new Reflector.FieldCache(),
			bc = new Reflector.FieldCache(),
			bd = new Reflector.FieldCache(),
			be = new Reflector.FieldCache(),
			bf = new Reflector.FieldCache(),
			bg = new Reflector.FieldCache(),
			bh = new Reflector.FieldCache(),
			bi = new Reflector.FieldCache(),
			bj = new Reflector.FieldCache(),
			bk = new Reflector.FieldCache(),
			bl = new Reflector.FieldCache(),
			bm = new Reflector.FieldCache(),
			bn = new Reflector.FieldCache(),
			bo = new Reflector.FieldCache(),
			bp = new Reflector.FieldCache(),
			bq = new Reflector.FieldCache(),
			br = new Reflector.FieldCache(),
			bs = new Reflector.FieldCache(),
			bt = new Reflector.FieldCache(),
			bu = new Reflector.FieldCache();

	public Client(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Client(final IClient wrapped) {
		super(wrapped);
	}

	public NodeDeque getProjectiles() {
		if (wrapped != null) {
			return new NodeDeque(wrapped.get().getProjectiles());
		}

		return new NodeDeque(reflector, reflector.access(this, bp));
	}

	public boolean isMembers() {
		if (wrapped != null) {
			return wrapped.get().isMembers();
		}

		return reflector.accessBool(this, bo);
	}

	public int getCameraX() {
		if (wrapped != null) {
			return wrapped.get().getCameraX();
		}

		return reflector.accessInt(this, a);
	}

	public int getCameraY() {
		if (wrapped != null) {
			return wrapped.get().getCameraY();
		}

		return reflector.accessInt(this, b);
	}

	public int getCameraZ() {
		if (wrapped != null) {
			return wrapped.get().getCameraZ();
		}

		return reflector.accessInt(this, c);
	}

	public int getCameraYaw() {
		if (wrapped != null) {
			return wrapped.get().getCameraYaw();
		}

		return reflector.accessInt(this, d);
	}

	public int getCameraPitch() {
		if (wrapped != null) {
			return wrapped.get().getCameraPitch();
		}

		return reflector.accessInt(this, e);
	}

	public int getMinimapAngle() {
		if (wrapped != null) {
			return wrapped.get().getMinimapAngle();
		}

		return reflector.accessInt(this, f);
	}

	public Player getPlayer() {
		if (wrapped != null) {
			return new Player(wrapped.get().getPlayer());
		}

		return new Player(reflector, reflector.access(this, i));
	}

	public Player[] getPlayers() {
		if (wrapped != null) {
			final IPlayer[] players = wrapped.get().getPlayers();
			final Player[] wrapped = players != null ? new Player[players.length] : null;
			if (players != null) {
				for (int i = 0; i < players.length; i++) {
					wrapped[i] = new Player(players[i]);
				}
			}
			return wrapped;
		}

		final Object[] arr = reflector.access(this, j, Object[].class);
		final Player[] arr2 = arr != null ? new Player[arr.length] : null;
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = new Player(reflector, arr[i]);
			}
		}
		return arr2;
	}

	public int[] getPlayerIndices() {
		if (wrapped != null) {
			return wrapped.get().getPlayerIndices();
		}

		return reflector.accessInts(this, k);
	}

	public Npc[] getNpcs() {
		if (wrapped != null) {
			final INpc[] npcs = wrapped.get().getNpcs();
			final Npc[] wrapped = npcs != null ? new Npc[npcs.length] : null;
			if (npcs != null) {
				for (int i = 0; i < npcs.length; i++) {
					wrapped[i] = new Npc(npcs[i]);
				}
			}
			return wrapped;
		}

		final Object[] arr = reflector.access(this, l, Object[].class);
		final Npc[] arr2 = arr != null ? new Npc[arr.length] : null;
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = new Npc(reflector, arr[i]);
			}
		}
		return arr2;
	}

	public int[] getNpcIndices() {
		if (wrapped != null) {
			return wrapped.get().getNpcIndices();
		}

		return reflector.accessInts(this, m);
	}

	public int getOffsetX() {
		if (wrapped != null) {
			return wrapped.get().getOffsetX();
		}

		return reflector.accessInt(this, n);
	}

	public int getOffsetY() {
		if (wrapped != null) {
			return wrapped.get().getOffsetY();
		}

		return reflector.accessInt(this, o);
	}

	public int getFloor() {
		if (wrapped != null) {
			return wrapped.get().getFloor();
		}

		return reflector.accessInt(this, p);
	}

	public Landscape getLandscape() {
		if (wrapped != null) {
			return new Landscape(wrapped.get().getLandscape());
		}

		return new Landscape(reflector, reflector.access(this, q));
	}

	public byte[][][] getLandscapeMeta() {
		if (wrapped != null) {
			return wrapped.get().getLandscapeMeta();
		}

		return reflector.access(this, r, byte[][][].class);
	}

	public int[][][] getTileHeights() {
		if (wrapped != null) {
			return wrapped.get().getTileHeights();
		}

		return reflector.access(this, s, int[][][].class);
	}

	public boolean isMenuOpen() {
		if (wrapped != null) {
			return wrapped.get().isMenuOpen();
		}

		return reflector.accessBool(this, t);
	}

	public int getMenuX() {
		if (wrapped != null) {
			return wrapped.get().getMenuX();
		}

		return reflector.accessInt(this, u);
	}

	public int getMenuY() {
		if (wrapped != null) {
			return wrapped.get().getMenuY();
		}

		return reflector.accessInt(this, v);
	}

	public int getMenuWidth() {
		if (wrapped != null) {
			return wrapped.get().getMenuWidth();
		}

		return reflector.accessInt(this, w);
	}

	public int getMenuHeight() {
		if (wrapped != null) {
			return wrapped.get().getMenuHeight();
		}

		return reflector.accessInt(this, x);
	}

	public int getMenuCount() {
		if (wrapped != null) {
			return wrapped.get().getMenuCount();
		}

		return reflector.accessInt(this, y);
	}

	public String[] getMenuActions() {
		if (wrapped != null) {
			return wrapped.get().getMenuActions();
		}

		return reflector.access(this, z, String[].class);
	}

	public String[] getMenuOptions() {
		if (wrapped != null) {
			return wrapped.get().getMenuOptions();
		}

		return reflector.access(this, aa, String[].class);
	}

	public int[] getWidgetBoundsX() {
		if (wrapped != null) {
			return wrapped.get().getWidgetBoundsX();
		}

		return reflector.accessInts(this, ab);
	}

	public int[] getWidgetBoundsY() {
		if (wrapped != null) {
			return wrapped.get().getWidgetBoundsY();
		}

		return reflector.accessInts(this, ac);
	}

	public int[] getWidgetBoundsWidth() {
		if (wrapped != null) {
			return wrapped.get().getWidgetBoundsWidth();
		}

		return reflector.accessInts(this, ad);
	}

	public int[] getWidgetBoundsHeight() {
		if (wrapped != null) {
			return wrapped.get().getWidgetBoundsHeight();
		}

		return reflector.accessInts(this, ae);
	}

	public int getDestinationX() {
		if (wrapped != null) {
			return wrapped.get().getDestinationX();
		}

		return reflector.accessInt(this, af);
	}

	public int getDestinationY() {
		if (wrapped != null) {
			return wrapped.get().getDestinationY();
		}

		return reflector.accessInt(this, ag);
	}

	public Widget[][] getWidgets() {
		if (wrapped != null) {
			final IWidget[][] widgets = wrapped.get().getWidgets();
			if (widgets == null) {
				return null;
			}
			final Widget[][] wrapped = new Widget[widgets.length][];
			for (int i = 0; i < widgets.length; i++) {
				final IWidget[] sub = widgets[i];
				if (sub == null) {
					wrapped[i] = null;
					continue;
				}

				final Widget[] sub2 = new Widget[sub.length];
				for (int i2 = 0; i2 < sub.length; i2++) {
					sub2[i2] = new Widget(sub[i2]);
				}
				wrapped[i] = sub2;
			}
			return wrapped;
		}

		final Object[][] arr = reflector.access(this, ah, Object[][].class);
		if (arr == null) {
			return null;
		}
		final Widget[][] arr2 = new Widget[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			final Object[] sub = arr[i];
			if (sub == null) {
				arr2[i] = null;
				continue;
			}
			final Widget[] sub2 = new Widget[sub.length];
			arr2[i] = sub2;
			for (int i2 = 0; i2 < sub.length; i2++) {
				sub2[i2] = new Widget(reflector, sub[i2]);
			}
		}
		return arr2;
	}

	public HashTable getWidgetTable() {
		if (wrapped != null) {
			return new HashTable(wrapped.get().getWidgetTable());
		}

		return new HashTable(reflector, reflector.access(this, ai));
	}

	public NodeDeque[][][] getGroundItems() {
		if (wrapped != null) {
			final INodeDeque[][][] items = wrapped.get().getGroundItems();
			if (items == null) {
				return null;
			}

			final NodeDeque[][][] wrapped = new NodeDeque[items.length][][];
			for (int i = 0; i < items.length; i++) {
				final INodeDeque[][] sub = items[i];
				if (sub == null) {
					wrapped[i] = null;
					continue;
				}

				final NodeDeque[][] sub2 = new NodeDeque[sub.length][];
				wrapped[i] = sub2;
				for (int i2 = 0; i2 < sub.length; i2++) {
					final INodeDeque[] sub2_1 = sub[i2];
					if (sub2_1 == null) {
						sub2[i] = null;
						continue;
					}
					final NodeDeque[] sub2_2 = new NodeDeque[sub2_1.length];
					sub2[i2] = sub2_2;
					for (int i3 = 0; i3 < sub2_1.length; i3++) {
						sub2_2[i3] = new NodeDeque(sub2_1[i3]);
					}
				}
			}
			return wrapped;
		}

		final Object[][][] arr = reflector.access(this, aj, Object[][][].class);
		if (arr == null) {
			return null;
		}
		final NodeDeque[][][] arr2 = new NodeDeque[arr.length][][];
		for (int i = 0; i < arr.length; i++) {
			final Object[][] sub = arr[i];
			if (sub == null) {
				arr2[i] = null;
				continue;
			}
			final NodeDeque[][] sub2 = new NodeDeque[sub.length][];
			arr2[i] = sub2;
			for (int i2 = 0; i2 < sub.length; i2++) {
				final Object[] sub2_1 = sub[i2];
				if (sub2_1 == null) {
					sub2[i] = null;
					continue;
				}
				final NodeDeque[] sub2_2 = new NodeDeque[sub2_1.length];
				sub2[i2] = sub2_2;
				for (int i3 = 0; i3 < sub2_1.length; i3++) {
					sub2_2[i3] = new NodeDeque(reflector, sub2_1[i3]);
				}
			}
		}
		return arr2;
	}

	public CollisionMap[] getCollisionMaps() {
		if (wrapped != null) {
			final ICollisionMap[] maps = wrapped.get().getCollisionMaps();
			final CollisionMap[] wrapped = maps != null ? new CollisionMap[maps.length] : null;
			if (maps != null) {
				for (int i = 0; i < maps.length; i++) {
					wrapped[i] = new CollisionMap(maps[i]);
				}
			}
			return wrapped;
		}

		final Object[] arr = reflector.access(this, ak, Object[].class);
		final CollisionMap[] arr2 = arr != null ? new CollisionMap[arr.length] : null;
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = new CollisionMap(reflector, arr[i]);
			}
		}
		return arr2;
	}

	public int[] getVarpbits() {
		if (wrapped != null) {
			return wrapped.get().getVarpbits();
		}

		return reflector.accessInts(this, al);
	}

	public int getClientState() {
		if (wrapped != null) {
			return wrapped.get().getClientState();
		}

		return reflector.accessInt(this, am);
	}

	public int getCrosshairIndex() {
		if (wrapped != null) {
			return wrapped.get().getCrosshairIndex();
		}

		return reflector.accessInt(this, an);
	}

	public Cache getVarbitCache() {
		if (wrapped != null) {
			return new Cache(wrapped.get().getVarbitCache());
		}

		return new Cache(reflector, reflector.access(this, ao));
	}

	public Cache getNpcConfigCache() {
		if (wrapped != null) {
			return new Cache(wrapped.get().getNpcConfigCache());
		}

		return new Cache(reflector, reflector.access(this, ap));
	}

	public Cache getObjectConfigCache() {
		if (wrapped != null) {
			return new Cache(wrapped.get().getObjectConfigCache());
		}

		return new Cache(reflector, reflector.access(this, aq));
	}

	public Cache getItemConfigCache() {
		if (wrapped != null) {
			return new Cache(wrapped.get().getItemConfigCache());
		}

		return new Cache(reflector, reflector.access(this, ar));
	}

	public int[] getSkillLevels1() {
		if (wrapped != null) {
			return wrapped.get().getSkillLevels1();
		}

		return reflector.accessInts(this, as);
	}

	public int[] getSkillLevels2() {
		if (wrapped != null) {
			return wrapped.get().getSkillLevels2();
		}

		return reflector.accessInts(this, at);
	}

	public int[] getSkillExps() {
		if (wrapped != null) {
			return wrapped.get().getSkillExps();
		}

		return reflector.accessInts(this, au);
	}

	public int getCycle() {
		if (wrapped != null) {
			return wrapped.get().getCycle();
		}

		return reflector.accessInt(this, av);
	}

	public int getHintArrowNpcUid() {
		if (wrapped != null) {
			return wrapped.get().getHintArrowNpcUid();
		}

		return reflector.accessInt(this, aw);
	}

	public int getHintArrowPlayerUid() {
		if (wrapped != null) {
			return wrapped.get().getHintArrowPlayerUid();
		}

		return reflector.accessInt(this, ax);
	}

	public int getHintArrowType() {
		if (wrapped != null) {
			return wrapped.get().getHintArrowType();
		}

		return reflector.accessInt(this, ay);
	}

	public int getHintArrowX() {
		if (wrapped != null) {
			return wrapped.get().getHintArrowX();
		}

		return reflector.accessInt(this, az);
	}

	public int getHintArrowY() {
		if (wrapped != null) {
			return wrapped.get().getHintArrowY();
		}

		return reflector.accessInt(this, ba);
	}

	public int getSelectionType() {
		if (wrapped != null) {
			return wrapped.get().getSelectionType();
		}

		return reflector.accessInt(this, bb);
	}

	public int getSelectionIndex() {
		if (wrapped != null) {
			return wrapped.get().getSelectionIndex();
		}

		return reflector.accessInt(this, bc);
	}

	public String getUsername() {
		final SecurityManager s = System.getSecurityManager();
		if (s != null) {
			s.checkPermission(new PrivateCredentialPermission("rt4 u \"*\"", "read"));
		}

		if (wrapped != null) {
			return wrapped.get().getUsername();
		}

		return reflector.accessString(this, bd);
	}

	public String getPassword() {
		final SecurityManager s = System.getSecurityManager();
		if (s != null) {
			s.checkPermission(new PrivateCredentialPermission("rt4 p \"*\"", "read"));
		}

		if (wrapped != null) {
			return wrapped.get().getPassword();
		}

		return reflector.accessString(this, be);
	}

	public int getPlayerIndex() {
		if (wrapped != null) {
			return wrapped.get().getPlayerIndex();
		}

		return reflector.accessInt(this, bf);
	}

	public int getRunPercentage() {
		if (wrapped != null) {
			return wrapped.get().getRunPercentage();
		}

		return reflector.accessInt(this, bg);
	}

	public EntryList getLoggerEntries() {
		if (wrapped != null) {
			return new EntryList(wrapped.get().getLoggerEntries());
		}

		return new EntryList(reflector, reflector.access(this, bh));
	}

	public int getLoginState() {
		if (wrapped != null) {
			return wrapped.get().getLoginState();
		}

		return reflector.accessInt(this, bi);
	}

	public int getLoginField() {
		if (wrapped != null) {
			return wrapped.get().getLoginField();
		}

		return reflector.accessInt(this, bj);
	}

	public boolean isWorldSelectionUp() {
		if (wrapped != null) {
			//TODO support this
			return false;
		}

		return reflector.accessBool(this, bk);
	}

	public int getTileSize() {
		if (wrapped != null) {
			return wrapped.get().getTileSize();
		}

		return reflector.accessInt(this, bl);
	}

	public int getNpcCount() {
		if (wrapped != null) {
			return wrapped.get().getNpcCount();
		}

		return reflector.accessInt(this, bm);
	}

	public int getPlayerCount() {
		if (wrapped != null) {
			return wrapped.get().getPlayerCount();
		}

		return reflector.accessInt(this, bn);
	}

	public Cache getPlayerModelCache() {
		if (wrapped != null) {
			return new Cache(wrapped.get().getPlayerModelCache());
		}

		return new Cache(reflector, reflector.access(this, bq));
	}

	public Cache getObjectModelCache() {
		if (wrapped != null) {
			return new Cache(wrapped.get().getObjectModelCache());
		}

		return new Cache(reflector, reflector.access(this, br));
	}

	public Cache getNpcModelCache() {
		if (wrapped != null) {
			return new Cache(wrapped.get().getNpcModelCache());
		}

		return new Cache(reflector, reflector.access(this, bs));
	}

	public Cache getWidgetModelCache() {
		if (wrapped != null) {
			return new Cache(wrapped.get().getWidgetModelCache());
		}

		return new Cache(reflector, reflector.access(this, bt));
	}

	public Cache getGroundItemModelCache() {
		if (wrapped != null) {
			return new Cache(wrapped.get().getGroundItemModelCache());
		}

		return new Cache(reflector, reflector.access(this, bu));
	}
}
