/* Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
package EjerPract;
import java.util.Scanner;

public class EJ3 {
        public static void main(String[]args){
            String phrase = readIn("Ingrese una frase");
            showTxt(phrase);
            
        }
        static String readIn(String phrase){
            Scanner readIn = new Scanner(System.in);
            System.out.println(phrase);
            return readIn.nextLine();
        }
        static void showTxt(String phrase){
         readIn(phrase.toLowerCase());
         readIn(phrase.toUpperCase());   
        }
        
}

