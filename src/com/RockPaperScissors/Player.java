package com.RockPaperScissors;

public abstract class Player {

	private String name;
	private Rochambo value;
	
	public abstract Rochambo generateRochambo();
	
	public Player() {

	}


	public Player(String name, Rochambo value) {
		this.name = name;
		this.value = value;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Rochambo getValue() {
		return value;
	}


	public void setValue(Rochambo value) {
		this.value = value;
	}
	
	
	
	
}
