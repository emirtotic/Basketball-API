package com.basket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basket.entity.Position;
import com.basket.service.PositionService;


@RestController
@RequestMapping("/")
public class PositionController {

	@Autowired
	private PositionService positionService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/positions")
	public List<Position> getPosition() {
		return positionService.getAllPositions();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/positions/{id}")
	public Position getPosition(@PathVariable int id) {
		return positionService.getPositionById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/positions")
	public void addPosition(@RequestBody Position position) {
		positionService.addPosition(position);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/positions/{id}")
	public void deletePosition(@PathVariable int id) {
		positionService.deletePosition(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/positions/{id}")
	public void updatePosition(@RequestBody Position position, @PathVariable int id) {
		positionService.updatePosition(position, id);
	}
	
	
}
