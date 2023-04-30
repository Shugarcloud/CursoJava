/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
*/

package EjerPract;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[]args){
            String phrase = readIn("Ingrese una frase Maximo 8 caracteres: ");
            boolean correcto = check(phrase);
            message(correcto);
    }
    static void prinTxt(String message){
            System.out.println(message);
    } 
    static String readIn(String text){
            Scanner leer = new Scanner(System.in);
            prinTxt(text);
            return leer.nextLine();
    }
    static boolean check(String phrase){
        return phrase.length()<=8;
    }
    static void message(boolean correcto){
        if(correcto){
            prinTxt("correcto");
        }else{
            prinTxt("incorrecto");
            }    
    }
    
    
}
