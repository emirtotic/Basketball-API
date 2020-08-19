package com.basket.repository;

import org.springframework.data.repository.CrudRepository;

import com.basket.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
