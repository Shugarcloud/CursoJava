/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario
hasta que la suma de los números introducidos supere el límite inicial.
 */
package EjerPract;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        int limite = readIn("Ingrese el límite: ");
        int suma = sumarNumerosHastaLimite(limite);
        imprimirResultado(suma);
    }

    static void prinTxt(String message) {
        System.out.println(message);
    }

    static void prinTin(int message) {
        System.out.println(message);
    }

    static int readIn(String message) {
        Scanner leer = new Scanner(System.in);
        prinTxt(message);
        return leer.nextInt();
    }

    static int sumarNumerosHastaLimite(int limite) {
        int suma = 0;
        int numero;

        while (suma <= limite) {
            numero = readIn("Ingrese un número: ");
            suma += numero;
        }

        return suma;
    }

    static void imprimirResultado(int suma) {
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
