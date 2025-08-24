package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scan.next().toUpperCase().charAt(0);

        double descuento = 0;
        switch (categoria) {
            case 'A': descuento = 0.10; break;
            case 'B': descuento = 0.15; break;
            case 'C': descuento = 0.20; break;
            default:
                System.out.println("Categoría inválida.");
                scan.close();
                return;
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);

        scan.close();
    }
}
