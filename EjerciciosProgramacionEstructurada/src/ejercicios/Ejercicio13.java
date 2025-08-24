package ejercicios;

public class Ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirArray(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirArray(precios, 0);
    }

    public static void imprimirArray(double[] arr, int index) {
        if (index < arr.length) {
            System.out.println("Precio: $" + arr[index]);
            imprimirArray(arr, index + 1);
        }
    }
}
