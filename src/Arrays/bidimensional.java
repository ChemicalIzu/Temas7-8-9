package Arrays;

public class bidimensional {
    public static void main(String[] args) {
        //creamos un array con dos dimensiones y valores enteros
        int arrayBidi [][] = new int [3][3];
        arrayBidi [0][0] = 1;
        arrayBidi [0][1] = 2;
        arrayBidi [0][2] = 3;
        arrayBidi [1][0] = 4;
        arrayBidi [1][1] = 5;
        arrayBidi [1][2] = 6;
        arrayBidi [2][0] = 7;
        arrayBidi [2][1] = 8;
        arrayBidi [2][2] = 9;

        //con un bucle for recorremos el array mostando por consola el valor y su posicion
        for (int i = 0; i < arrayBidi.length; i++){
            for (int j = 0; j < arrayBidi[i].length; j++){
                System.out.println("estoy en la fila: " + i + " y columna: " + j);
                System.out.println("el numero en esta posicion es: " + arrayBidi[i][j]);
            }
        }

    }
}
