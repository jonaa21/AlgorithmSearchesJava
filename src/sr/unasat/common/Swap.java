package sr.unasat.common;

import sr.unasat.entities.Person;

public class Swap {

    public static void execute(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void execute(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void execute(Person[] array, int i, int j) {
        Person temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
