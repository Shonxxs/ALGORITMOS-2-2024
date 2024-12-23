package Arreglos;

public class ArrayBi03 {
    public static void main(String[] args) {
        int[][] num = new int[4][5];

        int f, c;
        System.out.println("Ingrese los numeros (enteros) en el array");
        for (f = 0; f < 4; f++) {
            for (c = 0; c < 5; c++) {
                System.out.println("fila" + f + ", columna " + c + ":");
                num[f][c] = Integer.parseInt(System.console().readLine());

            }
        }
    }
}