/**
 * 
 */
package com.sfragata.football.ws;

import java.util.List;

import javax.jws.WebService;

import com.sfragata.football.model.Team;

/**
 * Football service's interface
 * 
 * @author Silvio Fragata Silva
 * 
 */
@WebService
public interface FootballService {

	public List<Team> getAllTeams();
}
