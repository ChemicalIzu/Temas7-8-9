package Excepciones;
public class Excepcion {
    public static void main(String[] args) {
        dividirCero(4,0);
    }
    public static int dividirCero (int paramA, int paramB) throws ArithmeticException{
        int resultado = 0;
        try{
            resultado = paramA/paramB;
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse " + e);
        }finally {
            System.out.println("Demo de código");
        }
        return resultado;
    }
}
