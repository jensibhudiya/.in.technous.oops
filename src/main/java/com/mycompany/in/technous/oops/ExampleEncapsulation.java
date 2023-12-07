
package com.mycompany.in.technous.oops;

import com.mycompany.javatechnous.Encapsulation.*;

public class ExampleEncapsulation {
    private int age; // Private variable

    // Public getter method to access the private variable
    public int getAge() {
        return age;
    }

    // Public setter method to modify the private variable
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

   
   
}


