package model;

public class Person {

    private long id;
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public long getId() {
        return id;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
