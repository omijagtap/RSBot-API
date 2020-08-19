package org.powerbot.bot.rt4.client.internal;

public interface IPlayer extends IActor {

	IPlayerComposite getComposite();

	int getTeam();

	IStringRecord getName();

	int getCombatLevel();

}