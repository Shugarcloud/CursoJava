
package EjerPract;
import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = readInt("Ingrese el primer número: ", scanner);
        int numero2 = readInt("Ingrese el segundo número: ", scanner);
        boolean salir = false;
        
        while (!salir) {
            showMenu();
            int opcion = readInt("Ingrese una opción: ", scanner);
            
            switch (opcion) {
                case 1:
                    sumar(numero1, numero2);
                    break;
                case 2:
                    restar(numero1, numero2);
                    break;
                case 3:
                    multiplicar(numero1, numero2);
                    break;
                case 4:
                    dividir(numero1, numero2);
                    break;
                case 5:
                    char confirmacion = confirmarSalida(scanner);
                    if (confirmacion == 'S') {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    static int readInt(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            scanner.nextLine(); // Consumir el input inválido
            System.out.print("El valor ingresado no es un número entero. " + mensaje);
        }
        return scanner.nextInt();
    }

    static char confirmarSalida(Scanner scanner) {
        scanner.nextLine(); // Consumir el '\n' dejado por el readInt anterior
        String mensaje = "¿Está seguro que desea salir del programa? (S/N): ";
        while (true) {
            System.out.print(mensaje);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("s") || input.equalsIgnoreCase("n")) {
                return input.toUpperCase().charAt(0);
            } else {
                mensaje = "Por favor, ingrese una opción válida (S/N): ";
            }
        }
    }

    static void showMenu() {
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }

    static void sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    static void restar(int a, int b) {
        int resultado = a - b;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    static void multiplicar(int a, int b) {
        int resultado = a * b;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    static void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            double resultado = (double) a / b;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }
}
