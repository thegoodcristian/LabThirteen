package com.RockPaperScissors;

public class RochamboResult {

	public static void displayResult(Rochambo userValue, Rochambo opponentValue) {
		
		if (userValue == Rochambo.ROCK && opponentValue == Rochambo.ROCK) {
			System.out.println("Tie!");
		} else if (userValue == Rochambo.ROCK && opponentValue == Rochambo.PAPER) {
			System.out.println("You lost!");
		} else if (userValue == Rochambo.ROCK && opponentValue == Rochambo.SCISSORS) {
			System.out.println("You won!");
		} else if (userValue == Rochambo.PAPER && opponentValue == Rochambo.ROCK) {
			System.out.println("You won!");
		} else if (userValue == Rochambo.PAPER && opponentValue == Rochambo.PAPER) {
			System.out.println("Tie!");
		} else if (userValue == Rochambo.PAPER && opponentValue == Rochambo.SCISSORS) {
			System.out.println("You lost!");
		} else if (userValue == Rochambo.SCISSORS && opponentValue == Rochambo.ROCK) {
			System.out.println("You lost!");
		} else if (userValue == Rochambo.SCISSORS && opponentValue == Rochambo.PAPER) {
			System.out.println("You won!");
		} else if (userValue == Rochambo.SCISSORS && opponentValue == Rochambo.SCISSORS) {
			System.out.println("Tie!");
		}
	}

}
