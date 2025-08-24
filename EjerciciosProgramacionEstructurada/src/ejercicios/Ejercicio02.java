package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n1 = scan.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n2 = scan.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int n3 = scan.nextInt();

        int mayor;

        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }

        System.out.println("El mayor es: " + mayor);

        scan.close();
    }
}
