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
import com.joverius.battleleague.entities.Match;
import com.joverius.battleleague.util.RestResponseAssembler;


@RestController
@RequestMapping("/matches")
public class MatchController extends BaseController {
	
	@RequestMapping(value = "/{matchType}", method = RequestMethod.GET)
    public ResponseEntity<BaseEntity> pullMatches(
    		@PathVariable Integer matchType,
            HttpServletRequest request,
            HttpServletResponse response){
		
		List<Match> matches = null;
		
		try {
			
			//list matches based on matchType param provided
			
			
		}
		
		catch(Exception e) {
			
		}
		
		return RestResponseAssembler.getResponse(new BaseEntity(matches));
		
    }

}
