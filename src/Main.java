// Importamos librerías necesarias para entrada de datos
import Poo.Persona;
import java.util.Scanner;

//  Clase principal donde veremos los conceptos básicos de Java
public class Main {
    public static void main(String[] args) {

        // Impresión en consola
        System.out.println(" Bienvenido a Java!");

        // Variables y tipos de datos
        int numeroEntero = 10;       // Numero entero
        double numeroDecimal = 5.5;  // Numero decimal
        boolean esJavaGenial = true; // Booleano (verdadero o falso)
        char letra = 'J';            // Un solo carácter
        String texto = "Hola, Java"; // Cadena de texto

        System.out.println("\n Variables en Java:");
        System.out.println("Numero entero: " + numeroEntero);
        System.out.println("Numero decimal: " + numeroDecimal);
        System.out.println("Booleano: " + esJavaGenial);
        System.out.println("Caracter: " + letra);
        System.out.println("Texto: " + texto);

        // Entrada de datos con Scanner
        Scanner scanner = new Scanner(System.in); // Creamos el objeto
        System.out.print("\n Ingresa tu nombre: ");
        String nombreUsuario = scanner.nextLine(); // Creamos la variable y la recogemos por pantalla
        System.out.println("Hola, " + nombreUsuario + "!"); // Enviamos la variable

        // Manejo de Excepciones (try-catch)
        System.out.println("\n Manejo de excepciones:");
        try {
            int resultado = 10 / 0; // Error: división por cero
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }

        // Cerrar Scanner
        scanner.close();
    }
}
