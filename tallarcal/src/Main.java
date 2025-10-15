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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos de la factura");

        System.out.print("ID del producto: ");
        String id = sc.nextLine().trim();

        System.out.print("Nombre/Descripción del producto: ");
        String descripcion = sc.nextLine().trim();

        System.out.print("Cantidad de productos vendidos (entero >= 0): ");
        String cantidadStr = sc.nextLine().trim();
        int cantidad = Integer.parseInt(cantidadStr); // Asume entrada válida

        System.out.print("Precio unitario del producto (>= 0): ");
        String precioStr = sc.nextLine().trim();
        double precio = Double.parseDouble(precioStr); // Asume entrada válida

        Factura factura = new Factura(id, descripcion, cantidad, precio);
        double monto = factura.obtenerMontoFactura();

        System.out.println("\nResumen de la factura:");
        factura.obtener();
        System.out.printf("Monto total de la factura: %.2f%n", monto);

        sc.close();
    }
}
