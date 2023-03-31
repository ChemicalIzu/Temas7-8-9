package ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listas {
    public static void main(String[] args) {
        // creamos la ArrayList y generamos sus elementos
        ArrayList <String> lista = new ArrayList<>();
        lista.add("Primer Item");
        lista.add("Segundo Item");
        lista.add("Tercer Item");
        lista.add("Cuarto Item");

        //Creamos la LinkedList y la copiamos
        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

        //recorremos ambos arrays mostrando los valores de cada elemento y mostramos en consola
        for (int i = 0; i < lista.size();i++){
            System.out.println("Elementos de la lista original: " + lista.get(i));
            }
        System.out.println(" ");

        for (int j =0; j < listaEnlazada.size(); j++){
            System.out.println("Elementos de la lista enlazada: " + listaEnlazada.get(j));
        }
    }
}
