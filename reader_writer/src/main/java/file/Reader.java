package file;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        try {
            // Crea un objeto FileReader con la ruta del archivo a leer
            FileReader fileReader = new FileReader("C:/Users/NOEMI/Desktop/didactica.txt");
            
            // Lee caracteres del archivo
            int caracter;
            /* El valor -1 se utiliza para representar el final de un archivo. 
            Por lo tanto, la instrucción while se ejecutará mientras haya más texto que leer del archivo.
            Cuando el valor de caracter sea -1, la instrucción while se detendrá y la ejecución 
            del programa continuará con la siguiente instrucción. */
            /* El método read() de la clase FileReader lee un carácter de un flujo de entrada.
            El método devuelve un entero que representa el carácter leído, o -1 si no hay más caracteres que leer. */
            while ((caracter = fileReader.read()) != -1) {
                // Procesa el caracter leído
                System.out.println(caracter);
                System.out.println((char) caracter);
            }

            // Cierra el FileReader
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

