package Practicas.Metodos;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        System.out.println("--------------------CALCULADORA-------------------");



        //1ºDeclaramos las variables

        double x = 0;
        double y = 0;
        boolean salir = false;
        String operacion = "";
        Scanner sc = new Scanner(System.in);
        double resultado = 0;

        //2º vamos a entrar en un do... while para que pueda hacer todas las operaciones que quiera hasta salir

        while (salir == false){

            //3º dentro del do while preguntamos que operacion desea realizar y hacemos un switch
            System.out.println("por favor eliga entre nuestras siguientes operaciones:\n" +
                    " 1. sumar \n 2. restar \n 3. multiplicar \n 4. dividir \n 5. salir");
            operacion =sc.next().toLowerCase();


            switch (operacion){
                case "sumar":
                    System.out.println("eligue dos numeros para realizar la operacion: ");
                    x=sc.nextDouble();
                    y=sc.nextDouble();
                    resultado= suma(x,y);
                    System.out.println("el resultado es: " + resultado + "\n");
                    break;

                case "restar":
                    System.out.println("eligue dos numeros para realizar la operacion: ");
                    x=sc.nextDouble();
                    y=sc.nextDouble();
                    resultado= resta(x,y);
                    System.out.println("el resultado es: " + resultado + "\n");
                    break;

                case "multiplicar":
                    System.out.println("eligue dos numeros para realizar la operacion: ");
                    x=sc.nextDouble();
                    y=sc.nextDouble();
                    resultado= multiplicacion(x,y);
                    System.out.println("el resultado es: " + resultado + "\n");
                    break;

                case "dividir":
                    System.out.println("eligue dos numeros para realizar la operacion: ");
                    x=sc.nextDouble();
                    y=sc.nextDouble();
                    resultado= division(x,y);
                    System.out.println("el resultado es: " + resultado + "\n");
                    break;

                case "salir":
                    System.out.println("MUCHAS GRACIAS :)");
                    salir = true;
                    break;

                default:
                    System.out.println("esta opcion no es valida eliga entre sumar, restar, multiplicar, dividir o salir");
                    break;
            }

            System.out.println("DESEAS HACER OTRA OPERACION \n si desea realizar otra operacion escriba ¨Y¨ si desea salir escribe ¨N¨");
            char out = sc.next().toUpperCase().charAt(0);
            if (out == 'N'){
                salir = true;
            }






        }





    }
    public static double suma(double x, double y) {
    double resultado = x + y ;
    return resultado;
    }

    public static double resta(double x, double y) {
        double resultado = x - y ;
        return resultado;
    }

    public static double division(double x, double y) {
        double resultado = x / y ;
        return resultado;
    }

    public static double multiplicacion (double x, double y) {
        double resultado = x * y ;
        return resultado;
    }


}
