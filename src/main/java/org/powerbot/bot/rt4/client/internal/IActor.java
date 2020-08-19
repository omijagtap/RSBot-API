package org.powerbot.bot.rt4.client.internal;

public interface IActor extends IRenderable {

	ILinkedList getCombatStatusList();

	int getAnimation();

	int getHeight();

	String getOverheadMessage();

	int getInteractingIndex();

	int getOrientation();

	int getSpeed();

	int getX();

	int getZ();

}