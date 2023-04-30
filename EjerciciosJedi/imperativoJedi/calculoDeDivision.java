//Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
//sumen, determine si el primer número es divisible por el segundo número y muestre
//el resultado.

public class calculoDeDivision{
    public static void main(String[] args){
        int numeroUno= 12;
        int numeroDos= 3;

        int resultado = numeroUno + numeroDos;

        String divisible= (numeroUno % numeroDos ==0)? "esDivisible":"noDivisible";

        System.out.println("El resultado de la Suma es: "+ resultado+ " y "+ numeroUno +" "+divisible+ " por"+" "+numeroDos);
    }
}