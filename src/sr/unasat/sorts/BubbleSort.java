package sr.unasat.sorts;

import java.util.Arrays;

public class BubbleSort {



    static String bubbleSort(int[] array){

        int leftBound;
        int rightBound = array.length-1;

        while (rightBound>0){
            for(leftBound = 0; leftBound < rightBound; leftBound++){
                if (array[leftBound] > array[leftBound+1]){
                    swap(array, leftBound, leftBound+1);
                }
            }
            rightBound--;
        }
        return Arrays.toString(array);
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
