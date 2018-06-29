package sr.unasat.entities;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String firstname;
    private String lastname;
    private int id;

    private List<Person> persons = new ArrayList<>();

    public Person(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname(){
        return lastname + " " + firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getFullname();
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

}
