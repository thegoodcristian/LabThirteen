package com.RockPaperScissors;

public class Brainy extends Player {

	@Override
	public Rochambo generateRochambo() {
		int randNum = (int) (Math.random() * 3);
		switch(randNum) {
		
			case 0:
				return Rochambo.ROCK;
			case 1:
				return Rochambo.PAPER;
			case 2:
				return Rochambo.SCISSORS;
			default:
				return null;
		}
	}

	
	
}
