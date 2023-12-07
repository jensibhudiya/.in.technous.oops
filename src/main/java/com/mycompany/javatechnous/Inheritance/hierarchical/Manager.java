/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatechnous.Inheritance.hierarchical;

/**
 *
 * @author Lenovo
 */
public class Manager extends Person {

    public Manager(String name) {
        super(name);
    }
    
    public void print_manager(){//child class method
        System.out.println("i am manager");
    }
}
