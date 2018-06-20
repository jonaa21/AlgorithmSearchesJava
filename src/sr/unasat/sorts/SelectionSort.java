package sr.unasat.sorts;

public class SelectionSort {

    static int[] selectionSort(int[] array){

        int leftBound;
        int rightBound;
        int minimum;

        for(leftBound = 0; leftBound<array.length-1; leftBound++){
            minimum = leftBound;
            for (rightBound = leftBound+1; rightBound<array.length; rightBound++){
                if (array[rightBound] < array[minimum]) {
                    minimum = rightBound;
                    swap(array, leftBound, minimum);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public void display(int[] array){
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
}
