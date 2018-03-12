package com.example.bernardo.basededadoscmu;

/**
 * Created by Bernardo on 21/11/2017.
 */

public class Pessoa {
    private int id;
    private String fname;
    private String lname;

    public Pessoa(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return fname + " " + lname;
    }
}
