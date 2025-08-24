package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double base = scan.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = scan.nextDouble() / 100;

        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = scan.nextDouble() / 100;

        double precioFinal = calcularPrecioFinal(base, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);

        scan.close();
    }

    public static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        return base + (base * impuesto) - (base * descuento);
    }
}
