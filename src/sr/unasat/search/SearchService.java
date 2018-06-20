package sr.unasat.search;

import sr.unasat.entities.Person;

import java.util.ArrayList;

public class SearchService {

    public static int linearySearch(int[] array, int term) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == term) {
                return i;
            }
        }
        return -1; //-1 omdat deze index niet bestaat
    }

    public static int binarySearchIterative(int[] array, int term) {
        int left = 0;
        int right = array.length-1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (array[mid] == term) {
                return mid;
            } else if (term < array[mid]) {
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static String linearSearchString(String term, String[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i].equals(term)) {
                return "Term found at index: " + i;
            }
        }
             return "Term not found";
    }

    public static StringBuilder linearSearchText(String[] array){

        StringBuilder stringBuilder = new StringBuilder();
            for (String s : array){
                stringBuilder.append(s + " ");
            }
        System.out.println(stringBuilder);
        return stringBuilder;
    }
    //linearSearch(String term, String array) ==> return een nette text

}

