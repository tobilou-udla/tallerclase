/**
 * Clase Factura
 * <p>
 * Representa la factura de un artículo vendido en la ferretería.
 * Contiene información básica: número de pieza, descripción (tipo),
 * cantidad y precio por unidad. Las cantidades negativas y los precios
 * negativos se normalizan a 0 y 0.0 respectivamente.
 */
public class Factura {
    /** Número o identificador de la pieza (puede estar vacío, no nulo). */
    private String npieza;

    /** Descripción o nombre del tipo de producto (puede estar vacío, no nulo). */
    private String tipo;

    /** Cantidad de artículos vendidos. Si es negativa, se establece en 0. */
    private int cantidad;

    /** Precio por unidad. Si es negativo, se establece en 0.0. */
    private double precio;

    /**
     * Constructor por defecto.
     * Inicializa las cadenas a cadena vacía y los numéricos a 0.
     */
    public Factura() {
        this.npieza = "";
        this.tipo = "";
        this.cantidad = 0;
        this.precio = 0.0;
    }


    public Factura(String npieza, String tipo, int cantidad, double precio) {
        setNpieza(npieza);
        setTipo(tipo);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    /**
     * Obtiene el identificador de la pieza.
     *
     */
    public String getNpieza() {
        return npieza;
    }

    /**
     * Establece el identificador de la pieza.
     * Si se pasa null, se guarda como cadena vacía.
     *
     */
    public void setNpieza(String npieza) {
        this.npieza = (npieza == null) ? "" : npieza;
    }

    /**
     * Obtiene la descripción/nombre del producto.
     *
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece la descripción del producto.
     * NO se aplica trim() — se conserva la cadena exactamente como se recibe.
     * Si se pasa null, se guarda como cadena vacía.
     *
     *
     */
    public void setTipo(String tipo) {
        this.tipo = (tipo == null) ? "" : tipo;
    }

    /**
     * Obtiene la cantidad de artículos.
     *
     * cantidad (si se evaluó negativamente, devolverá 0)
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de artículos. Valores negativos se convierten en 0.
     *
     * cantidad cantidad propuesta
     */
    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad < 0) ? 0 : cantidad;
    }

    /**
     * Obtiene el precio por unidad.
     *
     * precio por unidad (si se estableció negativo, devolverá 0.0)
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio por unidad. Valores negativos se convierten en 0.0.
     *
     */
    public void setPrecio(double precio) {
        this.precio = (precio < 0.0) ? 0.0 : precio;
    }

    /**
     * Calcula y devuelve el monto total de la factura (cantidad * precio).
     *
     */
    public double obtenerMontoFactura() {
        return cantidad * precio;
    }

    /**
     * Imprime por consola un resumen legible de la factura.
     * Conserva el formato de salida que existía previamente.
     */
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

    /**
     * Representación en cadena de la factura .
     */
    @Override
    public String toString() {
        return "Factura{" +
                "npieza='" + npieza + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + String.format("%.2f", precio) +
                '}';
    }
}
