/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase5grupo2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int i;//bloque_ant
        i = 0;//inicio
        while (i <= 6) {//while - Mientras Que

            System.out.println(i);//Bloque
            i = i + 1;//Actualiza
        }
        System.out.println("Fin de programa");
         */

        //------------------------------------------------------------------
        /*
        int i = 2;//inicializa a i en 2
        int j = 25;//inicializa a j en 25
        while (i < j) {//mientras i sea menor a j
            // imprime los valores de i y j
            System.out.println(i + "," + j);
            i = i * 2;//i se multiplica por 2 en cada ciclo - iteracion
            j = j + 10;//se incrementa de 10 en 10
        }
        // se ejecuta al terminar el ciclo
        System.out.println("the end.");
        System.out.println(i + "," + j);//valores finales de i y j
         */
        //------------------------------------------------------------------
        //System.out.println(minMaquina());
        /**
         * Diseñe un algoritmo que pida un valor entero, y que siga leyendo
         * valores enteros mientras que alguno de esos valores no represente el
         * codigo ASCII de una letra mayuscula del alfabeto ingles.
         */
        /*
        Scanner esc = new Scanner(System.in);
        String aviso="Digite valores que no representen el\n" +
                    "codigo ASCII de una letra mayuscula del alfabeto ingles";
        System.out.println(aviso);
        int valor = esc.nextInt();
        //while (valor < 65 || valor > 90) {
        while ( !(valor >= 65 && valor <= 90) ) {
            System.out.println(aviso);
            valor = esc.nextInt();
        }
        System.out.println("Acaba de digitar un valor de una letra MAYUSCULA- FIN");

         */
        //-------------------------------------------------------------------
        /*
        
        int suma = 0;
        Scanner sc= new Scanner(System.in);
        while (true) {//valor 'true' está quemado - Hardcoded
            System.out.print("Ingrese un numero entero:");
            System.out.println("a sumar o 0 para salir:");
            int dato = Integer.parseInt(sc.nextLine());
            if (dato == 0) {
                break;//terminar el While de manera forzada
            }
            suma += dato;
        }
        System.out.println("La suma es:" + suma);

         */
        /**
         * Imprimir un listado con los numeros impares desde 1 hasta 999
         * y seguidamente
         * otro listado con los numeros pares desde 2 hasta 1000
         */
        int x = 1, y = 1;
        System.out.println("IMPARES:");
        while (x <= 1000) {

            if (x % 2 == 1) {
                System.out.println(x);
            }
            x++;

        }
        System.out.println("\n\nPARES:");
        while (y <= 1000) {

            if (y % 2 == 0) {
                System.out.println(y);
            }
            y++;

        }

    }

    //****************************************************
    public static double minMaquina() {
        double Xo = 1.0;
        double Xi = Xo / 2.0;
        int contador = 0;
        while (Xi > 0.0) {
            contador++;
            System.out.println("Xo=" + Xo + "\tContador:" + contador);
            Xo = Xi;
            Xi = Xo / 2.0;
        }
        return Xo;
    }
    //**********************************************************
}
