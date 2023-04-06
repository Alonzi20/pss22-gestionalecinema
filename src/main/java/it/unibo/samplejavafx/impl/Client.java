package it.unibo.samplejavafx.impl;

import it.unibo.samplejavafx.api.ClientInterface;

public class Client implements ClientInterface{
    private int id;
    private String name;
    private String surname;
    private String email;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void deleteClient() {
        //method to be implemented later
    }
    
}
