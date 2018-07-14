package sr.unasat.sorts.simple;

import sr.unasat.common.PrintToConsole;
import sr.unasat.entities.Person;

public class App {

    public static void main(String[] args) {

        int[] a1 = {90, 3, 100, 65, 80};
        String[] array = {"appel", "sinaasappel", "sap", "appelsap"};

        String[] sortedArray = ReverseInsertionSort.reversedInsertionSort(array);
        PrintToConsole.execute(ReverseInsertionSort.reversedInsertionSort(sortedArray));

        Person person1 = new Person(1, "Jonaa", "Olly");
        Person person2 = new Person(2, "Mitchel", "Pawiro");
        Person person3 = new Person(3, "Jason", "Olsen");

    Person[] personArray = {person1, person2, person3};

    //BubbleSort
    /*Person[] sortedArray = BubbleSort.bubbleSort(personArray);
        PrintToConsole.execute(sortedArray)*/
    }
}