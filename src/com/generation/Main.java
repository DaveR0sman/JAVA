package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Scanner sc = new Scanner(System.in);
        System.out.println("ingresa la medida del primer angulo del triangulo");
        int a1 = sc.nextInt();

        System.out.println("Ingresa la medida del segundo angulo del triangulo");
        int a2 = sc.nextInt();

        System.out.println("Ingresa la medida del tercer angulo del triangulo");
        int a3 = sc.nextInt();

        if(a1+a2+a3 == 180) {
            System.out.println("felicidades tu triangulo es valido ");
        } else {
            System.out.println("revisa tus medidas, esto no forma un triangulo.");
        }
        sc.close();*/


        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año");
        int aiio = sc.nextInt();

        if ((aiio % 4 == 0 && aiio % 100 != 0) || (aiio % 100 == 0 && aiio % 400 == 0)) {
            System.out.println("El año " + aiio + " es bisiesto");
        } else {
            System.out.println("El año " + aiio + " no es bisiesto");
        }
        sc.close();
    }
}
