package Arreglos;

public class ArrayBi02 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][6]; 

        numeros[0][0] = 0;
        numeros[0][1] = 30;
        numeros[0][2] = 2;
        numeros[0][3] = 0;
        numeros[0][4] = 0;
        numeros[0][5] = 5;
        numeros[1][0] = 75;
        numeros[1][1] = 0;
        numeros[1][2] = 0;
        numeros[1][3] = 0;
        numeros[1][4] = 0;
        numeros[1][5] = 0;
        numeros[2][0] = 0;
        numeros[2][1] = 0;
        numeros[2][2] = -2;
        numeros[2][3] = 9;
        numeros[2][4] = 0;
        numeros[2][5] = 11;

        int fila, columna;

        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila: " + fila);
            for (columna = 0; columna < 6; columna++) {
                System.out.printf("%10d", numeros[fila][columna]);
            }
            System.out.println();
        }
    }
}