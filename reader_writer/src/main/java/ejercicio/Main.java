package ejercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Leer el archivo
        FileReader fr = new FileReader("estudiantes.txt");
        BufferedReader br = new BufferedReader(fr);

        String linea;
        //El método readLine() de la clase BufferedReader lee una línea del archivo.
        while ((linea = br.readLine()) != null) {
            //El método split() de la clase String divide una cadena en un arreglo de cadenas según un separador.
            String[] datos = linea.split(",");

            // Imprimir los datos del estudiante
            System.out.println("Clave: " + datos[0]);
            System.out.println("Nombre: " + datos[1]);
            System.out.println("Apellidos: " + datos[2]);
            System.out.println("Edad: " + datos[3]);
            System.out.println("Sexo: " + datos[4]);
        }

        // Cerrar el archivo
        fr.close();
    }
}

