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
public class SecondCons {
    String x;
    //int y;
     public SecondCons(Constructor copy) {//a duplicate copy of an existing object of the class
        this.x = copy.name;
        //this.y = copy.age;
    }
     
}
