package org.powerbot.bot.rt4.client.internal;

public interface IWidget extends INode {

	int getBoundsIndex();

	int getTextColor();

	int getBorderThickness();

	String getTooltip();

	int getTextureId();

	String[] getActions();

	String getText();

	IWidget[] getChildren();

	int getY();

	int[] getItemIds();

	int getAngleZ();

	int getModelType();

	int[] getItemStackSizes();

	int getParentId();

	int getScrollHeight();

	int getScrollWidth();

	int getScrollX();

	int getAngleY();

	int getItemStackSize();

	boolean isHidden();

	int getModelId();

	int getScrollY();

	int getX();

	int getContentType();

	int getType();

	int getWidth();

	int getAngleX();

	int getItemId();

	int getModelZoom();

	int getHeight();

	int getId();

}