public class Multiplicacion{
    public static void main(String[] args){
        double numeroReal1= 3.5;
        double numeroReal2=2.0;
        
        int numeroEntero1= 4;
        int numeroEntero2=6;

        double resultadoReal= numeroReal1 * numeroReal2;
        int resultadoEntero= numeroEntero1* numeroEntero2;

        double resultadoFinal= resultadoReal+ resultadoEntero;

        System.out.println("Resultado de multiplicacion de reales: "+  resultadoReal);
        System.out.println("Resultado de multiplicacion de enteros: "+ resultadoEntero);
        System.out.println("suma de resultados: "+ resultadoFinal);
    }
}