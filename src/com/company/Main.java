package com.company;

public class Main {

    //Operadores de relación

    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 1;
    static boolean r4 = 1 <= 2;
    static boolean r5 = 1 != 2;
    static boolean r6 = 1 == 2;

    //Operadores lógicos


    public static void main(String[] args) {

        System.out.println("OPERADORES DE RELACION");
        System.out.println((r1));
        System.out.println((r2));
        System.out.println((r3));
        System.out.println((r4));
        System.out.println((r5));
        System.out.println((r6));

        System.out.println("OPERADORES LOGICOS");
        System.out.println((r1 && r2));
        System.out.println(r2 || r3);
        System.out.println(!r4);


        System.out.println("OPERADORES DE ASIGNACION");
        int b = 5;
        b++;
        System.out.println(b);
        b--;
        System.out.println(b);
        b *= 2;
        System.out.println(b);
        b /= 5;
        System.out.println(b);
        System.out.println(b++);
        System.out.println(++b);

        b +=3;
        System.out.println(b);
        b %= 5;
        System.out.println(b);




    }
}
