package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "order_master")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name",nullable = false)
    private String firstName;


    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "Orderd_place")
    private String orderdPlace;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Cutomer> cutomers;

    public Order(){}

    public Order(String firstName, String lastName, String email, String orderdPlace, List<Cutomer> cutomers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.orderdPlace = orderdPlace;
        this.cutomers = cutomers;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderdPlace() {
        return orderdPlace;
    }

    public void setOrderdPlace(String orderdPlace) {
        this.orderdPlace = orderdPlace;
    }

    public List<Cutomer> getCutomers() {
        return cutomers;
    }

    public void setCutomers(List<Cutomer> cutomers) {
        this.cutomers = cutomers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Order order = (Order) o;
        return Objects.equals (id, order.id) && Objects.equals (firstName, order.firstName) && Objects.equals (lastName, order.lastName) && Objects.equals (email, order.email) && Objects.equals (orderdPlace, order.orderdPlace) && Objects.equals (cutomers, order.cutomers);
    }

    @Override
    public int hashCode() {
        return Objects.hash (id, firstName, lastName, email, orderdPlace, cutomers);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", orderdPlace='" + orderdPlace + '\'' +
                ", cutomers=" + cutomers +
                '}';
    }
}
