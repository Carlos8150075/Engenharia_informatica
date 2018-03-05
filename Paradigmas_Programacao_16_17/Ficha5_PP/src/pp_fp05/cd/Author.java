/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.cd;

/**
 *
 * @author Bernardo
 */
public class Author {
    protected int age;
    protected String name;
    protected String address;
    protected int NIF;
    protected int NIB;

    public Author(int age, String name, String address, int NIF, int NIB) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.NIF = NIF;
        this.NIB = NIB;
    }
    
}
