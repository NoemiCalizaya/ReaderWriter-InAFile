package ejercicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroEstudiantes {

    public static void main(String[] args) throws IOException {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Crear un objeto File para representar el archivo de texto
        File archivo = new File("estudiantes.txt");

        // Crear un objeto FileWriter para escribir en el archivo de texto
        FileWriter fw = new FileWriter(archivo, true);

        // Solicitar al usuario los datos del estudiante
        System.out.println("Ingrese la clave del estudiante: ");
        String clave = sc.nextLine();

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese los apellidos del estudiante: ");
        String apellidos = sc.nextLine();

        System.out.println("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();

        System.out.println("Ingrese el sexo del estudiante ('M' o 'F'): ");
        char sexo = sc.next().charAt(0);

        // Escribir los datos del estudiante en el archivo de texto
        fw.write(clave + "," + nombre + "," + apellidos + "," + edad + "," + sexo + "\n");

        // Cerrar el archivo de texto
        fw.close();

        // Imprimir un mensaje de confirmación
        System.out.println("Los datos del estudiante se han guardado correctamente en el archivo de texto.");
    }
}

