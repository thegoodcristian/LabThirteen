package com.RockPaperScissors;

public class RochamboResult {

	static int winCounter;
	
	public static int displayResult(Rochambo userValue, Rochambo opponentValue) {
		
		if (userValue == Rochambo.ROCK && opponentValue == Rochambo.ROCK) {
			System.out.println("Tie!");
		} else if (userValue == Rochambo.ROCK && opponentValue == Rochambo.PAPER) {
			System.out.println("You lost!");
			winCounter--;
		} else if (userValue == Rochambo.ROCK && opponentValue == Rochambo.SCISSORS) {
			System.out.println("You won!");
			winCounter++;
		} else if (userValue == Rochambo.PAPER && opponentValue == Rochambo.ROCK) {
			System.out.println("You won!");
			winCounter++;
		} else if (userValue == Rochambo.PAPER && opponentValue == Rochambo.PAPER) {
			System.out.println("Tie!");
		} else if (userValue == Rochambo.PAPER && opponentValue == Rochambo.SCISSORS) {
			System.out.println("You lost!");
			winCounter--;
		} else if (userValue == Rochambo.SCISSORS && opponentValue == Rochambo.ROCK) {
			System.out.println("You lost!");
			winCounter--;
		} else if (userValue == Rochambo.SCISSORS && opponentValue == Rochambo.PAPER) {
			System.out.println("You won!");
			winCounter++;
		} else if (userValue == Rochambo.SCISSORS && opponentValue == Rochambo.SCISSORS) {
			System.out.println("Tie!");
		}
		
		return winCounter;
	}

}
