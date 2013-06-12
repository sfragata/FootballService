/**
 * 
 */
package com.sfragata.football.ws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sfragata.football.model.Team;
import com.sfragata.football.ws.FootballService;
import com.sfragata.football.ws.client.ArrayOftTeamInfo;
import com.sfragata.football.ws.client.Info;
import com.sfragata.football.ws.client.TTeamInfo;

/**
 * Football service's implementation
 * 
 * @author Silvio Fragata Silva
 */
@WebService(endpointInterface = "com.sfragata.football.ws.FootballService", serviceName = "FootballService", targetNamespace = "http://sfragata.com/services/FootballService")
public class FootballServiceImpl implements FootballService {

	private final static Log LOG = LogFactory.getLog(FootballServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sfragata.football.ws.FootballService#getAllTeams()
	 */
	@Override
	public List<Team> getAllTeams() {
		List<Team> teams = new ArrayList<>();

		Info info = new Info();
		ArrayOftTeamInfo arrayTeams = info.getInfoSoap().teams();
		try {
			if (arrayTeams != null) {
				List<TTeamInfo> teamsInfo = arrayTeams.getTTeamInfo();
				for (TTeamInfo tTeamInfo : teamsInfo) {
					teams.add(new Team(tTeamInfo.getIId(),
							tTeamInfo.getSName(), new URL(tTeamInfo
									.getSCountryFlagLarge())));
				}
			}
		} catch (MalformedURLException | NullPointerException e) {
			LOG.error("Error", e);
		}
		if (LOG.isDebugEnabled()) {
			LOG.debug(teams);
		}
		return teams;
	}
}
