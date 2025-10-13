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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        Factura factura1= new Factura();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double monto;

        Scanner sc =new Scanner(System.in);

        System.out.println("Ingrese el ID del producto:");
        String npieza= factura1.getNpieza();

        System.out.println("Ingrese el Nombre del producto:");
        String tipo= factura1.getTipo();
        System.out.println("Ingrese la cantidad de productos vendidos:");
        int cantidad = factura1.getCantidad();
        System.out.println("Ingrese el precio del producto:");
        double precio = factura1.getPrecio();
        monto = factura1.obtenerMontoFactura();

        factura1.obtener(String npieza,String tipo,int cantidad,double precio);

        JOptionPane.showMessageDialog(null,"El monto total de la factura es: " +monto);
        System.out.println("Ingrese los datos de la factura");
        factura1.Pruebafactura();









    }

}