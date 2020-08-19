package com.basket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basket.entity.Player;
import com.basket.service.PlayerService;

@RestController
@RequestMapping("/")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@RequestMapping(method = RequestMethod.GET, value = "/players")
	public List<Player> getPlayers() {
		return playerService.getAllPlayers();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/players/{id}")
	public Player getPlayer(@PathVariable int id) {
		return playerService.getPlayer(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/players")
	public void addPlayer(@RequestBody Player player) {
		playerService.addPlayer(player);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/players/{id}")
	public void deletePlayer(@PathVariable int id) {
		playerService.deletePlayer(id);
	}

	@RequestMapping(method = RequestMethod.PATCH, value = "/players/{id}")
	public void updatePlayer(@RequestBody Player player, @PathVariable int id) {
		playerService.updatePlayer(player, id);
	}

}
