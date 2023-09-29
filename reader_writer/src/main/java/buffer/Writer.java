package buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        try {
            // Crea un objeto FileWriter con la ruta del archivo a escribir
            FileWriter fileWriter = new FileWriter("archivo.txt");

            // Crea un objeto BufferedWriter que envuelve al FileWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribe datos en el archivo
            String texto = "Java es un lenguaje de programacion";
            bufferedWriter.write(texto);

            // Cierra el BufferedWriter y el FileWriter
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Datos escritos en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

