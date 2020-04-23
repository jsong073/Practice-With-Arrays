/*
This class will do the following:
1. Create an array to store 3 names, and loop through the array to print out the names
2. Given an array of letters, replace the letter 't' with the word "hello" if found
3. Given two arrays of numbers, print out all matching pairs from arrays 1 and 2
 */

import java.util.Arrays;

public class ArrayReplace {
    public static void main (String[] args) {
        //Variables
        String[] names = {"James", "John", "Fred"};
        String[] letters = {"w", "t", "y", "h", "k"};
        int[] numberList1 = {1, 7, 6, 5, 9};
        int[] numberList2 = {2,7,6,3,4};
        int matchingPair = 0;

        //This loop will go through the names array and print out the names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //This loop will replace the letter 't' in letters with the word "hello"
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals("t")) {
                letters[i] = "hello";
            }
        }
        System.out.println(Arrays.toString(letters));

        //This loop will look for matching pairs between two arrays
        for (int i = 0; i < numberList1.length; i++) {
            if (numberList1[i] == numberList2[i]) {
                matchingPair = numberList1[i];
                System.out.print("(" + matchingPair + ", " + matchingPair + ") ");
            }
        }

    }
}
