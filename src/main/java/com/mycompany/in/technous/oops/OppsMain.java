/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.in.technous.oops;

import com.mycompany.javatechnous.Abstraction.Circle;
import com.mycompany.javatechnous.Abstraction.Rectangle;
import com.mycompany.javatechnous.Inheritance.Student;
import com.mycompany.javatechnous.Inheritance.hierarchical.Manager;
import com.mycompany.javatechnous.Inheritance.hierarchical.Teacher;
import com.mycompany.javatechnous.Inheritance.hybrid.Daughter;
import com.mycompany.javatechnous.Inheritance.hybrid.Grandfather;
import com.mycompany.javatechnous.Inheritance.hybrid.father;
import com.mycompany.javatechnous.Inheritance.hybrid.son;
import com.mycompany.javatechnous.Polymorphism.methodoverRidding.student;
import com.mycompany.javatechnous.Polymorphism.methodoverRidding.teacher;
import static com.mycompany.javatechnous.Polymorphism.methodoverloading.MethodOverloadingExample.add;
import static com.mycompany.javatechnous.Polymorphism.methodoverloading.MethodOverloadingExample.concatenate;
import java.io.InputStream;
import java.util.*;
import java.lang.*;

public class OppsMain {

    public static void main(String[] args) {
        while(true){
        System.out.println("*****OOPS******");
        System.out.println("1.Abstraction");
        System.out.println("2.Encpasulation");
        System.out.println("3.inheritance");
        System.out.println("4.polymorphism");
        System.out.println("5.exit");
        System.out.println("enter your choice:");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Circle circle = new Circle(5.0);
                Rectangle rectangle = new Rectangle(4.0, 6.0);
                System.out.println("Area of the circle: " + circle.calculateArea());
                System.out.println("Area of the rectangle: " + rectangle.calculateArea());
                break;
            case 2:
                System.out.println("enter age:");
                int age = sc.nextInt();
                //create object
                com.mycompany.javatechnous.Encapsulation.ExampleEncapsulation person = new com.mycompany.javatechnous.Encapsulation.ExampleEncapsulation();
                // Accessing and modifying the private variable through public methods
                person.setAge(age);
                System.out.println("Age: " + person.getAge());
                break;
            case 3:
                inheritance :
                while(true){
                    System.out.println("1.simple");
                    System.out.println("2.multilevel");
                    System.out.println("3.hybrid");
                    System.out.println("4.hierchicle");
                    System.out.println("5.multiple");
                    System.out.println("6.Back");
                    System.out.println("enter the choice");
                    int ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1:
                            Student s = new Student();//create child class object 
                            s.hobby();//call child class method
                            s.study();//call parent class method using child class object
                            break;
                        case 2:
                            System.out.println("enter name:");
                            String name = sc.next();
                            com.mycompany.javatechnous.Inheritance.multilevel.Student S = new com.mycompany.javatechnous.Inheritance.multilevel.Student(name);
                            S.hobby();//person class method(base class)
                            S.age();//child class method (intermediary class)
                            S.study();
                            break;
                        case 3:
                            Daughter d = new Daughter();
                            son s1 = new son();
                            father f = new father();
                            Grandfather g = new Grandfather();
                            g.showgrandparent();//parent class
                            f.showgrandparent();//intermidiate class
                            d.showgrandparent();//child class
                            d.showparent();
                            d.showdau();
                            s1.showgrandparent();//child class
                            s1.showparent();
                            s1.showson();
                            break;
                        case 4:
                            System.out.println("enter manager name:");
                            String m_name = sc.next();
                            Manager m = new Manager(m_name);//child class object create
                            System.out.println("enter student name:");
                            String s_name = sc.next();
                            com.mycompany.javatechnous.Inheritance.hierarchical.Student s2 = new com.mycompany.javatechnous.Inheritance.hierarchical.Student(s_name);//child class object create
                            System.out.println("enter teacher name:");
                            String t_name = sc.next();
                            Teacher t = new Teacher(t_name);//child class  object create

                            m.hobby();//parent class method
                            m.print_manager();//child class method
                            m.addname();
                            s2.hobby();//parent class method
                            s2.print_student();//child class method
                            s2.addname();
                            t.hobby();//parent class method
                            t.print_teacher();//child class method
                            t.addname();
                            break;
                        case 5:
                            com.mycompany.javatechnous.Interface.MultipleInheritance.Student sh1 = new com.mycompany.javatechnous.Interface.MultipleInheritance.Student();
                            sh1.child();//interface method call
                            sh1.person();//interface method call
                            break;
                            
                        case 6:
                            break inheritance;
                            
                        default:
                            System.out.println("enter valid choice....");
                            break;
                    }
                }
                break;
            case 4:
                Polymorphism :
                while(true){
                System.out.println("1.method overloading");
                System.out.println("2.method overriding");
                System.out.println("3.back");
                System.out.println("enter the choice");
                int ch3 = sc.nextInt();
                switch (ch3) {
                    case 1:
                        System.out.println("Sum (int): " + add(5, 10));
                        System.out.println("Sum (int): " + add(5, 10, 15));
                        System.out.println("Sum (double): " + add(3.5, 2.5));
                        System.out.println("Concatenation: " + concatenate("Hello, ", "world!"));
                        break;
                    case 2:
                        student sh2 = new student();
                        teacher t = new teacher();
                        t.hobby();
                        sh2.hobby();
                        break;
                    case 3:
                        break Polymorphism;
                }
                }
                break;
            case 5:
               System.exit(0);
            default:
                System.out.println("please enter valid choice");
                break;
        }

    }
    }
}
