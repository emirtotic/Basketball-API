package com.basket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basket.entity.Player;
import com.basket.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepo;
	
	public List<Player> getAllPlayers() {

		List<Player> list = new ArrayList<Player>();

		playerRepo.findAll().forEach(list::add);

		return list;

	}

	public Player getPlayer(int id) {

		Player player = playerRepo.findById(id).orElse(null);

		return player;

	}

	public void addPlayer(Player player) {
		
		playerRepo.save(player);
	}

	public void updatePlayer(Player player, int id) {
		
		playerRepo.save(player);
	}

	public void deletePlayer(int id) {
		playerRepo.deleteById(id);
	}

}
