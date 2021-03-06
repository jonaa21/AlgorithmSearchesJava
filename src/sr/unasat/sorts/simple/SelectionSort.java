package sr.unasat.sorts.simple;

public class SelectionSort {

    public static int[] selectionSort(int[] array){

        int leftBound;
        int currentIndex;
        int unsortedMinimum;

        for(leftBound = 0; leftBound<array.length-1; leftBound++){
            unsortedMinimum = leftBound;
            for (currentIndex = leftBound+1; currentIndex<array.length; currentIndex++){
                if (array[currentIndex] < array[unsortedMinimum]) {
                    unsortedMinimum = currentIndex;
                }
            }
            if (leftBound != unsortedMinimum) {
                swap(array, leftBound, unsortedMinimum);
            }
        }
        return array;
    }

    private static void swap(int[] array, int currentIndex, int leftIndex) {
        int temp = array[currentIndex];
        array[currentIndex] = array[leftIndex];
        array[leftIndex] = temp;
    }
}
