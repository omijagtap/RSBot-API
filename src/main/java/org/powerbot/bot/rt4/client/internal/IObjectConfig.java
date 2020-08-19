package org.powerbot.bot.rt4.client.internal;

public interface IObjectConfig extends IEntry {

	int getVarpbitIndex();

	String getName();

	int getVarbit();

	String[] getActions();

	int[] getConfigs();

}