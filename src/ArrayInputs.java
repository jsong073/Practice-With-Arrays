/*
This class will do the following:
1. Create an array to hold 10 number inputs from the user and print the total to the screen
2. Get the average of the 10 number inputs
 */

import java.util.Scanner;

public class ArrayInputs {
    public static void main (String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int average = 0;

        //This loop will receive 10 numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number (" + (i+1) + "/10): ");
            numbers[i] = input.nextInt();
        }

        //This loop will get the sum of the numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum/numbers.length;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
