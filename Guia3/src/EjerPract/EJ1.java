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
    static void prinTxt(String message){
        System.out.println(message);
    }
    static int readIn(String message){
        Scanner leer = new Scanner(System.in);
        prinTxt(message);
        return leer.nextInt();
    }
    static boolean pop(int num1){
        return num1 % 2 == 0;
    }
    static void message(boolean sera){
        if(sera){
            prinTxt("El numero ingresado es par");
        }else{
            prinTxt("El numero es impar");
        }
    }
    
}
