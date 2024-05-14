package net.javaproject.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private String dob;

    @Column (name = "last_fourSSN")
    private String lastFourSSN;


    public Employee(long id, String firstName, String lastName, String dob, String lastFourSSN) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.lastFourSSN = lastFourSSN;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLastFourSSN() {
        return lastFourSSN;
    }

    public String setLastFourSSN(String lastFourSSN) {
        if(lastFourSSN != null && lastFourSSN.length() >= 4){
            return lastFourSSN.substring(lastFourSSN.length() - 4);
        }
        return "Invalid SSN";
    }
}
