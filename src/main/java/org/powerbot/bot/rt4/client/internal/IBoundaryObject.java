package org.powerbot.bot.rt4.client.internal;

public interface IBoundaryObject extends IBasicObject {

	int getMeta();

	IRenderable getRenderable1();

	IRenderable getRenderable2();

	long getUid();

}