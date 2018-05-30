package com.company;

import java.util.Scanner;

public class ejercicios {

    public static void main (String [] args) {

        int a = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Elige un nuemro entero: ");
        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        String nombre = "coco6";

        //switch
        switch (nombre) {

            case "antonio":
                System.out.println("el nombre introducido es antpnio");
                break;
            case "pedro":
                System.out.println("el nombre introducido es pedro");
                break;
            case "manuel":
                System.out.println("el nombre introducido es manuel");
                break;
            case "gustavo":
                System.out.println("el nombre introducido es gustavo");
                break;
            default:
                System.out.println("el nombre elegido no es ninguno de los contemplados");

        }

    }


}

