package org.powerbot.bot.rt4.client;

import org.powerbot.bot.*;
import org.powerbot.bot.rt4.client.internal.IWidget;

public class Widget extends Proxy<IWidget> {
	private static final Reflector.FieldCache a = new Reflector.FieldCache(),
			b = new Reflector.FieldCache(),
			c = new Reflector.FieldCache(),
			d = new Reflector.FieldCache(),
			e = new Reflector.FieldCache(),
			f = new Reflector.FieldCache(),
			g = new Reflector.FieldCache(),
			h = new Reflector.FieldCache(),
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
			ae = new Reflector.FieldCache();

	public Widget(final Reflector engine, final Object parent) {
		super(engine, parent);
	}

	public Widget(final IWidget wrapped) {
		super(wrapped);
	}

	public int getX() {
		if (wrapped != null) {
			return wrapped.get().getX();
		}

		return reflector.accessInt(this, a);
	}

	public int getY() {
		if (wrapped != null) {
			return wrapped.get().getY();
		}

		return reflector.accessInt(this, b);
	}

	public int getWidth() {
		if (wrapped != null) {
			return wrapped.get().getWidth();
		}

		return reflector.accessInt(this, c);
	}

	public int getHeight() {
		if (wrapped != null) {
			return wrapped.get().getHeight();
		}

		return reflector.accessInt(this, d);
	}

	public int getBorderThickness() {
		if (wrapped != null) {
			return wrapped.get().getBorderThickness();
		}

		return reflector.accessInt(this, e);
	}

	public int getType() {
		if (wrapped != null) {
			return wrapped.get().getType();
		}

		return reflector.accessInt(this, f);
	}

	public int getId() {
		if (wrapped != null) {
			return wrapped.get().getId();
		}

		return reflector.accessInt(this, g);
	}

	public int getParentId() {
		if (wrapped != null) {
			return wrapped.get().getParentId();
		}

		return reflector.accessInt(this, h);
	}

	public Widget[] getChildren() {
		if (wrapped != null) {
			final IWidget[] widgets = wrapped.get().getChildren();
			final Widget[] wrapped = widgets != null ? new Widget[widgets.length] : null;
			if (widgets != null) {
				for (int i = 0; i < widgets.length; i++) {
					wrapped[i] = new Widget(widgets[i]);
				}
			}

			return wrapped;
		}

		final Object[] arr = reflector.access(this, i, Object[].class);
		final Widget[] arr2 = arr != null ? new Widget[arr.length] : null;
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = new Widget(reflector, arr[i]);
			}
		}
		return arr2;
	}

	public int getContentType() {
		if (wrapped != null) {
			return wrapped.get().getContentType();
		}

		return reflector.accessInt(this, j);
	}

	public int getModelId() {
		if (wrapped != null) {
			return wrapped.get().getModelId();
		}

		return reflector.accessInt(this, k);
	}

	public int getModelType() {
		if (wrapped != null) {
			return wrapped.get().getModelType();
		}

		return reflector.accessInt(this, l);
	}

	public int getModelZoom() {
		if (wrapped != null) {
			return wrapped.get().getModelZoom();
		}

		return reflector.accessInt(this, m);
	}

	public String[] getActions() {
		if (wrapped != null) {
			return wrapped.get().getActions();
		}

		return reflector.access(this, n, String[].class);
	}

	public int getAngleX() {
		if (wrapped != null) {
			return wrapped.get().getAngleX();
		}

		return reflector.accessInt(this, o);
	}

	public int getAngleY() {
		if (wrapped != null) {
			return wrapped.get().getAngleY();
		}

		return reflector.accessInt(this, p);
	}

	public int getAngleZ() {
		if (wrapped != null) {
			return wrapped.get().getAngleZ();
		}

		return reflector.accessInt(this, q);
	}

	public String getText() {
		if (wrapped != null) {
			return wrapped.get().getText();
		}

		return reflector.accessString(this, r);
	}

	public int getTextColor() {
		if (wrapped != null) {
			return wrapped.get().getTextColor();
		}

		return reflector.accessInt(this, s);
	}

	public int getScrollX() {
		if (wrapped != null) {
			return wrapped.get().getScrollX();
		}

		return reflector.accessInt(this, t);
	}

	public int getScrollY() {
		if (wrapped != null) {
			return wrapped.get().getScrollY();
		}

		return reflector.accessInt(this, u);
	}

	public int getScrollWidth() {
		if (wrapped != null) {
			return wrapped.get().getScrollWidth();
		}

		return reflector.accessInt(this, v);
	}

	public int getScrollHeight() {
		if (wrapped != null) {
			return wrapped.get().getScrollHeight();
		}

		return reflector.accessInt(this, w);
	}

	public int getBoundsIndex() {
		if (wrapped != null) {
			return wrapped.get().getBoundsIndex();
		}

		return reflector.accessInt(this, x);
	}

	public int getTextureId() {
		if (wrapped != null) {
			return wrapped.get().getTextureId();
		}

		return reflector.accessInt(this, y);
	}

	public int[] getItemIds() {
		if (wrapped != null) {
			return wrapped.get().getItemIds();
		}

		return reflector.accessInts(this, z);
	}

	public int[] getItemStackSizes() {
		if (wrapped != null) {
			return wrapped.get().getItemStackSizes();
		}

		return reflector.accessInts(this, aa);
	}

	public boolean isHidden() {
		if (wrapped != null) {
			return wrapped.get().isHidden();
		}

		return reflector.accessBool(this, ab);
	}

	public String getTooltip() {
		if (wrapped != null) {
			return wrapped.get().getTooltip();
		}

		return reflector.accessString(this, ac);
	}

	public int getItemId() {
		if (wrapped != null) {
			return wrapped.get().getItemId();
		}

		return reflector.accessInt(this, ad);
	}

	public int getItemStackSize() {
		if (wrapped != null) {
			return wrapped.get().getItemStackSize();
		}

		return reflector.accessInt(this, ae);
	}
}
