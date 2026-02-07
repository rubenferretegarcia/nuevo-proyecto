import java.util.Arrays;

public class arraysordenados {


    public static void main(String[] args) {

        System.out.println("-------------ORDENAR ARRAYS DOBLES-----------");
        //CREAMOS ARRAY
        double[] orden = {2.3, 4.6,-7.9,1.1};

        System.out.println("desordenado " + Arrays.toString(orden));

        //prodecemos a ordenarlos de menor a mayor
        Arrays.sort(orden);

        //mostramos ordenado el array

        System.out.println("ordenado " +Arrays.toString(orden));

        System.out.println("-------------ORDENAR ARRAYS int-----------");
        //CREAMOS ARRAY
        int[] orden2 = {2, 4,-7,1};

        System.out.println("desordenado " + Arrays.toString(orden2));

        //prodecemos a ordenarlos de menor a mayor
        Arrays.sort(orden2);

        //mostramos ordenado el array

        System.out.println("ordenado " +Arrays.toString(orden2));

        System.out.println("-------------ORDENAR ARRAYS char-----------");
        //CREAMOS ARRAY
        char[] orden3 = {'B', 'D','Z','J','R'};

        System.out.println("desordenado " + Arrays.toString(orden3));

        //prodecemos a ordenarlos de menor a mayor
        Arrays.sort(orden3);

        //mostramos ordenado el array

        System.out.println("ordenado " +Arrays.toString(orden3));

        System.out.println("-------------ORDENAR ARRAYS STRING-----------");
        //CREAMOS ARRAY
        String[] orden4 = {"mono", "gato", "perro", "caballo", "cebra"};

        System.out.println("desordenado " + Arrays.toString(orden4));

        //prodecemos a ordenarlos de menor a mayor
        Arrays.sort(orden4);

        //mostramos ordenado el array

        System.out.println("ordenado " +Arrays.toString(orden4));

        System.out.println("-------------ORDENAR ARRAYS STRING 2.0 -----------");
        //CREAMOS ARRAY
        String[] orden5 = {"34", "67", "987", "76","600","caballo, Mono"};/*la logica de aqui es que el lector mira los primeros numeros de menor a mayor (3 6 6 7 9)
         y despues si se repiten mira el segundo numero en este caso el 6 se repite y como 600 lleva 0 va a ir delante del 67. ya despues las palabras van al final y primero mayusculas */

        System.out.println("desordenado " + Arrays.toString(orden5));

        //prodecemos a ordenarlos de menor a mayor
        Arrays.sort(orden5);

        //mostramos ordenado el array

        System.out.println("ordenado " +Arrays.toString(orden5));


    }
}
