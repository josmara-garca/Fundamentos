package com.company;

import java.util.Scanner;

public class ejercicio4 {


    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int factorial = 1;
        int i = 0;

        System.out.print("Escribe un nuemro: ");
        a = sc.nextInt();

        for (i = a; i > 0; i--) {
            factorial = i * factorial;
            //o factorial *= a
        }

        System.out.println("El factorial de " + a + "es: " + factorial);
    }
}
