
package com.mycompany.javatechnous.Inheritance.multilevel;


public class Student extends Child{

    public Student(String name) {
        super(name);
    }
//derived class
   public  void study() {
        System.out.println("this student study in 6th std."+name);
    } 
}
