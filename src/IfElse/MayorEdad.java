package IfElse;

import java.util.Scanner;
public class MayorEdad {
    public static void main(String[] args) {

        System.out.println("----------EJERCICIO DE IF/ELSE--------------");
        /*EJERCICIO PEDIDO A CHATGPT: Debes crear un programa que:
                       - Pida al usuario su edad por teclado.
                       - Compruebe la edad introducida.
                       - Muestre un mensaje según el caso. --> Si la edad es menor que 0, mostrar:Edad no válida
                                                               Si la edad es menor de 18, mostrar:No puedes entrar
                                                               Si la edad es 18 o mayor, mostrar:Puedes entrar
         */
        //1º declaro la variable edad y el scanner
        int edad;
        Scanner sc = new Scanner(System.in);

        //2º pregunto cuantos años tiene y recojo la información
        System.out.println("cuantos años tienes");
        edad = sc.nextInt();

        //3º ahora con los datos recogidos procedemos a mostrar si puede o no puede pasar
        if (edad>0 && edad<18){
            System.out.println("Lo siento no puedes pasar :|");
        }

        if (edad>=18){
            System.out.println("Puedes pasar :)");
        }

        if (edad<=0){
            System.out.println("Edad no valida :(");
        }

    }

}
