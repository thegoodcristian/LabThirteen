package com.RockPaperScissors;

import java.util.Scanner;

public class RochamboApp {

	public static void main(String[] args) {
			// Declare/initialize variables
			Scanner scnr = new Scanner(System.in);
			Player user = new Human();
			Player opponent;
			Rochambo userValue;
			Rochambo opponentValue;
			String userName;
		
			//Prompt user to enter name. Validate input.
			userName = Validator.getString(scnr,  "Please enter your name: ");
			user.setName(userName);
			
			//I set up a loop which will prompt the user to continue
			
			String cont = "yes";
			while (cont.equalsIgnoreCase("yes")) {
			
			
			//Prompt user to select opponent. Validate input.
			String userChoice = Validator.getString(scnr, "\nHi, " + userName + "!\nWould you like to play against the Dogs or the Cats? D/C: ");
				if (userChoice.equalsIgnoreCase("d")){
					opponent = new Dummy();
				} else if (userChoice.equalsIgnoreCase("c")){
					opponent = new Brainy();
				} else {
					opponent = new Brainy();
				}
			
			
			//Prompt user to select rock, paper, or scissors. Validate input.
			userValue = user.generateRochambo();
			user.setValue(userValue);
				
				
			//Display opponent's choice
			opponentValue = opponent.generateRochambo();
			opponent.setValue(opponentValue);
			//opponentValue = opponent.getValue();
			System.out.println("Opponent's choice was " + opponentValue);
		
			//Display user's choice
			//userValue = user.getValue();
			System.out.println("Your choice was " + userValue);
			
			//Display results of match. Write a separate method.
			RochamboResult.displayResult(userValue, opponentValue);
			
			// I ask if the user if they would like to continue, if "yes", while loop will
			// begin again.

			cont = Validator.getString(scnr, "\nWould you like to continue? (yes/no)");
			while (!cont.equalsIgnoreCase("yes") && !cont.equalsIgnoreCase("no")) {
				System.out.println("\nPlease only enter yes/no: ");
				cont = Validator.getString(scnr, "\nWould you like to continue? (yes/no)");
			}
			
			
		}

		// Otherwise, I bid farewell to the user. I close the scanner to avoid resource
		// leak.

		System.out.println("\nGoodbye!");
		scnr.close();
		
	}

}
