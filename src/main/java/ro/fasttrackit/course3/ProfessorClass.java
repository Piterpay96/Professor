package ro.fasttrackit.course3;

import java.util.Date;


public class ProfessorClass {
    private String lastName;
    private String firstName;
    private Date dateOfBirth;
    private Date dateOfHiring;
    private String emailAddress;
    private String isPhd;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(Date dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getIsPhd() {
        return isPhd;
    }

    public void setIsPhd(String isPhd) {
        this.isPhd = isPhd;
    }
}
