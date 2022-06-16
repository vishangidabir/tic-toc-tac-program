package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;
public class TicTacToc {
		// UC1 : Create board of char of size 10
	public static char[] gameBoard = new char[10];
    public static char userTurn;
    public static char computerTurn;
    public static char user = '1';
    public static int userPos;
    public static int computerPos;
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

		public static void main(String[] args) {
			declareArray();
			showBoard();
			user(scanner);
			comLocation();
		}

	}

