package sr.unasat.sorts.simple;

import java.util.Arrays;

public class InsertionSort {

    static String insertionSort(int[] array){

        for(int firstUnsorted=1;firstUnsorted<array.length; firstUnsorted++){

            int sortedIndex = firstUnsorted - 1;
            int firstUnsortedValue = array[firstUnsorted];
            while (sortedIndex >= 0 && array[sortedIndex] >= firstUnsortedValue){
                array[sortedIndex+1] = array[sortedIndex];
                sortedIndex--;
            }
            array[sortedIndex + 1] = firstUnsortedValue;
        }
        return Arrays.toString(array);
    }
}
