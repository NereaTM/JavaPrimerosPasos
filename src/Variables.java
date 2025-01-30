import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // Declaración de variables
        int numeroEntero = 10;
        double numeroDecimal = 5.5;
        String texto = "Hola, Java!";
        boolean esCierto = true;

        // Impresión de variables
        System.out.println("El valor de numeroEntero es: " + numeroEntero);
        System.out.println("El valor de numeroDecimal es: " + numeroDecimal);
        System.out.println("El texto es: " + texto);
        System.out.println("El valor de esCierto es: " + esCierto);

        // Interacción con el usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nAhora tú! Vamos a asignar valores a las variables.");

        // Leer un entero
        System.out.print("Introduce un número entero: ");
        numeroEntero = scanner.nextInt();

        // Leer un número decimal
        System.out.print("Introduce un número decimal separado con coma: ");
        numeroDecimal = scanner.nextDouble();

        // Leer un texto
        scanner.nextLine(); // Consumir la línea restante
        System.out.print("Introduce un texto: ");
        texto = scanner.nextLine();

        // Leer un valor booleano
        System.out.print("Escribe 'true' o 'false': ");
        esCierto = scanner.nextBoolean();

        // Mostrar los valores ingresados
        System.out.println("\nValores ingresados:");
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número decimal: " + numeroDecimal);
        System.out.println("Texto: " + texto);
        System.out.println("Valor booleano: " + esCierto);
    }
}
