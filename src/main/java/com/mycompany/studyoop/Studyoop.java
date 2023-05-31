/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studyoop;

/**
 *
 * @author kenneth
 */
public class Studyoop {

    public static void main(String[] args) {
        
        Person persona = new Person();
        persona.age=10;
        persona.name="kenneth";
        persona.height=2.3;
        
        persona.ageMessage(); 
        System.out.println(" en 15 años tendra"+persona.ageFuture(15)); 
        

        
    }
    
}
