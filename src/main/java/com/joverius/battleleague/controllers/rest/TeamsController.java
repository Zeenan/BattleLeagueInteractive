package com.joverius.battleleague.controllers.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joverius.battleleague.controllers.BaseController;
import com.joverius.battleleague.entities.BaseEntity;
import com.joverius.battleleague.entities.Team;
import com.joverius.battleleague.factory.TeamFactory;
import com.joverius.battleleague.util.RestResponseAssembler;

@RestController
@RequestMapping("/teams")
public class TeamsController extends BaseController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<BaseEntity> pullTeams(
            HttpServletRequest request,
            HttpServletResponse response){
		
		List<Team> teams = null;
		
		try {
			
			// hard coded data
			teams = new ArrayList<Team>();
			teams.add(TeamFactory.getTeam(1, "Team A", 0));
			teams.add(TeamFactory.getTeam(2, "Team B", 5));
			teams.add(TeamFactory.getTeam(3, "Team C", 10));
			
		}
		
		catch(Exception e) {
			
		}
		
		return RestResponseAssembler.getResponse(new BaseEntity(teams));
		
    }
	

	@RequestMapping(value = "/{teamId}", method = RequestMethod.GET)
    public ResponseEntity<BaseEntity> pullTeam(
    		@PathVariable Integer teamId,
            HttpServletRequest request,
            HttpServletResponse response){
		
		
		
		return null;
		
    }
	
	@RequestMapping(value = "/{teamId}/members", method = RequestMethod.GET)
    public ResponseEntity<BaseEntity> pullTeamMembers(
    		@PathVariable Integer teamId,
            HttpServletRequest request,
            HttpServletResponse response){
		
		
		
		return null;
		
    }

}
