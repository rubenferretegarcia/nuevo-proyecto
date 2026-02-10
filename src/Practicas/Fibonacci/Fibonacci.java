package Practicas.Fibonacci;

import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("vamos a hacer el metodo de fibonacci");

        // 1º declaramos variables y scanner
        Scanner sc = new Scanner(System.in);
        int fibonacci = 1;
        int fibprevius = 0;
        int sum = 0;
        int number = 0;


        //2º preguntamos cuantas veces quiere que se repita la secuencia

        System.out.println("escriba el numero de secuencias que quieras observar");
        number = sc.nextInt();



        //hacemos el bucle
        for(int i = 0; i < number; i++){

            System.out.print(fibprevius +  ", ");
            sum = fibonacci + fibprevius;
            fibprevius = fibonacci;
            fibonacci = sum;



        }

    }
}
