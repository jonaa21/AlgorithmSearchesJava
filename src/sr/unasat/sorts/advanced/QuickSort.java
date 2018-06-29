package sr.unasat.sorts.advanced;

import sr.unasat.common.Swap;

public class QuickSort {

    private static int partition(int[] array, int lowerIndex, int lastIndex){

        int pivot = array[lastIndex];
        int smallerElement = (lowerIndex - 1);

        for (int j = lowerIndex; j < lastIndex; j++){
            if(array[j] <= pivot){
                smallerElement++;
                Swap.execute(array, smallerElement, j);
            }
        }

        Swap.execute(array, smallerElement+1, lastIndex);
        return smallerElement + 1;
    }

    public static void quickSort(int[] array, int lowerIndex, int lastIndex){

        if(lowerIndex < lastIndex){
            int pi = partition(array, lowerIndex, lastIndex);

            quickSort(array, lowerIndex, pi-1);
            quickSort(array, pi+1, lastIndex);
        }
    }
}
