package EjerciciosArrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        int[] entradaSimulada = { 10, 3, 5, 8, 12, 7, 4, 11, 6, 13 };
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entradaSimulada[i];
        }

        System.out.println("Índice\tValor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + "\t" + numeros[i]);
        }

        int[] primos = new int[10];
        int contadorPrimos = 0;

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                primos[contadorPrimos++] = numero;
            }
        }

        int[] resultado = new int[10];
        int contadorNoPrimos = 0;

        for (int i = 0; i < contadorPrimos; i++) {
            resultado[i] = primos[i];
        }

        for (int numero : numeros) {
            if (!esPrimo(numero)) {
                resultado[contadorPrimos + contadorNoPrimos++] = numero;
            }
        }

        System.out.println("\nArray reorganizado (primos primero):");
        System.out.println("Índice\tValor");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(i + "\t" + resultado[i]);
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
