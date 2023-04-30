/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerPract;
iimport java.util.Scanner;
 
public class Ejercicio_EJ3 {
    static Scanner entrada = new Scanner(System.in);
    public static final String LIBRAS = "libras";
    public static final String DOLARES = "dolares";
    public static final String YENES = "yenes";
 
    /**
     * Llamará a los diferentes métodos.
     *
     * @param args
     */
    public static void main(String[] args) {
        double euros = introducirEuros();
        String moneda = introducirMoneda();
        double cambio = cambiarMoneda(moneda, euros);
        imprimir(cambio);
    }
 
    /**
     * @return la cantidad de euros que queremos cambiar.
     */
    public static double introducirEuros() {
        System.out.print("Introduce una cantidad de euros: ");
        double euros = entrada.nextDouble();
        entrada.nextLine();
        return euros;
    }
 
    /**
     * @return la moneda a la que queremos realizar el cambio.
     */
    public static String introducirMoneda() {
        String moneda;
        System.out.print("Introduce el tipo de moneda: ");
        moneda = entrada.nextLine();
        switch (moneda.toLowerCase()) {
            case LIBRAS:
            case DOLARES:
            case YENES:
                moneda = moneda.toLowerCase();
                break;
            default:
                moneda = null;
                System.out.println("Error, las opciones válidas son: " + LIBRAS + ", " + DOLARES + ", " + YENES);
        }
        if (moneda == null) {
            moneda = introducirMoneda();
        }
        System.out.println("La moneda introducida es " + moneda);
        return moneda;
    }
 
    /**
     * Convertirá los euros a la moneda indicada devolviendo la cantidad
     * obtenida.
     *
     * @param moneda
     * @param euros
     * @return
     */
    public static double cambiarMoneda(String moneda, double euros) {
        double cambio = 0.0;
        switch (moneda) {
            case LIBRAS:
                cambio = euros * 0.87;
                break;
            case DOLARES:
                cambio = euros * 1.11;
                break;
            case YENES:
                cambio = euros * 120.63;
                break;
        }
        return cambio;
    }
 
    /**
     * Visualizará por pantalla el resultado.
     *
     * @param cambio
     */
    public static void imprimir(double cambio) {
        System.out.println("El resultado de la conversión es " + String.format("%.2f", cambio));
    }
}