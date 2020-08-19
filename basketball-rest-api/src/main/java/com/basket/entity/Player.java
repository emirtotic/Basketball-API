package com.basket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;

	@Column(name = "team_id")
	private int team_id;

	@Column(name = "position_id")
	private int position_id;

	public Player() {

	}

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position_id;
	}

	public void setPosition(int position_id) {
		this.position_id = position_id;
	}

	public int getTeam() {
		return team_id;
	}

	public void setTeam(int team_id) {
		this.team_id = team_id;
	}

}
