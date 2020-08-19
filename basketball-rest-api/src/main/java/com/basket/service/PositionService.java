package com.basket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basket.entity.Position;
import com.basket.repository.PositionRepository;

@Service
public class PositionService {

	
	@Autowired
	private PositionRepository positionRepo;

	public List<Position> getAllPositions() {

		List<Position> list = new ArrayList<Position>();

		positionRepo.findAll().forEach(list::add);

		return list;

	}

	public Position getPositionById(int id) {

		return positionRepo.findById(id).orElse(null);

	}

	public void addPosition(Position position) {
		positionRepo.save(position);
	}

	public void updatePosition(Position position, int id) {
		positionRepo.save(position);
	}

	public void deletePosition(int id) {
		positionRepo.deleteById(id);
	}
}
