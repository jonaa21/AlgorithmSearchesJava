package sr.unasat.search;

import java.util.ArrayList;

public class SearchService {

    public static int linearySearch(int[] array, int term) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == term) {
                break;
            }
        }
        if(i != term){
                System.out.println("Term: " + term);
                System.out.println("Term found at index: " + i);
                return i;
            }
            else{
            System.out.println("Can't find term");
        }
        return i; //-1 omdat deze index niet bestaat
    }

    public static void binarySearch(int[] array, int term) {
        int first= 0;
        int mid;
        int last = array.length;

        while (first <= last){
            mid = (first + last)/2;
            if (array[mid] < term){
                first = mid+1;
            }
            else if(array[mid] == term){
                System.out.println("Element found at index: " + mid);
            }else{
                last = mid - 1;
            }
        }
        if(first>last){
            System.out.println("Element is not found");
        }
    }

    public static void linearSearchString(String term, String[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == term) {
                System.out.println("Term: " + term);
                System.out.println("Term found at index: " + i);
                break;
            }
        }
        if (i >= array.length) {
            System.out.println("Term not found");
        }
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

