package com.bridgelabz;

import java.util.Scanner;
import java.util.Random;

public class TicTacToc {

	public static char[] gameBoard = new char[10];
	public static char userTurn;
	public static char computerTurn;
	public static char user = '1';
	public static int userPos;
	public static int computerPos;
	public static char exitCode = '0';
	public static int turnCount;
	public static Scanner scanner = new Scanner(System.in);

	public static void declareArray() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Tic-Tac-Toe game");
		for (int i = 0; i < gameBoard.length; i++) {

			gameBoard[i] = ' ';
		}

	}

	public static char user(Scanner scanner) {
		System.out.println("Enter your choice  X or O only");
		return scanner.next().toUpperCase().charAt(0);
	}

	public static void showBoard() {

		System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
		System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
		System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
	}

	public static void comLocation() {
		boolean flag = false;
		System.out.println("Player choose [0-8]");
		while (true) {
			Random rand = new Random();
			computerPos = rand.nextInt(9);
			switch (computerPos) {
			case 0:
				if (gameBoard[0] == ' ') {
					gameBoard[0] = computerTurn;
					flag = true;
				}
				break;

			case 1:
				if (gameBoard[1] == ' ') {
					gameBoard[1] = computerTurn;
					flag = true;
				}
				break;

			case 2:
				if (gameBoard[2] == ' ') {
					gameBoard[2] = computerTurn;
					flag = true;
				}
				break;

			case 3:
				if (gameBoard[3] == ' ') {
					gameBoard[3] = computerTurn;
					flag = true;
				}
				break;

			case 4:
				if (gameBoard[4] == ' ') {
					gameBoard[4] = computerTurn;
					flag = true;
				}
				break;

			case 5:
				if (gameBoard[5] == ' ') {
					gameBoard[5] = computerTurn;
					flag = true;
				}
				break;

			case 6:
				if (gameBoard[6] == ' ') {
					gameBoard[6] = computerTurn;
					flag = true;
				}
				break;

			case 7:
				if (gameBoard[7] == ' ') {
					gameBoard[7] = computerTurn;
					flag = true;
				}
				break;

			case 8:
				if (gameBoard[8] == ' ') {
					gameBoard[8] = computerTurn;
					flag = true;
				}
				break;

			}
			if (flag == true) {
				break;
			}

		}
	}

	public static void blockUser() {
		if (gameBoard[0] == userTurn && gameBoard[1] == userTurn) {
			gameBoard[2] = computerTurn;
		} else if (gameBoard[3] == userTurn && gameBoard[4] == userTurn) {
			gameBoard[5] = computerTurn;
		} else if (gameBoard[6] == userTurn && gameBoard[7] == userTurn) {
			gameBoard[8] = computerTurn;
		} else if (gameBoard[0] == userTurn && gameBoard[3] == userTurn) {
			gameBoard[6] = computerTurn;
		} else if (gameBoard[1] == userTurn && gameBoard[4] == userTurn) {
			gameBoard[7] = computerTurn;
		} else if (gameBoard[2] == userTurn && gameBoard[5] == userTurn) {
			gameBoard[8] = computerTurn;
		} else if (gameBoard[0] == userTurn && gameBoard[4] == userTurn) {
			gameBoard[8] = computerTurn;
		} else if (gameBoard[2] == userTurn && gameBoard[4] == userTurn) {
			gameBoard[6] = computerTurn;
		} else if (gameBoard[0] == userTurn && gameBoard[2] == userTurn) {
			gameBoard[1] = computerTurn;
		} else if (gameBoard[3] == userTurn && gameBoard[5] == userTurn) {
			gameBoard[4] = computerTurn;
		} else if (gameBoard[6] == userTurn && gameBoard[8] == userTurn) {
			gameBoard[7] = computerTurn;
		} else if (gameBoard[0] == userTurn && gameBoard[6] == userTurn) {
			gameBoard[3] = computerTurn;
		} else if (gameBoard[1] == userTurn && gameBoard[7] == userTurn) {
			gameBoard[4] = computerTurn;
		} else if (gameBoard[2] == userTurn && gameBoard[8] == userTurn) {
			gameBoard[5] = computerTurn;
		} else if (gameBoard[0] == userTurn && gameBoard[8] == userTurn) {
			gameBoard[4] = computerTurn;
		} else if (gameBoard[2] == userTurn && gameBoard[6] == userTurn) {
			gameBoard[4] = computerTurn;
		} else if (gameBoard[8] == userTurn && gameBoard[5] == userTurn) {
			gameBoard[2] = computerTurn;

		} else
			comLocation();
	}

	public static void winner(char symbol) {

		if (gameBoard[0] != ' ' && gameBoard[0] == gameBoard[1] && gameBoard[1] == gameBoard[2]) {
			if (gameBoard[0] == symbol) {
				System.out.println("\n\ncomputer ONE WINS THE GAME\n");
			} else {
				System.out.println("\n\nplayer WINS THE GAME\n");
			}
			exitCode = '1';

		} else if (gameBoard[3] != ' ' && gameBoard[3] == gameBoard[4] && gameBoard[4] == gameBoard[5]) {
			if (gameBoard[3] == symbol) {
				System.out.println("\n\ncomputer ONE WINS THE GAME\n");
			} else {
				System.out.println("\n\nplayer ONE WINS THE GAME\n");
			}
			exitCode = '1';
		} else if (gameBoard[7] != ' ' && gameBoard[6] == gameBoard[7] && gameBoard[7] == gameBoard[8]) {
			if (gameBoard[7] == symbol) {
				System.out.println("\n\ncomputer ONE WINS THE GAME\n");
			} else {
				System.out.println("\n\nplayer ONE WINS THE GAME\n");
			}
			exitCode = '1';
		} else if (gameBoard[6] != ' ' && gameBoard[0] == gameBoard[3] && gameBoard[3] == gameBoard[6]) {
			if (gameBoard[6] == symbol) {
				System.out.println("\n\ncomputer ONE WINS THE GAME\n");
			} else {
				System.out.println("\n\nplayer ONE WINS THE GAME\n");
			}
			exitCode = '1';
		} else if (gameBoard[1] != ' ' && gameBoard[1] == gameBoard[4] && gameBoard[4] == gameBoard[7]) {
			if (gameBoard[1] == symbol) {
				System.out.println("\n\ncomputer ONE WINS THE GAME\n");
			} else {
				System.out.println("\n\nplayer ONE WINS THE GAME\n");
			}
			exitCode = '1';
		} else if (gameBoard[5] != ' ' && gameBoard[2] == gameBoard[5] && gameBoard[5] == gameBoard[8]) {
			if (gameBoard[5] == symbol) {
				System.out.println("\n\ncomputer ONE WINS THE GAME\n");
			} else {
				System.out.println("\n\nplayer ONE WINS THE GAME\n");
			}
			exitCode = '1';
		} else if (gameBoard[4] != ' ' && gameBoard[0] == gameBoard[4] && gameBoard[4] == gameBoard[8]) {
			if (gameBoard[4] == symbol) {
				System.out.println("\n\ncomputer ONE WINS THE GAME\n");
			} else {
				System.out.println("\n\nplayer ONE WINS THE GAME\n");
			}
			exitCode = '1';
		} else if (gameBoard[2] != ' ' && gameBoard[2] == gameBoard[4] && gameBoard[4] == gameBoard[6]) {
			if (gameBoard[2] == symbol) {
				System.out.println("\n\ncomputer ONE WINS THE GAME\n");
			} else {
				System.out.println("\n\n player ONE WINS THE GAME\n");
			}
			exitCode = '1';
		}
	}

	public static void moveLocation() {
		if (user == '1') {
			System.out.print("\nSelect the position in board from range [0 - 8] : ");
			userPos = scanner.nextInt();

			switch (userPos) {
			case 0:
				if (gameBoard[0] == ' ') {
					gameBoard[0] = userTurn;
				}
				break;

			case 1:
				if (gameBoard[1] == ' ') {
					gameBoard[1] = userTurn;
				}
				break;

			case 2:
				if (gameBoard[2] == ' ') {
					gameBoard[2] = userTurn;
				}
				break;

			case 3:
				if (gameBoard[3] == ' ') {
					gameBoard[3] = userTurn;
				}
				break;

			case 4:
				if (gameBoard[4] == ' ') {
					gameBoard[4] = userTurn;
				}
				break;

			case 5:
				if (gameBoard[5] == ' ') {
					gameBoard[5] = userTurn;
				}
				break;

			case 6:
				if (gameBoard[6] == ' ') {
					gameBoard[6] = userTurn;
				}
				break;

			case 7:
				if (gameBoard[7] == ' ') {
					gameBoard[7] = userTurn;
				}
				break;

			case 8:
				if (gameBoard[8] == ' ') {
					gameBoard[8] = userTurn;
				}
				break;

			default:
				System.out.println("Invalid Position ! Restart game");
				return;
			}
			winner(userTurn);
		} else if (user == '2') {
			turnCount = turnCount + 1;
			System.out.println("Computer turn");
			if (turnCount == 2 || turnCount == 3 || turnCount == 4)
				blockUser();
			else
				comLocation();
			winner(computerTurn);
		}
	}

	public static void main(String[] args) {
		declareArray();
		userTurn = user(scanner);
		computerTurn = (userTurn == 'X') ? 'O' : 'X';
		showBoard();
		int Toss;
		int wonToss;
		System.out.println("Choose\n 0. Heads\n 1. Tails\nEnter you choice [0-1] : ");
		Toss = scanner.nextInt();
		Random rand1 = new Random();
		wonToss = rand1.nextInt(2);

		if (wonToss == Toss) {
			System.out.println("You won the toss");
			while (true) {
				moveLocation();
				System.out.println("Your board");
				showBoard();
				winner(userTurn);
				if (exitCode == '1') {
					break;
				}
				comLocation();
				System.out.println("Computer Board");
				showBoard();
				winner(computerTurn);
				if (exitCode == '1') {
					break;
				}
			}
		} else {
			System.out.println("Computer won the toss");
			while (true) {
				comLocation();
				System.out.println("Computer Board");
				showBoard();
				winner(computerTurn);
				if (exitCode == '1') {
					break;
				}
				System.out.println("Your Turn");
				moveLocation();
				System.out.println("Your board");
				showBoard();
				winner(userTurn);
				if (exitCode == '1') {
					break;
				}
			}
		}
	}

}
