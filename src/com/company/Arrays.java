package com.company;

public class Arrays {
    int a = 10;
    int [] numeros = new int [a];
    static int [] otrosNumeros = {1,2,3,4,5};
    int numero [] = new int [a];

    public static void main(String[] args){

        System.out.println(otrosNumeros [4]);

        otrosNumeros[1] = 3;

        int size = otrosNumeros.length;

        System.out.println(size);

        //array de varias dimensiones

        int[][]arrayBidimensional = new int [2][4];
        int[]array2[]= new int[4][4];
        int array2b [][]={{0,1,2,3,},{2,1,5,4}, {5,4,7,8},{6,5,4,1}};
        // es un array 4 por 4

        System.out.println(array2b[1][2]);
        //Me pintaría 5

        int [][][] array3d = { {{1,2},{2,4}},{{5,4},{8,4}} };
        // array 2, 2, 2


    }

}
