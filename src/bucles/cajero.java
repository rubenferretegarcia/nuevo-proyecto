package bucles;
import java.util.Scanner;

public class cajero {

    public static void main(String[] args) {
        System.out.println("-----------------CAJERO AUTOMATICO--------------------");

        /*✅ Ejercicio do-while: Cajero automático simple

            Haz un programa que simule un cajero automático.

            Requisitos:
           - El programa empieza con 1000€ de saldo.

           - Muestra un menú que se repite usando do-while:
            1. Consultar saldo
            2. Ingresar dinero
            3. Retirar dinero
            4. Salir

            Según la opción elegida:
             -Consultar saldo → muestra el saldo actual.
             -Ingresar → pide cantidad y la suma al saldo.
             -Retirar → pide cantidad y solo deja retirar si hay dinero suficiente.
             -Salir → termina el programa.
            El menú debe repetirse hasta elegir Salir.

         */
        //1º declaramos variables
        int saldo = 1000;
        int ingreso = 0;
        int retiro = 0;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        //2º vamos a montar el menu dentro del bucle
        do{
            System.out.println("BIENVENIDO A TU BANCO");
            System.out.println("QUE OPERACION DESEA REALIZAR:");
            System.out.println("1. consultar saldo");
            System.out.println("2. ingresar dinero");
            System.out.println("3. retirar dinero");
            System.out.println("4. salir");
            int operacion = sc.nextInt();

            //3º vamos a hacer un switch con cada una de las elecciones y a realizar su accion
            switch (operacion){
                //3.1 aqui mostramos por pantalla el saldo
                case 1:
                    System.out.println("su saldo es de " + saldo + "€\n\n");
                    break;
                //3.2 en este caso preguntamos cuanto dinero quiere ingresar y lo sumamos a la variable saldo
                case 2:
                    System.out.println("¿cuanto dinero quieres ingresar?");
                    ingreso= sc.nextInt();
                    saldo += ingreso;
                    System.out.println("su saldo ha sido actualizado\n\n");
                    break;
                //3.3 en este caso preguntamos cuanto dinero quiere retirar
                case 3:
                    System.out.println("¿cuanto dinero quieres retirar?");
                    retiro = sc.nextInt();
                    //3.3.1 y hacemos una condicional de si tiene o no el dinero en su cuenta si tiene el dinero lo restamos y si no tiene ponemos saldo insuficiente
                    if (retiro <= saldo){
                        saldo -= retiro;
                        System.out.println("su operacion se ha realizado correctamente\n\n ");
                    }else {
                        System.out.println("saldo insuficiente\n\n");
                    }
                    break;
                //3.4 este caso es para salir del bucle do while
                case 4:
                    System.out.println("muchas gracias\n\n");
                    salir = true;
                    break;

                default:
                    System.out.println("DISCULPE ESA ACCION NO ES POSIBLE ELIGA UN NUMERO DEL 1-4 SEGUN LA OPCION REQUERIDA\n\n");
                    ;break;



            }

            //4º hacemos una pregunta de si desea seguir haciendo gestiones y dependiendo de la respuesta salimos del programa o dejamos que se vuelva a repetir
            System.out.println("desea realizar alguna otra operacion");
            System.out.println("1. SI");
            System.out.println("2. NO");
            operacion = sc.nextInt();
            switch (operacion){

                case 1:
                    break;

                case 2:
                    salir = true;
                 break;

                default: break;
            }


        }while(salir ==false);


    }
}
