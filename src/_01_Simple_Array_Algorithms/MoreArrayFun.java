package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	String[] Y = {"0", "1", "2", "3", "4"};
	
	printRandomString(Y);
	
}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
static void printString(String[] Y) {
	for (int j = 0; j < Y.length; j++) {
	System.out.println(Y[j]);
	}
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
static void printBackwardString(String[] Y) {
	for (int j = Y.length-1; j >= 0; j--) {
	System.out.println(Y[j]);
	}
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
static void printEveryOtherString(String[] Y) {
	for (int j = 0; j < Y.length; j++) {
		if (j%2 == 0) {
	System.out.println(Y[j]);
		}
	}
}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
static void printRandomString(String[] Y) {
	Random ran = new Random();
	int[] array = new int[Y.length];
	for (int v = 0; v < Y.length; v++) {
		array[v] = v;
	}
	for (int c = 0; c < Y.length; c++) {
		int k = ran.nextInt(Y.length);
		int h = array[c];
		array[c] = array[k];
		array[k] = h;
	}
	for (int j = 0; j < Y.length; j++) {
			
	System.out.println(Y[array[j]]);
	}
}

}
