package sr.unasat.sorts;

import java.util.Arrays;

public class InsertionSort {

    static String insertionSort(int[] array){

        int currentIndex;
        int firstUnsorted;

        for(firstUnsorted=1;firstUnsorted<array.length; firstUnsorted++){
            int temp = array[firstUnsorted];
            currentIndex = firstUnsorted;
            while (currentIndex>0 && array[currentIndex-1] >= temp){
                array[currentIndex] = array[currentIndex-1];
                --currentIndex;
            }
            array[currentIndex] = temp;
        }
        return Arrays.toString(array);
    }
}
