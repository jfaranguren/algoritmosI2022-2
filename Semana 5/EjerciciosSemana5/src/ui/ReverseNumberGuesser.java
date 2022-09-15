package ui;

import java.util.Random;
import java.util.Scanner;

public class ReverseNumberGuesser {

	public static Scanner reader = new Scanner(System.in);
	public static Random rand = new Random();
	public static int triedNumbers[] = new int[] { -1, -1, -1 };

	public static void main(String[] args) {

		System.out.println("Guess a number");
		if (guess()) {
			System.out.println("The machine guessed the right number!");
		} else {
			System.out.println("The machine didn't guess the right number after 3 tries");
		}

	}

	public static boolean guess() {
		int numberOfGuess = 0;
		int randomNumber = 0;
		int userAnswer;
		boolean usedNumber = true;
		int usedNumbersCount = 0;
		boolean won = false;
		
		while (numberOfGuess < 3 && !won) {
			
			usedNumbersCount = 0;
			usedNumber = true;
			
			while (usedNumber) {
				randomNumber = rand.nextInt(5);
				System.out.println("random number" + randomNumber);
				for (int i = 0; i < triedNumbers.length; i++) {
					if (randomNumber == triedNumbers[i]) {
						usedNumbersCount++;
					}

				}
				if (usedNumbersCount != 0) {
					usedNumber = true;
				} else {
					usedNumber = false;
				}
			}

			

			System.out.println("Is your number " + randomNumber + "?\n" + "1: Yes\n" + "2: No\n");
			userAnswer = reader.nextInt();
			if (userAnswer == 2) {
				numberOfGuess++;
				System.out.println("number of guess " + numberOfGuess);
				triedNumbers[numberOfGuess - 1] = randomNumber;
				System.out.println("En arreglo memoria " + triedNumbers[numberOfGuess - 1]);

			} else {
				won = true;
				numberOfGuess = 10;
			}
		}

		return won;
	}

}
