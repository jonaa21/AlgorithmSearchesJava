package sr.unasat.search;

public class App {

    public static void main(String[] args) {


       /* int[] a1 = {10, 20, 30, 40, 50};
        SearchService.linearySearch(a1, 5);*/

        String[] text = {"Ik", "ben", "Jona", "nice", "to","meet","you"};
        SearchService.linearSearchString("hi", text);
    }
}
