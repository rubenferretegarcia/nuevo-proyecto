package Practicas.bucles;

import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        System.out.println("---------------EJERCICIO NOTAS DE EXÁMENES-----------------");

        /*
        *Requisitos del programa:

            -Pregunta cuántos alumnos hay.
            -Usa un bucle for para pedir la nota de cada alumno.
            -Mientras lees notas, debes calcular:
                    -Nota media.
                    -Nota más alta.
                    -Nota más baja.
            -Cuántos aprobaron (≥5).
            -Cuántos suspendieron.
            -Al final muestra algo como:    Nota media: 6.3
                                            Nota más alta: 9
                                            Nota más baja: 2
                                            Aprobados: 7
                                            Suspendidos: 3

                * */

        //1º creamos variables
        int alumnos = 0;
        Scanner sc =new Scanner(System.in);
        //creo la variable suma para recoger una suma de todas las notas
        double suma = 0;

        //2º creamos una pregunta de cuantos alumnos hay para darle valor a la variable alumnos
        System.out.println("cuantos alumnos hay en la clase ");
        alumnos = sc.nextInt();

        //3º creamos el array con la cantidad de personas que hay en la clase
        double[] notas = new double[alumnos];

        //4º con la información de los alumnos creamos un bucle for y preguntamos las notas y lo guardamos en el array notas
        for(int i = 1, x = 0; i<= alumnos;i++, x++ ) {

            System.out.println("por favor indica la nota del alumno " + i);
            double recoger = sc.nextDouble();

            //5º ponemos un while con una condicion dentro para que no puedan poner una nota menor a un 0 y el while para que el programa pueda seguir funcionando
            while (recoger < 0 || recoger >10) {
                if (recoger < 0) {
                    System.out.println("la nota no puede ser menor a 0");
                    System.out.println("por favor indica la nota del alumno " + i);
                    recoger = sc.nextDouble();
                } else if (recoger > 10) {
                    System.out.println("la nota no puede ser mayor a 10");
                    System.out.println("por favor indica la nota del alumno " + i);
                    recoger = sc.nextDouble();

                }
            }
            //6º metemos en el array notas la nota de cada alumno
            notas[x] = recoger;


            suma += recoger;

        }


        //7º ya hemos obtenido todas las notas procedemos a hacer las variables para calcular la media, la nota más alta y la más baja
            double media = 0;
        //ATENCION SIEMPRE ESTAS VARIABLES INICIALIZARLAS EN EL PRIMER PUESTO DEL ARRAY NOTAS
            double maxnota = notas[0];
            double notamin = notas[0];
            int suspensos = 0;
            int aprobados = 0;

            media = suma / alumnos;

            //8º hacemos 1 Practicas.Switchcase.bucles for y con las condiciones obtenemos los resultados de nota mas alta, nota mas baja y si estan supensos o aprobados
            for (int i = 0; i < notas.length; i++){
                if(maxnota <= notas[i]){
                    maxnota = notas[i];
                }
                if(notamin >= notas[i]){
                    notamin = notas[i];
                }
                if(notas[i] < 5){
                    suspensos++;
                } else { aprobados++; }
            }




         //10º por último paso solo tenemos que escribir todos los datos por pantalla y listo
        System.out.println("Nota media: " + media);
        System.out.println("Nota mas alta: " + maxnota);
        System.out.println("Nota mas baja: " + notamin);
        System.out.println("Nº de aprobados: " + aprobados);
        System.out.println("Nº de suspensos: " + suspensos);





    }
}
