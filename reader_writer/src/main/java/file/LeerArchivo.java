package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    
    public static void main(String[] args) {
        try{
            FileReader leer_archivo = new FileReader("archivo.txt");
            BufferedReader leer_archivo_linea = new BufferedReader(leer_archivo);

            String linea;
            while((linea = leer_archivo_linea.readLine()) != null){
                System.out.println(linea);
            }

            leer_archivo.close();
            leer_archivo_linea.close();
        }catch(IOException e1){
            e1.printStackTrace();
        }
        System.out.println("Datos leídos del archivo.");
    }
}
