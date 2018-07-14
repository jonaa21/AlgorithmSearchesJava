package sr.unasat.sorts.simple;

import sr.unasat.common.CompareTo;

public class InsertionSort {

    public static int[] insertionSort(int[] array){

        for(int firstUnsorted=1;firstUnsorted<array.length; firstUnsorted++){

            int sortedIndex = firstUnsorted - 1;
            int firstUnsortedValue = array[firstUnsorted];
            while (sortedIndex >= 0 && array[sortedIndex] >= firstUnsortedValue){
                array[sortedIndex+1] = array[sortedIndex];
                sortedIndex--;
            }
            array[sortedIndex + 1] = firstUnsortedValue;
        }
        return array;
    }

    public static String[] insertionSort(String[] array){

        for(int firstUnsorted=1;firstUnsorted<array.length; firstUnsorted++){

            int sortedIndex = firstUnsorted - 1;
            String firstUnsortedValue = array[firstUnsorted];
            while (sortedIndex >= 0 && CompareTo.execute(array[sortedIndex], firstUnsortedValue) == 1){
                array[sortedIndex+1] = array[sortedIndex];
                sortedIndex--;
            }
            array[sortedIndex + 1] = firstUnsortedValue;
        }
        return array;
    }
}
