/**
 * 
 */
package com.devpredator.tutorial.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.tutorial.entities.Match;
import com.devpredator.tutorial.entities.Stadium;
import com.devpredator.tutorial.entities.Team;
import com.devpredator.tutorial.services.MatchService;

/**
 * @author DevPredator
 * @version 1.0 26/04/2021
 * 
 * Clase que implementa los servicios de los partidos.
 */
public class MatchServiceImpl implements MatchService {

	@Override
	public List<Match> findMatches() throws Exception {
		
		Team homeTeam = new Team();
		Team awayTeam = new Team();
		
		homeTeam.setName("Barcelona");
		awayTeam.setName("Real Madrid");
		
		Match match = new Match();
		match.setLocalTeam(homeTeam);
		match.setAwayTeam(awayTeam);
		match.setScore("2 - 2");
		
		Stadium stadium = new Stadium();
		stadium.setName("Lisboa Stadium");
		
		match.setStadium(stadium);
		
		List<Match> matches = new ArrayList<Match>();
//		matches.add(match);
		
		if (matches.size() == 0) {
			//Provocando la excepcion.
			throw new Exception();
		}
		
		return matches;
		
	}

}
