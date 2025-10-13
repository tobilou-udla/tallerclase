import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factura {
    String npieza;
    String tipo;
    int cantidad;
    double precio;

    public Factura() {
    }

    public Factura(String npieza, String tipo, int cantidad, double precio) {
        this.npieza = npieza;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNpieza() {
        Scanner sc =new Scanner(System.in);
        npieza= sc.nextLine();

        return npieza;
    }

    public void setNpieza(String npieza) {
        this.npieza = npieza;
    }

    public String getTipo() {
        Scanner sc =new Scanner(System.in);
        tipo = sc.nextLine();
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad()  {
        Scanner sc =new Scanner(System.in);
        cantidad= sc.nextInt();
        if (cantidad<0)
            cantidad= 0;
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        Scanner sc =new Scanner(System.in);
        precio= sc.nextDouble();
        if (precio<0)
            precio=0.0;
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double obtenerMontoFactura(){
        double detcom;
        detcom= precio*cantidad;
        return detcom;
    }

    public void obtener(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("ID DEL PRODUCTO :   "+npieza);
        System.out.println("-----------------------------------------------------------");
        System.out.println("NOMBRE DEL PRODCUTO :"+tipo);
        System.out.println("-----------------------------------------------------------");
        System.out.println("CANTIDAD DE PRODUCTOS:"+cantidad);
        System.out.println("-----------------------------------------------------------");
        System.out.println("PRECIO DE PRODUCTOS  :"+precio);

    }
    public void Pruebafactura(){


    }
}
