/**
 * 
 */
package com.devpredator.tutorial.entities;

/**
 * @author DevPredator
 * @version 1.0 26/04/2021
 * 
 * Entidades que representan partidos de futbol.
 */
public class Match {
	/**
	 * Equipo local
	 */
	private Team localTeam;
	/**
	 * Equipo visitante.
	 */
	private Team awayTeam;
	/**
	 * Estadio del partido.
	 */
	private Stadium stadium;
	/**
	 * Resultado del partido.
	 */
	private String score;
	/**
	 * @return the localTeam
	 */
	public Team getLocalTeam() {
		return localTeam;
	}
	/**
	 * @param localTeam the localTeam to set
	 */
	public void setLocalTeam(Team localTeam) {
		this.localTeam = localTeam;
	}
	/**
	 * @return the awayTeam
	 */
	public Team getAwayTeam() {
		return awayTeam;
	}
	/**
	 * @param awayTeam the awayTeam to set
	 */
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
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
	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(String score) {
		this.score = score;
	}
}
