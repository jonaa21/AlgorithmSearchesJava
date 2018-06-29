package sr.unasat.search;


import sr.unasat.common.CompareTo;

public class App {

    public static void main(String[] args) {


        int[] a1 = {10, 20, 30, 40, 50, 60};
        String[] a2 = {"10", "20", "30", "40", "50"};
        //SearchService.linearySearch(a1, 5);
        //LinearSearch.linearSearchString("40", a2);

        /*String[] text = {"Ik", "ben", "Jona", "nice", "to","meet","you"};
        SearchService.linearSearchString("hi", text);

        SearchService.linearSearchText(text);*/

        String value1 = "abd";
        String value2 = "abcd";

        System.out.println(CompareTo.execute(value1,value2));
    }
}
