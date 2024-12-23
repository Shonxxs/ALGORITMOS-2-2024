package EjerciciosArrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * 101);
        }

        System.out.println("Números generados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        int[] pares = new int[20];
        int[] impares = new int[20];
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[contadorPares++] = numero;
            } else {
                impares[contadorImpares++] = numero;
            }
        }

        int[] resultado = new int[20];
        for (int i = 0; i < contadorPares; i++) {
            resultado[i] = pares[i];
        }
        for (int i = 0; i < contadorImpares; i++) {
            resultado[contadorPares + i] = impares[i];
        }

        System.out.println("Números reorganizados (pares primero):");
        for (int numero : resultado) {
            System.out.print(numero + " ");
        }
    }
}
