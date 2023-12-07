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
import java.util.*;
public class main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.next();

        System.out.println("Enter age:");
        int age = sc.nextInt();

        // Creating an instance of Constructor using the parameterized constructor
        Constructor person = new Constructor(name, age);

        // Displaying information
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);

        // Creating a copy of the Constructor object using the copy constructor
        SecondCons copyPerson = new SecondCons(person);

        // Displaying information from the copy
        System.out.println("Copy X: " + copyPerson.x);
        //System.out.println("Copy Y: " + copyPerson.y);
        //**************constructoroverloading****************
        // Creating objects using different constructors
        ConstructorOverloading obj1 = new ConstructorOverloading();                   // Default constructor
        ConstructorOverloading obj2 = new ConstructorOverloading(15);                 // Constructor with one parameter
        ConstructorOverloading obj3 = new ConstructorOverloading(10, "Custom");      // Constructor with two parameters

        // Displaying information
        System.out.println("Object 1: " + obj1.getX() + ", " + obj1.getName());
        System.out.println("Object 2: " + obj2.getX() + ", " + obj2.getName());
        System.out.println("Object 3: " + obj3.getX() + ", " + obj3.getName());
     
    }  
}
