package Estructurado;

public class TrianguloDeAsteriscos{
    public static void main(String[] args) {
        int cantidad = 5; // Número de filas del triángulo
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
   

