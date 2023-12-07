
package com.mycompany.javatechnous.Polymorphism.methodoverloading;


public class MethodOverloadingExample {
    public static  int add(int a,int b){ // Method with two int parameters
        return a+b;
    }
    public static int add(int a,int b,int c){ // Method with three int parameters
        return a+b+c;
    }
     public static double add(double a, double b) {//method with double
        return a+b;
     }
     public static String concatenate(String str1, String str2) {// Method with a String parameter
        return str1 + str2;
    }
    
}
