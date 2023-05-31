/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studyoop;

import java.util.ArrayList;

/**
 *
 * @author kenneth
 */
public class Studyoop {

    public static void main(String[] args) {
        
        Person persona1 = new Person();
        persona1.age=10;
        persona1.name="kenneth";
        persona1.height=2.3;
        
        persona1.ageMessage(); 
        System.out.println(" en 15 años tendra: "+persona1.ageFuture(15)); 
        
        Person persona2 = new Person();
        persona2.age=20;
        persona2.name="Diego";
        persona2.height=1.3;
        
        
        ArrayList<String>  lista = new ArrayList<String>();
        lista.add("Kenneth");     
        lista.add("Diego");   
        lista.add("Juanes");
        System.out.println("lista es: "+lista);
        lista.remove("Kenneth");
        System.out.println("lista es: "+lista);
        lista.clear();
        System.out.println("lista es: "+lista);
        
        ArrayList<Person>  lPersonas = new ArrayList<Person>();
        lPersonas.add(persona1);    
        lPersonas.add(persona2);
        System.out.println(lPersonas.get(0).name);
        for(int j = 0;j < lPersonas.size();j++){//ahora imprimiremos las personas de nuestro ArrayList
	System.out.println("============================================================");
	System.out.println("Persona numero "+j);
	Person persona = lPersonas.get(j);
	System.out.println("Nombre: "+persona.name);
	System.out.println("============================================================");
}
  
      
        



        
    }
    
}
