package EjerciciosArrays;

public class Ejercicio4 {
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

        int inicial = 2;
        int finalPos = 5;

        if (inicial < finalPos && inicial >= 0 && finalPos < numeros.length) {

            int valorInicial = numeros[inicial];

            for (int i = inicial; i < finalPos; i++) {
                numeros[i] = numeros[i + 1];
            }

            numeros[finalPos] = valorInicial;

            System.out.println("\nArray resultante después de la rotación:");
            System.out.println("Índice\tValor");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(i + "\t" + numeros[i]);
            }
        } else {
            System.out.println("Error: Asegúrate de que 'inicial' es menor que 'final' y ambos están entre 0 y 9.");
        }
    }
}
