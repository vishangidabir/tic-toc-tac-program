package com.bridgelabz;
import java.util.Scanner;
public class TicTacToc {

		// UC1 : Create board of char of size 10
		public static char[] gameArray = new char[10];
		public static Scanner scanner = new Scanner(System.in);

		public static void declareArray() {
			// TODO Auto-generated method stub
			System.out.println("Welcome to Tic-Tac-Toe game");
			for (int i = 0; i < gameArray.length; i++) {

				gameArray[i] = ' ';
			}

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			declareArray();
		}

	}

