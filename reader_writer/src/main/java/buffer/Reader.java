package buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        try {
            // Crea un objeto FileReader con la ruta del archivo a leer
            FileReader fileReader = new FileReader("archivo.txt");

            // Crea un objeto BufferedReader que envuelve al FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Lee una línea del archivo
            String linea;
            /* El método readLine() de la clase BufferedReader lee una línea de texto de un flujo de entrada.
            El método devuelve una cadena que contiene el texto leído, o null si no hay más texto que leer. */
            while ((linea = bufferedReader.readLine()) != null) {
                // Procesa la línea leída
                System.out.println(linea);
            }

            // Cierra el BufferedReader y el FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

