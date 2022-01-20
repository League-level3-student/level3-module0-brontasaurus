package _00_Intro_To_Arrays;

import java.util.Iterator;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] noIDontThinkIWill = new String[5];

noIDontThinkIWill[0]= "beans beans";
noIDontThinkIWill[1]= "the glorious fruit";
noIDontThinkIWill[2]= "beckham is banned from walnuts";
noIDontThinkIWill[3]= "b A L L S";
noIDontThinkIWill[4]= "this joke i do not think is funny";
		

        // 2. print the third element in the array
System.out.println(noIDontThinkIWill[2]);
        // 3. set the third element to a different value
noIDontThinkIWill[2] = "no i dont think i will";
        // 4. print the third element again
System.out.println(noIDontThinkIWill[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for (int i = 0; i < noIDontThinkIWill.length; i++) {
	noIDontThinkIWill[i] = "heh";
}

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < noIDontThinkIWill.length; i++) {
	System.out.println(noIDontThinkIWill[i]);
}
        // 7. make an array of 50 integers
int[] yeahIThinkIWill = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
for (int i = 0; i < yeahIThinkIWill.length; i++) {
	Random ran = new Random();
	yeahIThinkIWill[i] = ran.nextInt(70);
}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
int smallest = yeahIThinkIWill[0];
for (int i = 1; i <yeahIThinkIWill.length; i++) {
	if (yeahIThinkIWill[i] < smallest) {
		smallest = yeahIThinkIWill[i];
	}
}
System.out.println(smallest);
        // 10 print the entire array to see if step 8 was correct
for (int i = 1; i <yeahIThinkIWill.length; i++) {
	//System.out.println(yeahIThinkIWill[i]);
}
        // 11. print the largest number in the array.
int largest = yeahIThinkIWill[0];
for (int i = 1; i <yeahIThinkIWill.length; i++) {
	if (yeahIThinkIWill[i] > largest) {
		largest = yeahIThinkIWill[i];
	}
}
System.out.println(largest);
        // 12. print only the last element in the array
System.out.println(yeahIThinkIWill[yeahIThinkIWill.length-1]);
    }
}
