/**
 * 
 */
package com.devpredator.tutorial.entities;

/**
 * @author DevPredator
 * @version 1.0 26/04/2021
 * 
 * Clase que representa entidades de equipos de futbol.
 */
public class Team {
	/**
	 * Nombre del equipo.
	 */
	private String name;
	/**
	 * Estadio del equipo
	 */
	private Stadium stadium;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the stadium
	 */
	public Stadium getStadium() {
		return stadium;
	}
	/**
	 * @param stadium the stadium to set
	 */
	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	} 
}