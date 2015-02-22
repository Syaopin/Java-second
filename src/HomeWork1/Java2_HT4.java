package HomeWork1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java2_HT4 {

	public static void main(String[] args) {

		char[][] field = { 
				{ '*', '*', '*' }, 
				{ '*', '*', '*' },
				{ '*', '*', '*' }
				};
		show(field);
		while (step < 6) { // main cycle where user and computer make their
							// steps until user will make 5 steps
			System.out.println("==================================");
			boolean chk = false;
			while (!chk) { // check whether user enters right input data, if
							// not, ask him again 'till he enter correct data
				chk = humanStep(field); // user makes his step
			}
			if (check(field) == 1) { // check if user wins
				show(field);
				break;
			}

			if (step == 5) { // check if this is last step and no one wins
				show(field);
				System.out.println("It's a draw! No one wins!");
				break;
			}

			compStep(field); // computer makes his step
			if (check(field) == 2) { // check if computer wins
				show(field);
				break;
			}
			show(field);
		}

	}

	static int step = 0; // static variable to count user steps

	static void show(char[][] f) { // Method to show current status of field
		System.out.println("Current status on field( You - X, Computer - O:\n");
		for (char[] x : f) {
			for (char y : x) {
				System.out.printf("%4c", y);
			}
			System.out.println();
		}
	}

	static boolean humanStep(char[][] f) { // Method when user makes his step.
											// Return true when input data is
											// ok, and false if not ok.
		System.out.println("Enter x (from 1 to 3):");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter y (from 1 to 3):");
		int y = sc.nextInt();
		if ((x < 1) || (x > 3) || (y < 1) || (y > 3)) {
			System.out.println("You entered wrong coordinates!");
			return false;
		}

		if (f[x - 1][y - 1] == '*') {
			f[x - 1][y - 1] = 'X';
			step++;
			return true;
		} else {
			System.out.println("This cell is already occupied");
			return false;
		}
	}

	static void compStep(char[][] f) { // Method when computer makes its step
		Random rand = new Random();
		int x = rand.nextInt(3);
		int y = rand.nextInt(3);

		while (f[x][y] != '*') {
			x = rand.nextInt(3);
			y = rand.nextInt(3);
		}
		f[x][y] = 'O';
	}

	static int check(char[][] f) { // Method for checking whether someone wins.
									// Method returns 1 if user wins, 2 - if
									// computer wins, 0 - if there is no winners
		int check = 0;
		for (char[] i : f) { // checking rows of game field
			if (Arrays.toString(i).equals("[X, X, X]")) {
				check = 1;
				break;
			}
			if (Arrays.toString(i).equals("[O, O, O]")) {
				check = 2;
				break;
			}
		}

		for (int i = 0; i < f.length; i++) { // checking columns of game field
			String tmp = "";
			for (int j = 0; j < f[i].length; j++) {
				tmp += f[j][i];
			}
			if (tmp.equals("XXX")) {
				check = 1;
				break;
			}
			if (tmp.equals("OOO")) {
				check = 2;
				break;
			}
		}

		if (((f[0][0] == 'X') && (f[1][1] == 'X') && (f[2][2] == 'X'))
				|| ((f[2][0] == 'X') && (f[1][1] == 'X') && (f[0][2] == 'X'))) { // check
																					// diagonals
			check = 1;
		}
		if (((f[0][0] == 'O') && (f[1][1] == 'O') && (f[2][2] == 'O'))
				|| ((f[2][0] == 'O') && (f[1][1] == 'O') && (f[0][2] == 'O'))) { // check
																					// diagonals
			check = 2;
		}
		if (check == 1) {
			System.out.println("You Win!");
		} else if (check == 2) {
			System.out.println("Computer Win!");
		}
		return check;
	}
}
