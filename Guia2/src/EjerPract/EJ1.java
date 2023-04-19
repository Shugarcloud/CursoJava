/*Escribir un programa que pida dos números enteros por teclado
y calcule la suma de los dos. El programa deberá después mostrar el 
resultado de la suma
*/
package EjerPract;
import java.util.Scanner;

    public class EJ1 {
        public static void main(String[]args){
            int num1 = readIn("Ingrese el primer numero: ");
            int num2 = readIn("Ingrese el segundo número: ");
            int result = sum(num1,num2);
            
        }static int readIn(String message){
        Scanner readIn = new Scanner(System.in);
        System.out.print(message);
        return readIn.nextInt();
        }
        static int sum(int num1,int num2){
        return num1+num2;
        }
    }    
    



