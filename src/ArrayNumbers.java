/*
This class will do the following:
1. Create an array to hold the numbers 1-10
2. Loop through that array and sum the numbers 1-10 and print the total to the screen
3. Print the numbers 1-10 backwards from the array
4. Create an array of fixed numbers and loop through the array and print out the index each time the
    value equals 5
 */

public class ArrayNumbers {
    public static void main (String[] args) {
        //Variables
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] moreNumbers = {2, 5, 9, 0, 2, 1, 8, 5, 4};
        int sum = 0;

        /*
        This loop will go through the numbers array and add each element of the array to sum
        using "i" as the index for the array
         */
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of the numbers from 1-10 is: " + sum);
        System.out.println();
        /*
        This loop will go through the numbers array backwards and print out each element of the array
        "i" will be used as the index for the array, starting at (numbers.length - 1) and ending at 0
         */
        System.out.println("Here are all the numbers from 10-1:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();

        //This loop will go through the array and print out the index if it equals 5
        for (int i = 0; i < moreNumbers.length; i++) {
            if (moreNumbers[i] == 5) {
                System.out.print(moreNumbers[i] + " ");
            }
        }

    }
}
