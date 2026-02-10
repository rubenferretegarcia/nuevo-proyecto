package Practicas.Arrays;

import java.util.Arrays;

public class buscararrays {

    public static void main(String[] args) {
        int[] array = {5,67,8,9,1,12,14,15,356};

        //primero de todo tener el array ordenado
        Arrays.sort(array);

        //segundo le damos la info que queremos buscar y la metemos en in int para poder mostarla
        int informacion = Arrays.binarySearch(array,8  );

        //mostramos por pantalla
        System.out.println(informacion);//aquí siempre se muestra por pantalla en que posicion está el número que buscamos

        //en este vamos a poner un número que no esté en el array
        int informacion2 = Arrays.binarySearch(array,20  );

        //mostramos por pantalla
        System.out.println(informacion2);//aquí por pantalla siempre sale un número negativo


        int[] array2 = {5,67,8,9,1,12,14,15,356};//si el array no está ordenado la busqueda puede que no salga bien

        int informacion3 = Arrays.binarySearch(array,15 );

        //mostramos por pantalla
        System.out.println("informacion desordenada " + informacion3);//aquí siempre se muestra por pantalla en que posicion está el número que buscamos en este caso sale mal






    }
}
