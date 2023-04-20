/*Escribir un programa que pida tu nombre, lo guarde en una variable
y lo muestre por pantalla.
*/

package EjerPract;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[]args){
        String name = readIn("ingrese su nombre");
        readIn("Hola " + name + "!");
    }
    static String readIn(String name){
        Scanner readIn = new Scanner(System.in);
        System.out.println(name);
        return readIn.next();
    }
    
    
    
}
