/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
 */

package _07_The_Wrong_Way_Cow;

import java.util.Arrays;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!
		int numOfRightCows = 0;
		int numOfLeftCows = 0;
		int numOfUpCows = 0;
		int numOfDownCows = 0;

		int[] right = new int[2];
		int[] left = new int[2];
		int[] up = new int[2];
		int[] down = new int[2];

		//System.out.println("more words");

		for (int col = 0; col <= field.length-3; col ++) {
			for (int row = 0; row < field[col].length; row++) {
				if (field[col][row] == 'c') {
					if (field[col+1][row] == 'o') {
						if (field[col+2][row] == 'w') {
							numOfRightCows++;
							right[0] = row;
							right[1] = col;
						}
					}
				}
			}
		}
		//System.out.println("after right");
		for (int col = 0; col <= field.length-3; col ++) {
			for (int row = 0; row < field[col].length; row++) {
				if (field[col][row] == 'w') {
					if (field[col+1][row] == 'o') {
						if (field[col+2][row] == 'c') {
							numOfLeftCows++;
							left[0] = row;
							left[1] = col+2;
						}
					}
				}
			}
		}
		//System.out.println("after left");
		for (int col = 0; col < field.length; col ++) {
			for (int row = 0; row <= field[col].length-3; row++) {
				if (field[col][row] == 'c') {
					if (field[col][row+1] == 'o') {
						if (field[col][row+2] == 'w') {
							numOfUpCows++;
							up[0] = row;
							up[1] = col;
						}
					}
				}
			}
		}
		
		//System.out.println("after up");
		for (int col = 0; col < field.length; col ++) {
			for (int row = 0; row <= field[col].length-3; row++) {
				if (field[col][row] == 'w') {
					if (field[col][row+1] == 'o') {
						if (field[col][row+2] == 'c') {
							numOfDownCows++;
							down[0] = row+2;
							down[1] = col;
						}
					}
				}
			}
		}

		//System.out.println("words");

		if (numOfRightCows == 1) {
			System.out.println(Arrays.toString(right));
			return right;
		}
		else if (numOfLeftCows == 1) {
			System.out.println(Arrays.toString(left));
			return left;
		}
		else if (numOfUpCows == 1) {
			System.out.println(Arrays.toString(up));
			return up;
		}
		else {
			System.out.println(Arrays.toString(down));
			return down;
		}
	}
}
