package com.joverius.battleleague.entities;

public class Match extends BaseEntity {
	
	private int id;
	
	private int matchType; // 1 = lol, 2 = csgo, 3 = dota2 | this is for ease of filtering
	
	private int teamA;
	
	private int teamB;
	
	private boolean teamAWins;
	
	private boolean isOngoing;

}
