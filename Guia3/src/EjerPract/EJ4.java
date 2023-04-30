/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso 
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
package EjerPract;
import java.util.Scanner;


public class EJ4 {
        public static void main(String[]args){
                String phrase = readIn("Ingrese una frase");
                boolean correct = check(phrase);
                message(correct);
        }
        static void prinTxt(String message){
                System.out.println(message);
        }
        static String readIn(String message){
                Scanner leer = new Scanner(System.in);
                System.out.println(message);
                return leer.nextLine();
        }
        static boolean check(String phrase){
                String firstChar = phrase.substring(0,1);
                return firstChar.equalsIgnoreCase("a");
        }
        static void message(boolean correct){
            if(correct){
                prinTxt("Correcto");
            }else{
                prinTxt("Incorrecto");
            }
        }
}
