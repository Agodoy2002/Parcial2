package RECUPERACION;

/**
 * Clase que representa un producto dentro del carrito de compra.
 * 
 * Contiene información sobre el nombre, precio, cantidad y categoría del producto.
 * Incluye validaciones para garantizar que los datos sean correctos.
 */
public class Producto {

    /** Nombre del producto (mínimo 2 caracteres) */
    private String nombre;

    /** Precio del producto (debe ser mayor que 0) */
    private double precio;

    /** Cantidad del producto (no puede ser negativa) */
    private int cantidad;

    /** Categoría del producto */
    private Categoria categoria;

    /**
     * Constructor de la clase Producto.
     * 
     * @param nombre nombre del producto (no nulo y mínimo 2 caracteres)
     * @param precio precio del producto (mayor que 0)
     * @param cantidad cantidad del producto (mayor o igual a 0)
     * @param categoria categoría del producto (no puede ser null)
     * 
     * @throws IllegalArgumentException si alguno de los parámetros no es válido
     */
    public Producto(String nombre, double precio, int cantidad, Categoria categoria) {

        if (nombre == null || nombre.length() < 2) {
            throw new IllegalArgumentException("Nombre inválido");
        }

        if (precio <= 0) {
            throw new IllegalArgumentException("Precio inválido");
        }

        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }

        if (categoria == null) {
            throw new IllegalArgumentException("Categoría inválida");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    /**
     * Devuelve el nombre del producto.
     * @return nombre del producto
     */
    public String getNombre() { return nombre; }

    /**
     * Devuelve el precio del producto.
     * @return precio del producto
     */
    public double getPrecio() { return precio; }

    /**
     * Devuelve la cantidad del producto.
     * @return cantidad del producto
     */
    public int getCantidad() { return cantidad; }

    /**
     * Devuelve la categoría del producto.
     * @return categoría del producto
     */
    public Categoria getCategoria() { return categoria; }

    /**
     * Modifica el nombre del producto.
     * 
     * @param nombre nuevo nombre (mínimo 2 caracteres)
     * @throws IllegalArgumentException si el nombre no es válido
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.length() < 2) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        this.nombre = nombre;
    }

    /**
     * Modifica el precio del producto.
     * 
     * @param precio nuevo precio (mayor que 0)
     * @throws IllegalArgumentException si el precio no es válido
     */
    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("Precio inválido");
        }
        this.precio = precio;
    }

    /**
     * Modifica la cantidad del producto.
     * 
     * @param cantidad nueva cantidad (>= 0)
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad inválida");
        }
        this.cantidad = cantidad;
    }

    /**
     * Modifica la categoría del producto.
     * 
     * @param categoria nueva categoría (no puede ser null)
     * @throws IllegalArgumentException si la categoría es null
     */
    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("Categoría inválida");
        }
        this.categoria = categoria;
    }
}