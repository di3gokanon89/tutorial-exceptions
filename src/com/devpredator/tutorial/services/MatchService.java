/**
 * 
 */
package com.devpredator.tutorial.services;

import java.util.List;

import com.devpredator.tutorial.entities.Match;

/**
 * @author DevPredator
 * @version 1.0 26/04/2021
 * 
 * Interface que define los servicios para la logica de negocio de
 * los partidos de futbol.
 */
public interface MatchService {
	/**
	 * Metodo que permite buscar los partidos de futbol y sus marcadores.
	 * @return {@link List} lista de partidos.
	 */
	List<Match> findMatches() throws Exception;
	
}
