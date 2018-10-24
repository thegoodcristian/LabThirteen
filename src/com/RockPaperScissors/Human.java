package com.RockPaperScissors;

import java.util.Scanner;

public class Human extends Player {

	private Scanner scnr;

	@Override
	public Rochambo generateRochambo() {
		scnr = new Scanner(System.in);
		String userInput = Validator.getString(scnr, "Please enter rock, paper, or scissors in the format of R/P/S");
		if (userInput.equalsIgnoreCase("R")) {
			return Rochambo.ROCK;
		} else if (userInput.equalsIgnoreCase("P")) {
			return Rochambo.PAPER;
		} else if (userInput.equalsIgnoreCase("S")) {
			return Rochambo.SCISSORS;
		} else {
			return null;
		}
	}

}
