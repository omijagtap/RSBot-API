package org.powerbot.bot.rt4.client.internal;

public interface IProjectile extends IRenderable {

	boolean isStarted();

	int getStartY();

	int getStartX();

	int getOrientation();

	int getSlope();

	int getId();

	double getX();

	double getY();

	int getStartDistance();

	int getPlane();

	int getCycleStart();

	int getTargetIndex();

	int getEndHeight();

	int getCycleEnd();

}