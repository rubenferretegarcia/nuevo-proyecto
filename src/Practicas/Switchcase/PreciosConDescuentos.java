package Practicas.Switchcase;
import java.util.Scanner;
public class PreciosConDescuentos {
    public static void main(String[] args) {

        System.out.println("-------------EJERCICIO PRECIOS CON DESCUENTOS-------------");
            /*Pide al usuario que introduzca el tipo de producto:
            1 → Libro
            2 → Película
            3 → Videojuego
            Pide el precio del producto.
            Dependiendo del tipo de producto, aplica un descuento:
            Libro → 10% si el precio es mayor a 20
            Película → 5% si el precio es mayor a 15
            Videojuego → 20% si el precio es mayor a 50
            Muestra el precio final después del descuento.
            Si el usuario introduce un número de producto que no existe, muestra un mensaje de error.*/

        //1º declaro variables
        double precio = 0;
        Scanner sc = new Scanner(System.in);
        int articulo;


        //2º pedimos que eliga entre los 3 artículos y recogemos la información
        System.out.println("eligue entre estos 3:\n1. Libro\n2. Película\n3. Videojuego\n Por favor elige poniendo el numero que esta al lado de cada objeto ");
        articulo = sc.nextInt();

        //3º creamos el switch
        switch (articulo){
            case 1:
                //4º preguntamos el valor si es mayor a 20 se le hace un descuento del 10%
                System.out.println("cuanto cuesta el libro");
                precio = sc.nextInt();

                //5º creamos la condición
                if (precio<=0){
                    System.out.println("precio no valido");
                } else if (precio < 20) {
                    System.out.println("este articulo no tiene descuento");
                    System.out.println("por lo que su precio es: "  + precio);

                }else {
                    System.out.println("el articulo tiene un descuento del 10%");
                    //creamos la variable del descuento del libro
                    double descuentolibro = precio * 0.1 - precio;
                    System.out.println("por lo que su precio es: " + descuentolibro);

                }
                break;

            case 2 :
                //6º preguntamos el valor si es mayor a 20 se le hace un descuento del 5%
                System.out.println("cuanto cuesta la pelicula");
                precio = sc.nextInt();

                //7º creamos la condicion
                if (precio<=0){
                    System.out.println("precio no valido");
                } else if (precio < 15) {
                    System.out.println("este articulo no tiene descuento");
                    System.out.println("por lo que su precio es: " + precio);

                }else {
                    System.out.println("el articulo tiene un descuento del 5%");
                    //creamos la variable del descuento de la pelicula
                    double descuentopelicula = precio * 0.05 - precio;
                    System.out.println("por lo que su precio es: " + descuentopelicula);

                }
                break;

            case 3:
                //8º preguntamos el valor si es mayor a 20 se le hace un descuento del 10%
                System.out.println("cuanto cuesta el videojuego");
                precio = sc.nextInt();

                //9º creamos la condición
                if (precio<=0){
                    System.out.println("precio no valido");
                } else if (precio < 50) {
                    System.out.println("este articulo no tiene descuento");
                    System.out.println("por lo que su precio es: " + precio);

                }else {
                    System.out.println("el articulo tiene un descuento del 20%");
                    //creamos la variable del descuento del videojuego
                    double descuentojuego = precio * 0.2 - precio;
                    System.out.println("por lo que su precio es: " + descuentojuego);

                }
                break;

            default:
                System.out.println("la opcion que has dado no esta admitida");
                break;
        }


    }
}
