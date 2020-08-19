package org.powerbot.bot.rt4.client.internal;

public interface ITile extends INode {

	IItemPile getItemPile();

	IWallObject getWallObject();

	IGameObject[] getGameObjects();

	IFloorObject getFloorObject();

	IBoundaryObject getBoundaryObject();

	int getGameObjectLength();

}