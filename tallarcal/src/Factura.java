public class Factura {
    private String npieza;
    private String tipo;
    private int cantidad;
    private double precio;

    public Factura() {
    }

    public Factura(String npieza, String tipo, int cantidad, double precio) {
        setNpieza(npieza);
        setTipo(tipo);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public String getNpieza() {
        return npieza;
    }

    public void setNpieza(String npieza) {
        this.npieza = (npieza == null) ? "" : npieza.trim();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = (tipo == null) ? "" : tipo.trim();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad < 0) ? 0 : cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = (precio < 0.0) ? 0.0 : precio;
    }

    public double obtenerMontoFactura() {
        return cantidad * precio;
    }

    // método de impresión
    public void obtener() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("ID DEL PRODUCTO       : " + npieza);
        System.out.println("-----------------------------------------------------------");
        System.out.println("NOMBRE DEL PRODUCTO   : " + tipo);
        System.out.println("-----------------------------------------------------------");
        System.out.println("CANTIDAD DE PRODUCTOS : " + cantidad);
        System.out.println("-----------------------------------------------------------");
        System.out.println("PRECIO DE PRODUCTO    : " + precio);
    }

}


