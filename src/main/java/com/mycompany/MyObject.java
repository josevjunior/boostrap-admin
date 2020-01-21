/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author ALUNO
 */
public class MyObject {

    private int index;
    private String firstName;
    private String lastName;
    private String handle;

    public MyObject() {
    }

    public MyObject(int index, String firstName, String lastName, String handle) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.handle = handle;
    }
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
    
    
}
