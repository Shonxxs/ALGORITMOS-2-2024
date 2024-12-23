package EjerciciosArrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("\nLos números introducidos son:");
        for (int numero : numeros) {
            String tipo = (numero % 2 == 0) ? "par" : "impar";
            System.out.println(numero + " es " + tipo);
        }
    }
}
