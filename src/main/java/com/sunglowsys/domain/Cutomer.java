package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "customer_orders")
public class Cutomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private  String firstName;
    private  String lastName;
    private  String emil;
    private  String mobile;

    public  Cutomer(){}

    public Cutomer(String firstName, String lastName, String emil, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emil = emil;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Cutomer cutomer = (Cutomer) o;
        return Objects.equals (id, cutomer.id) && Objects.equals (firstName, cutomer.firstName) && Objects.equals (lastName, cutomer.lastName) && Objects.equals (emil, cutomer.emil) && Objects.equals (mobile, cutomer.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash (id, firstName, lastName, emil, mobile);
    }

    @Override
    public String toString() {
        return "Cutomer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emil='" + emil + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
