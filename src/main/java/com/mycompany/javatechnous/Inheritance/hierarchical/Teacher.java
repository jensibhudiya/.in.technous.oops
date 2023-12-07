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
public class Teacher extends Person{

    public Teacher(String name) {
        super(name);
    }
    /*child class extends parent class and 
    used parent class property
    */
   public void print_teacher(){//child class method
        System.out.println("i am teacher");
    } 
}
