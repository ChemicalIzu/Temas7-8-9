package alReves;

public class Reverse {
    public static void main (String [] args){
        /*establecemos la cadena que deseamos invertir en una variable y creamos una variable vacia que contendra
        el resultado
         */
        String cadena = "Esta cadena va al reves";
        String reverse = "";
        /*hacemos un recorrido por la primera variable de forma que asignamos una posicion a cada variable
        de forma inversa que luego se asignan a nuestra variable vacia rellenando en la consola
         */
        for (int i = cadena.length() - 1; i >=0; i--){
            reverse = reverse + cadena.charAt(i);
        }
        System.out.println("Cadena original: " + cadena);
        System.out.println("cadena inversa: " + reverse);

    }
}
