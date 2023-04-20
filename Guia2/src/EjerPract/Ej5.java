/*Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */

package EjerPract;
import java.util.Scanner;


public class Ej5 {  
        public static void main(String[]args){
                int num1 = readIn("Ingrese un numero: ");
                showRes(num1);
                
        }
            static int readIn(String message){
                Scanner leer = new Scanner(System.in);
                System.out.println(message);
                return leer.nextInt();
            }
            static void showRes(int num1){
                readIn("El doble de "+num1+(" es: ")+num1 * 2);
                readIn("El triple de "+num1+(" es: ")+num1 * 3);
                readIn("El doble de "+num1+(" es: ")+ Math.sqrt(num1));
            }
}
