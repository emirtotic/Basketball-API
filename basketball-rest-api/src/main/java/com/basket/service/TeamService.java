package com.basket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basket.entity.Team;
import com.basket.repository.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepo;

	public List<Team> getAllTeams() {

		List<Team> list = new ArrayList<Team>();

		teamRepo.findAll().forEach(list::add);

		return list;
	}

	public Team getTeamById(int id) {

		Team team = teamRepo.findById(id).orElse(null);

		return team;

	}

	public void addTeam(Team team) {
		teamRepo.save(team);
	}

	public void updateTeam(Team team, int id) {
		teamRepo.save(team);
	}

	public void deleteTeam(int id) {
		teamRepo.deleteById(id);
	}
}
