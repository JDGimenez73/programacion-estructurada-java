Trabajo Práctico 2: Programación Estructurada
Programación II – Tecnicatura Universitaria en Programación a Distancia
Alumno: José Dario Gimenez
Repositorio GitHub: https://github.com/JDGimenez73/programacion-estructurada-
java
Ejercicio 01 – Verificación de Año Bisiesto
Solicitar al usuario un año y determinar si es bisiesto.
Código en Java:
package ejercicios;
import java.util.Scanner;
public class Ejercicio01 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Ingrese un año: ");
int anio = scan.nextInt();
if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
System.out.println("El año " + anio + " es bisiesto.");
} else {
System.out.println("El año " + anio + " no es bisiesto.");
}
scan.close();
}
}
Ejemplo de ejecución: Ejemplo: 2024 → bisiesto; 1900 → no bisiesto.Ejercicio 02 – Mayor de tres números
Solicitar tres números enteros y mostrar cuál es el mayor.
Código en Java:
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
if (n1 >= n2 && n1 >= n3) mayor = n1;
else if (n2 >= n1 && n2 >= n3) mayor = n2;
else mayor = n3;
System.out.println("El mayor es: " + mayor);
scan.close();
}
}
Ejemplo de ejecución: Ejemplo: 8, 12, 5 → El mayor es 12
Ejercicio 03 – Clasificación de Edad
Clasificar edad en Niño, Adolescente, Adulto o Adulto mayor.
Código en Java:
package ejercicios;
import java.util.Scanner;
public class Ejercicio03 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Ingrese su edad: ");
int edad = scan.nextInt();
if (edad < 12) System.out.println("Eres un Niño.");
else if (edad <= 17) System.out.println("Eres un Adolescente.");
else if (edad <= 59) System.out.println("Eres un Adulto.");
else System.out.println("Eres un Adulto mayor.");
scan.close();
}
}
Ejemplo de ejecución: Ejemplo: 25 → Adulto; 10 → Niño.Ejercicio 04 – Calculadora de Descuento
Aplicar descuentos según categoría A (10%), B (15%), C (20%).
Código en Java:
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
System.out.println("Descuento aplicado: " + (int)(descuento * 100) +
"%");
System.out.println("Precio final: " + precioFinal);
scan.close();
}
}
Ejemplo de ejecución: Ejemplo: Precio=1000, Cat=B → Precio final=850Ejercicio 05 – Suma de Números Pares
Ingresar números hasta 0 y sumar solo los pares.
Código en Java:
package ejercicios;
import java.util.Scanner;
public class Ejercicio05 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int suma = 0, num;
do {
System.out.print("Ingrese un número (0 para terminar): ");
num = scan.nextInt();
if (num % 2 == 0 && num != 0) suma += num;
} while (num != 0);
System.out.println("La suma de los números pares es: " + suma);
scan.close();
}
}
Ejemplo de ejecución: Ejemplo: 4,7,2,0 → suma pares=6
Ejercicio 06 – Contador Pos/Neg/Ceros
Ingresar 10 números y contar positivos, negativos y ceros.
Código en Java:
package ejercicios;
import java.util.Scanner;
public class Ejercicio06 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int positivos=0, negativos=0, ceros=0;
for (int i=1; i<=10; i++) {
System.out.print("Ingrese el número " + i + ": ");
int num = scan.nextInt();
if (num > 0) positivos++;
else if (num < 0) negativos++;
else ceros++;
}
System.out.println("Positivos: " + positivos);
System.out.println("Negativos: " + negativos);
System.out.println("Ceros: " + ceros);
scan.close();
}
}
Ejemplo de ejecución: Ejemplo: mezcla → 4 positivos, 4 negativos, 2 cerosEjercicio 07 – Validación de Nota
Ingresar una nota entre 0 y 10, repetir hasta válido.
Código en Java:
package ejercicios;
import java.util.Scanner;
public class Ejercicio07 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int nota;
do {
System.out.print("Ingrese una nota (0-10): ");
nota = scan.nextInt();
if (nota < 0 || nota > 10)
System.out.println("Error: Nota inválida. Ingrese una nota
entre 0 y 10.");
} while (nota < 0 || nota > 10);
System.out.println("Nota guardada correctamente.");
scan.close();
}
}
Ejemplo de ejecución: Ejemplo: 15, -2, 8 → Nota guardada correctamente
Ejercicio 08 – Precio Final con Impuesto y Descuento
Método calcularPrecioFinal(base, imp, desc).
Código en Java:
package ejercicios;
import java.util.Scanner;
public class Ejercicio08 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Ingrese el precio base del producto: ");
double base = scan.nextDouble();
System.out.print("Ingrese el impuesto en porcentaje: ");
double impuesto = scan.nextDouble()/100;
System.out.print("Ingrese el descuento en porcentaje: ");
double descuento = scan.nextDouble()/100;
double precioFinal = calcularPrecioFinal(base, impuesto, descuento);
System.out.println("El precio final del producto es: " + precioFinal);
scan.close();
}
public static double calcularPrecioFinal(double base, double impuesto,
double descuento) {
return base + (base * impuesto) - (base * descuento);
}
}
Ejemplo de ejecución: Ejemplo: Base=100, imp=10%, desc=5% → Final=105Ejercicio 09 – Costo de Envío y Total
Métodos calcularCostoEnvio y calcularTotalCompra.
Código en Java:
package ejercicios;
import java.util.Scanner;
public class Ejercicio09 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Ingrese el precio del producto: ");
double precio = scan.nextDouble();
System.out.print("Ingrese el peso del paquete en kg: ");
double peso = scan.nextDouble();
System.out.print("Ingrese la zona de envío (Nacional/Internacional):
");
String zona = scan.next();
double costoEnvio = calcularCostoEnvio(peso, zona);
double total = calcularTotalCompra(precio, costoEnvio);
System.out.println("El costo de envío es: " + costoEnvio);
System.out.println("El total a pagar es: " + total);
scan.close();
}
public static double calcularCostoEnvio(double peso, String zona) {
if (zona.equalsIgnoreCase("Nacional")) return peso * 5;
else if (zona.equalsIgnoreCase("Internacional")) return peso * 10;
else { System.out.println("Zona inválida."); return 0; }
}
public static double calcularTotalCompra(double precio, double envio) {
return precio + envio;
}
}
Ejemplo de ejecución: Ejemplo: Precio=50, Peso=2, Zona=Nacional → Total=60Ejercicio 10 – Actualización de Stock
Método actualizarStock(stock, vendida, recibida).
Código en Java:
package ejercicios;
import java.util.Scanner;
public class Ejercicio10 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Ingrese el stock actual: ");
int stock = scan.nextInt();
System.out.print("Ingrese la cantidad vendida: ");
int vendida = scan.nextInt();
System.out.print("Ingrese la cantidad recibida: ");
int recibida = scan.nextInt();
int nuevoStock = actualizarStock(stock, vendida, recibida);
System.out.println("El nuevo stock es: " + nuevoStock);
scan.close();
}
public static int actualizarStock(int stock, int vendida, int recibida) {
return stock - vendida + recibida;
}
}
Ejemplo de ejecución: Ejemplo: Stock=50, Vendida=20, Recibida=30 → Nuevo=60
Ejercicio 11 – Descuento Especial
Variable global descuento=0.10 y método calcularDescuentoEspecial.
Código en Java:
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
System.out.println("El descuento especial aplicado es: " +
descuentoAplicado);
System.out.println("El precio final con descuento es: " + precioFinal);
}
}
Ejemplo de ejecución: Ejemplo: Precio=200 → Final=180Ejercicio 12 – Modificación de Array
Declarar un array de precios, mostrar, modificar y mostrar de nuevo.
Código en Java:
package ejercicios;
public class Ejercicio12 {
public static void main(String[] args) {
double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
System.out.println("Precios originales:");
for (double p : precios) System.out.println("Precio: $" + p);
precios[2] = 129.99;
System.out.println("\nPrecios modificados:");
for (double p : precios) System.out.println("Precio: $" + p);
}
}
Ejemplo de ejecución: Ejemplo: se modifica el tercer precio de 149.75 a 129.99
Ejercicio 13 – Impresión Recursiva de Arrays
Usar función recursiva para mostrar array antes y después de modificar.
Código en Java:
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
Ejemplo de ejecución: Ejemplo: imprime todos los precios antes y después de la
modificaciónConclusiones
Este trabajo me permitió aplicar estructuras condicionales, ciclos, funciones,
arrays y recursividad en Java.
Reforzó la práctica de programación estructurada y el uso de GitHub como
repositorio de control de versiones,
integrando buenas prácticas de desarrollo y documentación.
