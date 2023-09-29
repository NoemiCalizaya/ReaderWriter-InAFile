package bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Getter y Setter

    // Método para guardar las personas en un archivo de texto
    public static void guardarPersonasEnArchivo(ArrayList<Persona> personas, String nombreArchivo) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));

            // Escribir los datos de las personas en el archivo
            for (Persona persona : personas) {
                escritor.write(persona.getNombre() + "," + persona.getEdad() + "," + persona.getDireccion());
                escritor.newLine();
            }

            escritor.close();
            System.out.println("Datos de las personas guardados en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos de las personas en el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Crear un ArrayList de personas
        ArrayList<Persona> personas = new ArrayList<>();

        // Agregar personas al ArrayList
        personas.add(new Persona("Juan Pérez", 30, "Calle 123, Ciudad A"));
        personas.add(new Persona("María González", 25, "Avenida 456, Ciudad B"));
        personas.add(new Persona("Pedro Sánchez", 35, "Calle 789, Ciudad C"));
        personas.add(new Persona("Luisa Hernández", 40, "Avenida 012, Ciudad D"));

        // Guardar los datos de las personas en un archivo de texto
        guardarPersonasEnArchivo(personas, "personas.txt");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

