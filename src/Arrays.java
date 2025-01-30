import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Definición e inicialización de un array de enteros
        // Un array es una estructura de datos que permite almacenar múltiples valores del mismo tipo.
        // En este caso, 'numeros' es un array de enteros, inicializado con los valores {1, 2, 3, 4, 5}
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Valores en el array inicial:");

        // Bucle para recorrer el array y mostrar sus valores
        // 'numeros[i]' accede al valor almacenado en la posición 'i' del array.
        // 'numeros.length' devuelve el tamaño del array, es decir, la cantidad de elementos que contiene.
        // En este caso, el tamaño es 5, ya que el array tiene 5 elementos.
        for (int i = 0; i < numeros.length; i++) {
            // 'numeros[i]' se refiere al valor del array en el índice 'i'.
            // Por ejemplo, 'numeros[0]' es el primer valor (1), 'numeros[1]' es el segundo valor (2), y así sucesivamente.
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Modificación de un valor en el array
        // Se cambia el valor del índice 2 (que originalmente es 3) por 10.
        numeros[2] = 10;
        System.out.println("\nArray después de modificar un valor:");

        // Bucle para mostrar el array después de modificar un valor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Solicitar valores del usuario para llenar un array
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce el tamaño del array: ");
        int tamaño = scanner.nextInt();  // El tamaño del array será ingresado por el usuario

        // Se define un nuevo array basado en el tamaño proporcionado por el usuario
        int[] arrayUsuario = new int[tamaño];  // El array se crea con el tamaño dado por el usuario

        // Se llena el array con valores introducidos por el usuario
        System.out.println("Introduce " + tamaño + " números:");
        for (int i = 0; i < tamaño; i++) {
            // 'arrayUsuario[i]' se usa para asignar valores a cada posición del array
            // Por ejemplo, si el usuario introduce el número 7, 'arrayUsuario[0]' será 7 en la primera iteración.
            arrayUsuario[i] = scanner.nextInt();
        }

        // Imprimir el array ingresado por el usuario
        System.out.println("\nArray ingresado por el usuario:");
        for (int i = 0; i < arrayUsuario.length; i++) {
            // Mostrar el valor de cada índice en el array
            System.out.println("Índice " + i + ": " + arrayUsuario[i]);
        }
    }
}
