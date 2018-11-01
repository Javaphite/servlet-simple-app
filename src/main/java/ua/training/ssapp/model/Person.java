package ua.training.ssapp.model;

/**
 * Entity class for conference participants representation.
 */
public class Person {

    long id;
    String firstName;
    String lastName;
    String company;
    AccessLevel accessLevel;

    public Person() { }

    public Person(long id, String firstName, String lastName, String company, String accessLevel) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.accessLevel = AccessLevel.valueOf(accessLevel);
    }

    private enum AccessLevel {
        ORGANIZATOR,
        PARTICIPANT,
        VOLUNTEER;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        char delimiter = ' ';
        return new StringBuilder("#")
                .append(id)
                .append(delimiter)
                .append(lastName)
                .append(delimiter)
                .append(firstName)
                .append(delimiter)
                .append(company)
                .append('(')
                .append(accessLevel)
                .append(')')
                .append("<br>")
                .toString();
    }
}
