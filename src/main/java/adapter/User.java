package adapter;

import java.time.LocalDate;

public class User {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    private String PESEL;


    public User(String firstName, String lastName, String PESEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PESEL = PESEL;
        this.dateOfBirth = LocalDate.now();
    }

    public String getPESEL() {
        return PESEL;
    }
}
