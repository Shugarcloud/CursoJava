/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package EjerPract;
import java.util.Scanner;

    public class EJ4 {
        public static void main(String[]args){
        int cent = readIn("Ingrese los grados centígrados: ");
        txt(cent);
        }
        static int readIn(String message){
            Scanner readIn = new Scanner(System.in);
            System.out.println(message);
            return readIn.nextInt();
        }
        static double twist(int cent){
        double frht = 32 + (9 * cent / 5);
            return frht;
        }
        static void txt(int cent){
            readIn(cent+" Celsius equivalen a "+twist(cent)+("º Fahrenheit."));
        }
        
}


