package sr.unasat.sorts.advanced;

import sr.unasat.common.PrintToConsole;

public class App {

    public static void main(String[] args) {

        int[] array = {10, 7, 8, 9, 1, 5};

        QuickSort.quickSort(array, 0, array.length-1);
        PrintToConsole.execute(array);
    }
}
