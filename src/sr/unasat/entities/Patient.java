package sr.unasat.entities;

public class Patient {

    private String achternaam;
    private String voornaam;

    public Patient(String achternaam, String voornaam) {
        this.achternaam = achternaam;
        this.voornaam = voornaam;
    }

    public String getFullname(){
        return achternaam + " " + voornaam;
    }

    public String toString(){
        return getFullname();
    }
}
