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
        int entero;
        double decimal;
        String texto;
        boolean booleano;
        entero=10;
        decimal=10.5;
        texto = "New string";
        
        System.out.println("Hello World!"+texto);
        mensaje("quiero comida");      
        int enteroNew= enteros(10);
        System.out.println("el numero entero es"+enteroNew);

        
    }
    public static void mensaje(String mensaje){
        System.out.println("Hola desde  mensaje "+mensaje);
    }
    public static int enteros(int entero){
        System.out.println("Hola desde  mensaje "+entero);
        return entero;
    }
}
