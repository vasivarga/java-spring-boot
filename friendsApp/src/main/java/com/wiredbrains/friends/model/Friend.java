package com.wiredbrains.friends.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @NotEmpty
    @NotBlank
    private String firstName;

    private String lastName;

    private int age;

    private boolean married;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;

    public Friend() {
    }

    public Friend(@NotNull @NotEmpty @NotBlank String firstName, String lastName, int age, boolean married, List<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.married = married;
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

}
