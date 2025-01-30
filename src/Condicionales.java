import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        // Introducción
        System.out.println("Bienvenido a la práctica de condicionales!");

        // Solicitar un número al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Condicionales para evaluar el número
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        if (numero == 1) {
            System.out.println("es uno");
        } else if (numero == 2) {
            System.out.println("es dos");
        } else if (numero == 3) {
            System.out.println("es tres");
        }

        // Otra condición: verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        // Condición adicional: rango del número
        // El && significaría 'y', osea que las 2 condiciones se tienen que cumplir
        if (numero >= 1 && numero <= 10 || numero > 20) {
            System.out.println("AAAAAAAAAAAAAAAAAEl número está en el rango de 1 a 10.");
        } else {
            System.out.println("AAAAAAAAAAAAEl número está fuera del rango de 1 a 10.");
        }

        // El || significaría 'o', osea que solo 1 de las condiciones se tienen que cumplir
        if (numero < -10 || numero > 20) {
            System.out.println("El número está fuera del rango de -10 a 20.");
        } else {
            System.out.println("El número está dentro del rango de -10 a 20.");
        }

        System.out.println("\nGracias por practicar condicionales en Java!");
    }
}

