/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatechnous.Inheritance.multilevel;

/**
 *
 * @author Lenovo
 */
public class Child extends Person{

    public Child(String name) {
        super(name);
    }
//intermediary class
    public void age() {
        System.out.println("my age 10 years"+name);
    } 
}
