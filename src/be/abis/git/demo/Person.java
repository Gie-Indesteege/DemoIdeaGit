package be.abis.git.demo;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        super();
    }

    public Person(String lName) {
        lastName = lName;
    }

    public Person(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
