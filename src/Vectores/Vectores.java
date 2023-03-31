package Vectores;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        //creamos un vector de clave String y le damos una capacidad inicial y un incremento defininidos

        Vector<String> vector = new Vector<>(5,2);

        //asignamos valores a cada elemento de nuestro vector
        vector.add("Elemento 1");
        vector.add("Elemento 2");
        vector.add("Elemento 3");
        vector.add("Elemento 4");
        vector.add("Elemento 5");

        /*eliminamos el valor en posicion 2 y el valor en posicion 3, al eliminar el primero, su siguiente toma la
        posicion previa y por eso el codigo se repite
         */
        vector.remove(1);
        vector.remove(1);

        //Imprimimos el resultado en consola
        System.out.println("Elementos del vector: " + vector);

        /* para el Vector que debe añador mil elementos tomaremos un ejemplo de Vector y lo explicaremos en comentarios
         */
        Vector<Integer> vector2 = new Vector<>();
        /*la capacidad inicial de este vector es por defecto de 10, con un incremento de su doble. lo mostraremos
        haciendo un aumento y explicando sus desventajas
         */
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);
        vector2.add(6);
        vector2.add(7);
        vector2.add(8);
        vector2.add(9);
        vector2.add(10);
        vector2.add(11);

        System.out.println("tamaño del vector: " + vector2.size() + " capacidad del vector: " + vector2.capacity());
        /* tras imprimir comprobamos que el tamaño corresponde a los espacios que se ocupan del vector, y a su vez
        vemos como la capacidad se ha duplicado, este proceso se da mediante la copia de este vector que actua como un
        array dinamico sobre un array de mucha mayor capacidad, lo cual supone un alto coste computacional, si
        trataramos de añadir 1000 elementos de forma simultanea el coste de esa operacion seria muy elevado, es mucho mas
        recomendable establecer valores aproximados a nuestro obejtivo.
         */
    }
}
