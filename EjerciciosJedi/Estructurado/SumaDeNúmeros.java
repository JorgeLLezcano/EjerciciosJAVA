/*Realizar un programa que guarde un número en memoria y
determine si es par o impar */

public class SumaDeNúmeros {
    public static void main (String[] args){
        int numero= 6;
        String resultado =(numero%2 == 0)? "Es Par": "Es Impar";

        System.out.println("El numero: "+ resultado);
       /* otra posible solucion:
       if (numero%2 == 0){
            System.out.println("Este nro es par");
        }
        else {
            System.out.println("Este nro es impar");
        } */
    }
}
