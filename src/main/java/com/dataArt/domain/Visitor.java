package com.dataArt.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by suxarina on 11/29/2015.
 */
@Entity
@Table(name = "VISITOR")
public class Visitor implements Serializable{

    private static final long serialVersionUID = -1793538395508435976L;
    private int id;
    private String firstName;
    private String lastName;
    private Integer phoneNumber;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = true, insertable = true, updatable = true, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = true, insertable = true, updatable = true, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "phone_number", nullable = true, insertable = true, updatable = true)
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Visitor visitor = (Visitor) o;

        if (id != visitor.id) return false;
        if (firstName != null ? !firstName.equals(visitor.firstName) : visitor.firstName != null) return false;
        if (lastName != null ? !lastName.equals(visitor.lastName) : visitor.lastName != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(visitor.phoneNumber) : visitor.phoneNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
