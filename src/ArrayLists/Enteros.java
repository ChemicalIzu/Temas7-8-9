package ArrayLists;

import java.util.ArrayList;

public class Enteros {
    public static void main(String[] args) {
        //creamos el array de enteros
        ArrayList<Integer> listaEnteros = new ArrayList<>();

        //creamos un bucle que nos permita introducir datos
        for (int i = 1; i < 11; i++){
            listaEnteros.add(i);
        }
        System.out.println(listaEnteros);
        //realizamos un bucle que elimine los numero pares
        for (int j = 0; j < listaEnteros.size(); j++){
            if (listaEnteros.get(j) % 2 == 0){
                listaEnteros.remove(j);
            }
        }

        //Imprimimos los datos en pantalla
        System.out.println(listaEnteros);
    }
}
