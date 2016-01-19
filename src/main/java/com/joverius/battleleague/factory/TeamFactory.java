package com.joverius.battleleague.factory;

import com.joverius.battleleague.entities.Team;

public class TeamFactory {
	
	public static Team getTeam(int id, String name, int score) {
		
		Team newTeam = new Team();
		newTeam.setId(id);
		newTeam.setTeamName(name);
		newTeam.setScore(score);
		
		return newTeam;
		
	}

}
