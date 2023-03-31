package Arrays;

public class unidimensional {
    public static void main(String[] args) {
        // generamos un array con 5 valores, y les asignamos a cada uno una posicion
        String arrayUni [] = new String[5];
        arrayUni[0] = ("Primer Elemento");
        arrayUni[1] = ("Segundo Elemento");
        arrayUni[2] = ("Tercer Elemento");
        arrayUni[3] = ("Cuarto Elemento");
        arrayUni[4] = ("Quinto Elemento");
        // con un bucle for recorremos el array e imprimimos en consola sus valores
        for (String i : arrayUni){
            System.out.println(i);
        }

    }
}
