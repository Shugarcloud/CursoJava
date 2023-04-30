/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerPract;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean seguirMostrando = true;

        while (seguirMostrando) {
            String nombre = readIn("Ingrese el nombre de la persona: ", scanner);
            int edad = readInt("Ingrese la edad de " + nombre + ": ", scanner);

            System.out.println("Nombre: " + nombre + ", Edad: " + edad);

            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }

            String continuar = readIn("¿Desea seguir mostrando personas? (Sí/No): ", scanner);
            seguirMostrando = continuar.equalsIgnoreCase("Si");
        }
    }

    static String readIn(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine();
    }

    static int readInt(String message, Scanner scanner) {
        int value = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(message);
                value = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número entero válido.");
            }
        }

        return value;
    }
}

