package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirArchivo {
    public static void main(String[] args) {
        File archivo = new File("archivo.txt");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        try{
            /* El parámetro true indica que el archivo se abrirá en modo de adición.
            En este modo, los datos se escribirán al final del archivo, sin sobrescribir
            los datos existentes. */
            FileWriter escribir_archivo = new FileWriter(archivo, true);
            while (!cadena.equalsIgnoreCase("FIN")) {
                escribir_archivo.write(cadena);                        //se escribe la cadena en el fichero
                cadena = sc.nextLine();                         //se introduce por teclado una cadena de texto    
            }
            escribir_archivo.close();
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
        System.out.println("Datos escritos en el archivo.");
    }
}
