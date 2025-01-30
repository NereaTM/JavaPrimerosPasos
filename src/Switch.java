import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Menú de opciones:");
        System.out.println("1 - Saludar");
        System.out.println("2 - Mostrar fecha actual");
        System.out.println("3 - Salir");
        System.out.print("Elige una opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¡Hola! Que tengas un gran dia ");
                break;
            case 2:
                System.out.println("La fecha actual es: " + java.time.LocalDate.now());
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.");
                break;
        }

        scanner.close();
    }
}
