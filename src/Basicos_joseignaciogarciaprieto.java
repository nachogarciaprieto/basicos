/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacho
 */
public class Basicos_joseignaciogarciaprieto {

   
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;
        boolean verdafalso;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;
        grande = 3;
        duplicaEntero = 56484984;
        chiquitin = 32;
        verdafalso = true;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor de grande");
        System.out.println(grande);
        System.out.println("Valor de duplicaEntero");
        System.out.println(duplicaEntero);
        System.out.println("Valor chiquitin");
        System.out.println(chiquitin);
        System.out.println("Valor verdafalso");
        System.out.println(verdafalso);
    }
//Para que cada uno de los métodos se ejecute y muestre el resultado, es necesario que realices una llamada a estos desde el método main.

 public static void main(String[] args) {
        numericos();  // Llamada al método
    }
 

}