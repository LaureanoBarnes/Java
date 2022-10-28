/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.act1;

import java.util.Scanner;

/**
 *
 * @author Laurii
 */
public class Act1 {

    public static void main(String[] args) {
        int Segundos;
        int minutos;
        int horas;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba la cantidad de segundos");
        Segundos = entrada.nextInt();
        horas = Segundos/3600;
        Segundos %=3600;
        minutos = Segundos/60;
        Segundos %=60;
        System.out.println("la cantidad de horas, minutos y segundos es de horas: "+horas);
        System.out.println("minutos: "+minutos);
        System.out.println("segundos: "+Segundos);
    }
}
