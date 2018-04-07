package com.sniper.bunkers.objects;

public enum Team {

	GREEN("Green", false),
	RED("Red", false),
	YELLOW("Yellow", false),
	BLUE("Blue", false),
	SPECTATOR("Spectator", true),
	KOTH("KoTH Zone", true);
	
	private String name;
	private boolean stale;
	
	
	
	
	private Team(String name, boolean stale) {
		/*
		 * @param stale means if it has DTR
		 */
		this.name= name;
		this.stale = stale;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isStale() {
		return stale;
	}
	
	
}
