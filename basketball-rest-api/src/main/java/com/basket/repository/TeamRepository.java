package com.basket.repository;

import org.springframework.data.repository.CrudRepository;

import com.basket.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Integer> {

}
