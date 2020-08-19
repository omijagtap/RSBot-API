package org.powerbot.bot.rt4.client.internal;

public interface IClient {

	ICache getPlayerModelCache();

	INodeDeque getProjectiles();

	INodeDeque[][][] getGroundItems();

	int getHintArrowX();

	int getRunPercentage();

	int getSelectionIndex();

	int[] getSkillLevels1();

	int[] getSkillExps();

	String getLoginMessage1();

	String getLoginMessage2();

	String getLoginMessage3();

	IEntryList getLoggerEntries();

	ICache getVarbitCache();

	int[] getWidgetBoundsHeight();

	int[] getWidgetBoundsWidth();

	String getPassword();

	int getHintArrowY();

	int getPlayerIndex();

	int getPlayerCount();

	int getSelectionType();

	int getHintArrowNpcUid();

	int getHintArrowPlayerUid();

	int getTileSize();

	int[] getSkillLevels2();

	int getDestinationY();

	int[] getVarpbits();

	int getCrosshairIndex();

	IWidget[][] getWidgets();

	ICache getObjectConfigCache();

	ICache getObjectModelCache();

	ICache getNpcModelCache();

	ICache getNpcConfigCache();

	int getHintArrowType();

	boolean isMenuOpen();

	int getMenuX();

	String[] getMenuActions();

	int[] getWidgetBoundsY();

	int[] getWidgetBoundsX();

	IHashTable getWidgetTable();

	int getDestinationX();

	ICache getItemConfigCache();

	ICache getGroundItemModelCache();

	INpc[] getNpcs();

	boolean isMembers();

	int getMinimapAngle();

	int getMenuHeight();

	int getNpcCount();

	byte[][][] getLandscapeMeta();

	String[] getMenuOptions();

	int getLoginField();

	ICache getWidgetModelCache();

	ICollisionMap[] getCollisionMaps();

	int getMenuWidth();

	int getMenuY();

	int[] getPlayerIndices();

	String getUsername();

	ILandscape getLandscape();

	int[] getNpcIndices();

	int getCameraPitch();

	int getCameraY();

	int getCameraYaw();

	int getCycle();

	int getCameraZ();

	int getCameraX();

	IPlayer[] getPlayers();

	int[][][] getTileHeights();

	int getOffsetY();

	int getLoginState();

	int getFloor();

	int getClientState();

	int getMenuCount();

	int getOffsetX();

	IPlayer getPlayer();

}