package sr.unasat.search;

import sr.unasat.entities.Person;

public class App {

    public static void main(String[] args) {


        int[] a1 = {10, 20, 30, 40, 50, 60};
        String[] a2 = {"10", "20", "30", "40", "50"};
        //SearchService.linearySearch(a1, 5);
        SearchService.linearSearchString("40", a2);

        /*String[] text = {"Ik", "ben", "Jona", "nice", "to","meet","you"};
        SearchService.linearSearchString("hi", text);

        SearchService.linearSearchText(text);*/

        Person person = new Person();
        person.addPerson("Jake");
        person.addPerson("Joey");
        person.addPerson("Andrew");
        person.addPerson("Jona");

        person.findPeopleLinear("Jona");

    }
}
