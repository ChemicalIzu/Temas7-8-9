package codigoFinal;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Final {
    public static void main(String[] args) throws IOException {

        /*Creamos un HashMap que contendra las claves y valores de un ejercicio y un peso que el cliente introduce
        manualmente
         */
        HashMap <String, Integer> basicsMarks = new HashMap<>();
        System.out.println("Introduzca los pesos en los 4 basicos en orden (DL, S, ChP,Cl): ");
        Scanner Keyboard = new Scanner (System.in);
        int peso1 = Keyboard.nextInt();
        int peso2 = Keyboard.nextInt();
        int peso3 = Keyboard.nextInt();
        int peso4 = Keyboard.nextInt();
        basicsMarks.put("Deadlift", peso1);
        basicsMarks.put("Squat", peso2);
        basicsMarks.put("Chest Press", peso3);
        basicsMarks.put("Clean", peso4);

        //Creamos un array donde extraemos claves y valores
        Integer[] cargaCliente = basicsMarks.values().toArray(new Integer[0]);
        System.out.println(Arrays.toString(cargaCliente));

        //creamos el fichero donde almacenaremos la informacion, hacemos una copia y la implementamos en el nuevo fichero

        PrintStream file = new PrintStream("C:\\Users\\srhou\\Desktop\\material programacion\\temas7-8-9\\src\\codigoFinal\\cliente1.txt");
        file.println(cargaCliente);
        file.close();

        InputStream fileIn = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        byte[] datos = fileIn.readAllBytes();
        fileIn.close();

        PrintStream fileOut = new PrintStream("cliente1copia.txt");
        fileOut.write(datos);
        fileOut.close();



        
    }
}
