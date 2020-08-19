package org.powerbot.bot.rt4.client.internal;

public interface INpcConfig extends IEntry {

	int getId();

	String getName();

	String[] getActions();

	int getVarbit();

	int[] getConfigs();

	int getLevel();

	int getVarpbitIndex();

}