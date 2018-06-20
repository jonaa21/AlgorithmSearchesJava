package sr.unasat.sorts;

import java.util.Arrays;

public class SelectionSort {

    static String selectionSort(int[] array){

        int leftBound;
        int rightBound;
        int minimum;

        for(leftBound = 0; leftBound<array.length-1; leftBound++){
            minimum = leftBound;
            for (rightBound = leftBound+1; rightBound<array.length; rightBound++){
                if (array[rightBound] < array[minimum]) {
                    minimum = rightBound;
                }
            }
            swap(array, leftBound, minimum);
        }
        return Arrays.toString(array);
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
