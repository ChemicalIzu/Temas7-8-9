package EntradaSalida;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Archivos {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca fichero de origen: ");
        String fileIn = keyboard.nextLine();
        System.out.println("Introduzca fichero de destino: ");
        String fileOut = keyboard.nextLine();
        copias(fileIn, fileOut);
    }
    public static void copias(String fileIn, String fileOut) {

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e){
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
