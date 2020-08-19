package com.basket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basket.entity.Team;
import com.basket.service.TeamService;

@RestController
@RequestMapping("/")
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/teams")
	public List<Team> getTeams() {
		return teamService.getAllTeams();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/teams/{id}")
	public Team getTeam(@PathVariable int id) {
		return teamService.getTeamById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/teams")
	public void addTeam(@RequestBody Team team) {
		teamService.addTeam(team);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/teams/{id}")
	public void deleteTeam(@PathVariable int id) {
		teamService.deleteTeam(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/teams/{id}")
	public void updatePosition(@RequestBody Team team, @PathVariable int id) {
		teamService.updateTeam(team, id);
	}
	
}
