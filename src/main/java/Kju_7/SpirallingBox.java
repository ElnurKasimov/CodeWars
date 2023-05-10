package Kju_7;

//Given two positive integers m (width) and n (height), fill a two-dimensional list (or array) of size m-by-n in the following way:
//(1) All the elements in the first and last row and column are 1.
//(2) All the elements in the second and second-last row and column are 2, excluding the elements from step 1.
//(3) All the elements in the third and third-last row and column are 3, excluding the elements from the previous steps.
//And so on ...
//Examples
//Given m = 5, n = 8, your function should return
//[1, 1, 1, 1, 1],
//1, 2, 2, 2, 1],
//1, 2, 3, 2, 1],
//1, 2, 3, 2, 1],
//1, 2, 3, 2, 1],
//1, 2, 3, 2, 1],
//1, 2, 2, 2, 1],
//1, 1, 1, 1, 1]]
//Given m = 10, n = 9, your function should return
//[1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
//1, 2, 2, 2, 2, 2, 2, 2, 2, 1],
//1, 2, 3, 3, 3, 3, 3, 3, 2, 1],
//1, 2, 3, 4, 4, 4, 4, 3, 2, 1],
//1, 2, 3, 4, 5, 5, 4, 3, 2, 1],
//1, 2, 3, 4, 4, 4, 4, 3, 2, 1],
//1, 2, 3, 3, 3, 3, 3, 3, 2, 1],
//1, 2, 2, 2, 2, 2, 2, 2, 2, 1],
//[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]]
//
// kata - The 'spiraling' box

import java.util.Arrays;

public class SpirallingBox {
    public static int[][] createBox(int width, int length)
    {
        int[][] result = new int[width][length];
        int i = 0;
        for (int count = 0; count < width; count++) {
            if (count > length / 2 && count < (width - length / 2)) {
                    i = length / 2;
                } else {
                if (count < width / 2) i = count;
                 else i = width-count-1;
            }
            for (int j = 0; j < length; j++) {
                if (j < i) result[count][j] = j + 1;
                else {
                    if (j < (length - i)) result[count][j] = i+1;
                    else result[count][j] = length - j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] test = createBox(13,9);
        for (int i = 0; i < test.length; i++) {
            System.out.println(Arrays.toString(test[i]));
        }
    }
}

//THE BEST SOLUTION
//public static int[][] createBox(int width, int length)
//{
//    int[][] box = new int[length][width];
//    for (int i = 0; i < length; i++) {
//        for (int j = 0; j < width; j++) {
//            box[i][j] = 1+Math.min(Math.min(i, length - i - 1), Math.min(j , width-j-1));
//        }
//    }
//    return box;
//}

//THE VERY GOOD SOLUTION
//public static int[][] createBox(int width, int length)
//{
//    int[][] result = new int[length][width];
//    int n = 0;
//    while (n <= width / 2) {
//        for (int i = n; i < length - n; i++) {
//            for (int j = n; j < width - n; j++) {
//                result[i][j] += 1;
//            }
//        }
//        n++;
//    }
//
//    return result;
//}