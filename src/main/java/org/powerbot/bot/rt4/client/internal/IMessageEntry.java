package org.powerbot.bot.rt4.client.internal;

public interface IMessageEntry extends IEntry {

	int getType();

	String getSender();

	String getMessage();

}