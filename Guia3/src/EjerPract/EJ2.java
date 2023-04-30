/*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
Incorrecto. Nota: investigar la función equals() en Java.
*/
package EjerPract;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[]args){
        String phrase = readIn("Ingrese la frase: ");  
        boolean correcto = check(phrase);
        message(correcto);
    }
    static void prinTxt(String text){
        System.out.print(text);
    }    
    static String readIn(String message){
        Scanner leer = new Scanner(System.in);
        prinTxt(message);
        return leer.nextLine();
    }
    static boolean check(String phrase){
        return phrase.equalsIgnoreCase("eureka");
    }
    static void message(boolean correcto){
        if(correcto){
            prinTxt("La clave es correcta");
        }else{
            prinTxt("La clave es incorrecta");
        }
    }
    
}
