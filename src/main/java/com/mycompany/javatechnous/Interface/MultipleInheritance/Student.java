/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatechnous.Interface.MultipleInheritance;

/**
 *
 * @author Lenovo
 */
public class Student implements Child,Person {//implements multiple interface

    
    public void child() {
        System.out.println("Hello, i am children");
    }
    
    
    public void person() {
         System.out.println("Hello, i am person");
    }
    
}
