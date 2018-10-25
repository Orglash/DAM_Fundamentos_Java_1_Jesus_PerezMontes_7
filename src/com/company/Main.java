package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos los dos números por consola y los asignamos a sus variables.
        System.out.println("Introduzca el primer número \"A\":\n");
        Scanner sc=new Scanner(System.in);
        double numeroA=sc.nextDouble();
        System.out.println("Introduzca el segundo número \"B\":\n");
        double numeroB=sc.nextDouble();

        //Comprobamos si son iguales, y si no, entonces comprobamos cual es mayor e imprimimos el mensaje apropiado.
        if(numeroA==numeroB){
            System.out.println("A y B son iguales.\n");
        }else{
            if (numeroA>numeroB) {
                System.out.println("A es mayor que B.\n");
            } else {
                System.out.println("B es mayor que A.\n");
            }
        }
    }
}
