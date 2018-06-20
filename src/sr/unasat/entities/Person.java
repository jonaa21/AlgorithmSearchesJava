package sr.unasat.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {

    private String name;
    private int id;
    private List<Person> persons = new ArrayList<>();

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addPerson(String name){
        persons.add(new Person(name, id));
    }

    public String findPeopleLinear(String name){
        for (Person person :
                persons) {
            if (null!=person.getName() && person.getName().equals(name)){
                System.out.println(name + " has been found");
                return name + " has been found";
            }
        }
        System.out.println(name + " has not been found");
        return name + " has not been found";
    }

    public int findPeopleBinary(Person[] persons, Person age){

        int leftBound = 0;
        int rightBound = persons.length-1;

        if (leftBound>rightBound){
            return -1;
        }

        int mid = leftBound + ((rightBound - leftBound)/2);
        if (persons[mid] == age){
            return mid;
        }
        return -1;
    }

    public int compareTo(Person person1, Person person2) {

    if(person1.getId() != person2.getId()){
        return -1;
    }
    return 0;
    }
}
