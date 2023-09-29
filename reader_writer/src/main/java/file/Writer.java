package file;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        try {
            // Crea un objeto FileWriter con la ruta del archivo a escribir
            FileWriter fileWriter = new FileWriter("archivo.txt");

            // Escribe datos en el archivo
            String texto = "Hola, mundo!";
            fileWriter.write(texto);

            // Cierra el FileWriter
            fileWriter.close();

            System.out.println("Datos escritos en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
