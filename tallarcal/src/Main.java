/**(La clase Factura) Cree una clase llamada Factura que una ferretería podría utilizar para representar una factura para un artículo
 * vendido en la tienda. Una Factura debe incluir cuatro piezas de información como variables de instancia: un número de pieza (tipo String),
 * la descripción de la pieza (tipo String), la cantidad de artículos de ese tipo que se van a comprar (tipo int) y el precio
 * por artículo (double). Su clase debe tener un constructor que inicialice las cuatro variables de instancia. Proporcione
 * un método establecer y un método obtener para cada variable
 * de instancia. Además, proporcione un método llamado obtenerMontoFactura,
 * que calcule el monto de la factura (es decir, que multiplique la cantidad de artículos por el precio de cada uno)
 * y después devuelva ese monto como un valor double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo no es
 * positivo, debe establecerse en 0.0. Escriba una aplicación de
 * prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.*/
import javax.swing.*;
import java.util.Scanner;

/**
 * Programa de prueba para la clase Factura.
 * <p>
 * Lee desde la entrada estándar los datos de una factura (identificador de
 * producto, descripción, cantidad y precio unitario), construye un objeto
 * {@link Factura} y muestra un resumen con el monto total.
 * <p>
 * Nota: este programa mantiene la misma suposición original de la práctica:
 * las entradas numéricas se dan en un formato válido (enteros para cantidad,
 * números con punto decimal para precio). Si se requiere validación más
 * robusta, se podría envolverse el parseo en bloques try/catch o usar bucles de reintento.
 */
public class Main {
    /**
     * Punto de entrada del programa.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos de la factura");

        String id = JOptionPane.showInputDialog("ID del producto: ");

        String descripcion = JOptionPane.showInputDialog("Nombre/Descripción del producto: ");

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de productos vendidos (entero >= 0): ")); // Asume entrada válida

        System.out.print("Precio unitario del producto (>= 0): ");

        double precio = Double.parseDouble(JOptionPane.showInputDialog("Cantidad de productos vendidos (entero >= 0): ")); // Asume entrada válida

        Factura factura = new Factura(id, descripcion, cantidad, precio);
        double monto = factura.obtenerMontoFactura();

        System.out.println("\nResumen de la factura:");
        factura.obtener();
        System.out.printf("Monto total de la factura: %.2f%n", monto);
        JOptionPane.showMessageDialog(null, "Monto total de la factura: " + monto);

        sc.close();
    }
}
