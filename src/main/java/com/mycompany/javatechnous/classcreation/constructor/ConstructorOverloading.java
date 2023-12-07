/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatechnous.classcreation.constructor;

/**
 *
 * @author Lenovo
 */
public class ConstructorOverloading {
    private int x;
    private String name;

    // Default constructor
    public ConstructorOverloading() {
        this.x = 0;
        this.name = "Default";
    }

    // Constructor with one parameter
    public ConstructorOverloading(int x) {
        this.x = x;
        this.name = "Parameterized";
    }

    // Constructor with two parameters
    public ConstructorOverloading(int x, String name) {
        this.x = x;
        this.name = name;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public String getName() {
        return name;
    }

    
}
