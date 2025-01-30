package Poo;
import java.util.Scanner; // Importamos librerías


public class Impresion {
    // creo el objeto scanner STATIC aqui para poderlo utilizar en toda la clase impresion
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Ejemplo de impresión
        System.out.println(" Ejemplo de impresión:");
        // Utilizamos la clase EjemploImpresion y su metodo ejecutar
        // En este caso no le pasamos ninguna variable/atributo
        EjemploImpresion.ejecutar();

        // Ejemplo de programación orientada a objetos
        System.out.println("\n Ejemplo de Programación Orientada a Objetos:");
        System.out.println("Introduce un nombre");
        // Rcogemos el nombre por pantalla
        String nombre = scanner.nextLine();
        // En este caso le pasamos la variable nombre al constructor de persona
        Persona persona = new Persona(nombre);
        persona.saludar();

        //ejemplo sin el scaner
        persona.setNombre("Pepa");
        persona.saludar();
    }
    public static void ejecutar() {
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
        scanner.close();
    }
}
