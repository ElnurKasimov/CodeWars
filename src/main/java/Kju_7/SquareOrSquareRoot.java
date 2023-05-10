package Kju_7;

//Write a method, that will get an integer array as parameter and will process every number from this array.
// Return a new array with processing every number of the input-array like this:
// If the number has an integer square root, take this, otherwise square the number.
//Example
//[4,3,9,7,2,1] -> [2,9,3,49,4,1]
//Notes
// The input array will always contain only positive numbers, and will never be empty or null.

import java.util.Arrays;

public class SquareOrSquareRoot {
    public static int[] squareOrSquareRoot(int[] array) {
        return  Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))
                .toArray();
    }

    public static void main(String[] args) {
        int[] array = new int[] { 4,3,9,7,2,1};
        System.out.println(Arrays.toString(array) + " -> " + Arrays.toString(squareOrSquareRoot(array)));
    }

}
