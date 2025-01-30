package Poo;

public class Persona {
    private String nombre; // Encapsulamos la variable

    //  Constructor para inicializar el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //  Metodo para cambiar el nombre (opcional si usamos el constructor)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}
