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
public class Person {//parent class
    String name;
    public Person(String name){
        this.name=name;
    }
    public void hobby()  {//parent class method
        System.out.println("this person hobby reading");
    } 
    public void addname(){
        System.out.println("person name:"+name);
    }
}
