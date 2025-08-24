package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    static double DESCUENTO_GLOBAL = 0.10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        calcularDescuentoEspecial(precio);
        scan.close();
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_GLOBAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
