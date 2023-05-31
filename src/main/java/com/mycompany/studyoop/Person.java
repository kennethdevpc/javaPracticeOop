/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studyoop;

/**
 *
 * @author kenneth
 */
public class Person {
    String name;
    String lastName;
    int age;
    double height;
    
    void ageMessage(){
        System.out.println("El chico tiene: "+age+" años");
    }
    int ageFuture(int cantYears){
        return age+cantYears;
    }
    
    
}
