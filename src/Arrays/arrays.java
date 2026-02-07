import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {

        String[] array;//declaracion
              array = new String[5];//instanciar y inicializar

        //para asignar valores hay que hacerlo 1 a 1
        array[0]= "hola ";
        array[1]= "me llamo ";
        array[2]= "don ";
        array[3]= "emanuel ";
        array[4]= "de la rosa";

        //para mostrar string hay q hacer un foreach
        for (String saludo : array) {

            //declaramos
            System.out.print(saludo);
        }
        System.out.println(" ");
        //tambien se hace con for asi
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]);

        }
        System.out.println(" ");
        //otra forma de declarar los arrays son asi
        int[] arrays2 ={6, 8 , 2, 9, 2};
        System.out.println("sin modificar " +  Arrays.toString(arrays2));
        /*todos los valores se pueden modificar eligiendo cual queremos modicar
         entre corchetes pondremos la posicion a modificar
         */
        arrays2[2]= 6;
        System.out.println("modificado " + Arrays.toString(arrays2));

        //por ultimo para terminar los arrays pueden ir mix con el adjetivo object
        Object[] arraymix = {2,"raul",9.8F,false,"m" };
        //lo enseñamos por 'pantalla
        System.out.println(Arrays.toString(arraymix));

    }
}
