package EjerciciosArrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 501); 
        }

        System.out.println("Array original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        String eleccion = "maximo"; 

        System.out.println("\nArray con el número destacado:");
        for (int i = 0; i < numeros.length; i++) {
            if (eleccion.equals("maximo") && numeros[i] == maximo) {
                System.out.print("*" + numeros[i] + "* "); 
            } else if (eleccion.equals("minimo") && numeros[i] == minimo) {
                System.out.print("*" + numeros[i] + "* "); 
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
