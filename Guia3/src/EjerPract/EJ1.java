/*Crear un programa que dado un número determine si es par o impar.
*/
package EjerPract;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[]args){
        int num1 = readIn("Ingrese un numero: ");
        boolean sera = pop(num1);
        message(sera);
    }
    static int readIn(String message){
        Scanner leer = new Scanner(System.in);
        System.out.println(message);
        return leer.nextInt();
    }
    static boolean pop(int num1){
        return num1 % 2 == 0;
    }
    static void message(boolean sera){
        if(sera){
            readIn("El numero ingresado es par");
        }else{
            readIn("El numero es impar");
        }
    }
    
}
