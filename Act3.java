/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.act3;
import java.util.Scanner;
/**
 *
 * @author Laurii
 */
public class Act3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora=0,minutos=0;
        System.out.println("escribe las horas");
        hora = entrada.nextInt();
        System.out.println("escriba los minutos");
        minutos = entrada.nextInt();
        if (hora > 24 || minutos>=60) {
            System.out.println("No se puede elegir mas de 24 horas o mas de 60 minutos");
        }else{
        if (hora >= 12) {
            hora = hora - 12;
            System.out.println("la hora es: " + hora +":"+ minutos + "pm");     
            }else {
            System.out.println("la hora es: " + hora + minutos + "am");
            
        }
            }
        }
    }