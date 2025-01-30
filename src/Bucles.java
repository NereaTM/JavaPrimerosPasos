import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        //FOR USADO CUANDO SABES CUANTAS VECES NECESITAS EJECUTAR CODIGO
        // Usando un bucle 'for' para imprimir números del 1 al 10
        System.out.println("Impresión usando el bucle for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //WHILE USADO CUANDO NO SABES CUANTAS VECES NECESITAS EJECUTAR CODIGO
        // Usando un bucle 'while' para imprimir números del 1 al 10
        System.out.println("\nImpresión usando el bucle while:");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        // Ejemplo interactivo: pedir al usuario un número y contar hasta él
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce un número para contar hasta él: ");
        int numero = scanner.nextInt();

        // Bucle 'for' con una condición variable
        System.out.println("Contando desde 1 hasta " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
