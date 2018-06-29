package sr.unasat.sorts.simple;

import sr.unasat.entities.Person;
import sr.unasat.common.Swap;

import java.util.Arrays;

public class BubbleSort {


    public static String bubbleSort(int[] array){

        int leftBound;
        int rightBound = array.length-1;

        while (rightBound>0){
            for(leftBound = 0; leftBound < rightBound; leftBound++){
                if (array[leftBound] > array[leftBound+1]){
                    Swap.execute(array, leftBound, leftBound+1);
                }
            }
            rightBound--;
        }
        return Arrays.toString(array);
    }

    public static Person[] bubbleSort(Person[] array){

        int lastUnsorted = array.length - 1;

        while (lastUnsorted>0){
            for(int i = 0; i < lastUnsorted; i++){
                if(array[i].getLastname().compareToIgnoreCase(array[i+1].getLastname()) > 0){
                    Swap.execute(array, i, i+1);
                }
            }
            lastUnsorted--;
        }
        return array;
    }
}
