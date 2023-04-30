
package EjerPract;
import java.util.Scanner;

public class EJ8{

    public static void main(String[] args) {
        int n = readIn("Ingrese el tamaño del cuadrado:");
        drawSquare(n);
    }
    
    static void drawSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    static int readIn(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
