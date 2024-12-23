package Arreglos;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Un programa que pida 10 numeros por teclado, luego muestre los numeros
        // introducidos , ademas debe mostrar el maximo y minimo
        int[] numeros = new int[10];
        System.out.println("Ingrese 10 numero aleatorios");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo)
                ;
            maximo = numeros[i];

            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }

        }
        System.out.println("El numero maximon es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
    }
}