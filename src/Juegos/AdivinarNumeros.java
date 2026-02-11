package Juegos;
import java.util.Scanner;
import java.util.Random;

public class AdivinarNumeros {
    public static void main(String[] args) {
        //título del juego//
        System.out.println("====================================\n" + "        ADIVINA EL NÚMERO\n" +
                "====================================\n" + "\n" + "El juego ha generado un número secreto del 0 al 100.\n" + "Tu objetivo es adivinarlo introduciendo números por teclado.\n" + "\n" +
                "Después de cada intento, el juego te indicará\n" + "si el número secreto es mayor o menor.\n" + "\n" + "solo tienes 10 intentos .\n" + "\n" + "¡Buena suerte!\n");

        //1º vamos a crear las variables y el número oculto random
        Random random = new Random();
        int noculto =  random.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int intento = 0;

        //2º vamos a crear un bucle for con 10 intentos  donde el usuario tendra que intentar adivinar el número

        for (int i = 0;i < 10; i++){

            System.out.println("INTENTO NUMERO: " + (i+1));
            intento= sc.nextInt();

            //vamos a poner un bucle while por si pusiera un número que no está entre 0 y 100 para que no reste oportunidades
            while(intento < 0 || intento > 100){
                System.out.println("el numero tiene que estar entre 0 y 100,  no elijas uno fuera de estos rangos");
                System.out.println("elige otro número");
                intento= sc.nextInt();

            }

            //creamos una condicion para ver si el número introducido es igual mayor o menor que el número oculto
            if (intento < noculto ){
                System.out.println("el numero oculto es mayor\n");
            }else if (intento > noculto){
                System.out.println("el numero oculto es menor\n");
            }else {
                System.out.println("¡¡ENHORABUENA HAS ACERTADO!!\n");
                break;
            }

        }

        if (intento != noculto){
            System.out.println("PERDISTE");
            System.out.println("el numero oculto era el: " + noculto);
        }




    }
}
