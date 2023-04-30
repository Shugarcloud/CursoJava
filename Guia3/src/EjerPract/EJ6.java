/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerPract;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = readIn("Ingrese el primer número: ", scanner);
        int num2 = readIn("Ingrese el segundo número: ", scanner);
        boolean salir = false;
        whileMenu(num1, num2, scanner, salir);
        System.out.println("Fin del programa.");
    }

    static void whileMenu(int num1, int num2, Scanner scanner, boolean salir) {
        while (!salir) {
            showMenu();
            int opcion = readIn("Ingrese una opción: ", scanner);
            switch (opcion) {
                case 1:
                    int suma = sumar(num1, num2);
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
                    break;
                case 2:
                    int resta = restar(num1, num2);
                    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
                    break;
                case 3:
                    int multiplicacion = multiplicar(num1, num2);
                    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
                    break;
                case 4:
                    double division = dividir(num1, num2);
                    System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);
                    break;
                case 5:
                    char respuesta = confirmarSalida(scanner);
                    if (respuesta == 'S') {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

    static void showMenu() {
        System.out.println("----- MENÚ -----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }

    static int readIn(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextInt();
    }

    static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    static int restar(int num1, int num2) {
        return num1 - num2;
    }

    static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    static double dividir(int num1, int num2) {
        return (double) num1 / num2;
    }

    static boolean confirmarSalida(Scanner scanner) {
    String respuesta = readIn("¿Está seguro que desea salir del programa? (S/N): ", scanner);
    return respuesta.equalsIgnoreCase("S");
    }
}
