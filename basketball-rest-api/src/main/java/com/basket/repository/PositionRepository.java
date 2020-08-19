package com.basket.repository;

import org.springframework.data.repository.CrudRepository;

import com.basket.entity.Position;

public interface PositionRepository extends CrudRepository<Position, Integer> {

}
