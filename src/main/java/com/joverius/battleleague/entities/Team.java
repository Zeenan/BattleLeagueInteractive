package com.joverius.battleleague.entities;

import java.util.List;

public class Team extends BaseEntity {


	private int id;
	
	private String teamName;
	
	private int upcomingOpponent;
	
	private int currentOpponent;
	
	private int score;
	
	private String clanTag;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUpcomingOpponent() {
		return upcomingOpponent;
	}

	public void setUpcomingOpponent(int upcomingOpponent) {
		this.upcomingOpponent = upcomingOpponent;
	}

	public int getCurrentOpponent() {
		return currentOpponent;
	}

	public void setCurrentOpponent(int currentOpponent) {
		this.currentOpponent = currentOpponent;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getClanTag() {
		return clanTag;
	}

	public void setClanTag(String clanTag) {
		this.clanTag = clanTag;
	}

}
