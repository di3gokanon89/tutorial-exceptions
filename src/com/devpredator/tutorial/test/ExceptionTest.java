/**
 * 
 */
package com.devpredator.tutorial.test;

import java.util.List;

import com.devpredator.tutorial.entities.Match;
import com.devpredator.tutorial.services.MatchService;
import com.devpredator.tutorial.services.impl.MatchServiceImpl;

/**
 * @author DevPredator
 * @version 1.0 26/04/2021
 * 
 * Clase principal de la aplicacion.
 */
public class ExceptionTest {
	/**
	 * Metodo que ejecuta la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		
		// :::::::: EXCEPCIONES :::::::::::::
		
		MatchService matchService = new MatchServiceImpl();
		
		try {
			List<Match> matchesDB = matchService.findMatches();
			
			for (Match match : matchesDB) {
				System.out.println("Home Team: " + match.getLocalTeam().getName());
				System.out.println("Away Team: " + match.getAwayTeam().getName());
				System.out.println("Stadium: " + match.getStadium().getName());
				System.out.println("Score: " + match.getScore());
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
