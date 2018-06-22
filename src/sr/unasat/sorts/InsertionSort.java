package sr.unasat.sorts;

import java.util.Arrays;

public class InsertionSort {

    static String insertionSort(int[] array){

        int leftBound;
        int rightBound;

        for(rightBound=1;rightBound<array.length; rightBound++){
            int temp = array[rightBound];
            leftBound = rightBound;
            while (leftBound>0 && array[leftBound-1] >= temp){
                array[leftBound] = array[leftBound-1];
                leftBound--;
            }
            array[leftBound] = temp;
        }
        return Arrays.toString(array);
    }
}
