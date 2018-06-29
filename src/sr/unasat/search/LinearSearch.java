package sr.unasat.search;

import sr.unasat.entities.Person;

import java.util.List;

public class LinearSearch {

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

    public static String findPeopleLinear(List<Person> persons, String name){
        for (Person person :
                persons) {
            if (null!=person.getFirstname() && person.getFirstname().equals(name)){
                System.out.println(name + " has been found");
                return name + " has been found";
            }
        }
        System.out.println(name + " has not been found");
        return name + " has not been found";
    }
}
