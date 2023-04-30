/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerPract;

import java.util.Scanner;

public class EJ4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = readInt("Introduce un número: ", scanner);
        boolean esPrimo = esPrimo(numero);
        printResultado(esPrimo);
    }

    public static boolean esPrimo(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
    }

    public static int readInt(String message, Scanner scanner) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Debes introducir un número entero. " + message);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void printResultado(boolean esPrimo) {
        if (esPrimo) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo.");
        }
    }
}
