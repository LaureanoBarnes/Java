/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.act2;
import java.util.Scanner;
/**
 *
 * @author Laurii
 */
public class Act2 {

    public static void main(String[] args) {
        int cantidad;
        int cant1000=0, cant500=0, cant200=0, cant100=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("indique la cantidad para retirar");
        cantidad=entrada.nextInt();
        while(cantidad>=1000){
            cant1000++;
            cantidad=cantidad-1000;
        }
        while (cantidad>=500){
            cant500++;
            cantidad=cantidad-500;
        } 
       while (cantidad>=200){
           cant200++;
           cantidad=cantidad-200;
       }
       while (cantidad>=100){
           cant100++;
           cantidad=cantidad-100;
       }
        System.out.println("La cantidad de billetes de 1000 son:"+cant1000);
        System.out.println("La cantidad de billetes de 500 son:"+cant500);
        System.out.println("La cantidad de billetes de 200 son:"+cant200);
        System.out.println("La cantidad de billetes de 100 son:"+cant100);
    }
}
