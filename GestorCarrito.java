package RECUPERACION;

import java.util.ArrayList;

/**
 * Clase encargada de gestionar el carrito de compra.
 * 
 * Contiene la lista de productos y proporciona métodos para:
 * añadir productos, calcular el total, mostrar el carrito y vaciarlo.
 */
public class GestorCarrito {

    /** Lista de productos que contiene el carrito */
    private ArrayList<Producto> lista;

    /**
     * Constructor de la clase GestorCarrito.
     * Inicializa la lista de productos vacía.
     */
    public GestorCarrito() {
        lista = new ArrayList<>();
    }

    /**
     * Añade un producto al carrito.
     * 
     * @param producto producto a añadir
     */
    public void agregarProducto(Producto producto) {
        lista.add(producto);

        System.out.println(
            producto.getNombre() +
            Constantes.ANADIDO_CARRITO +
            producto.getCantidad() +
            Constantes.PRECIO_TOTAL +
            (producto.getPrecio() * producto.getCantidad())
        );
    }

    /**
     * Calcula el precio total de todos los productos del carrito.
     * 
     * @return total del carrito
     */
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : lista) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    /**
     * Muestra por pantalla todos los productos del carrito.
     * Si el carrito está vacío, muestra un mensaje indicándolo.
     */
    public void mostrarProductos() {
        if (lista.isEmpty()) {
            System.out.println(Constantes.CARRITO_VACIO);
        } else {
            System.out.println(Constantes.PRODUCTOS_CARRITO);
            for (Producto producto : lista) {
                System.out.println(
                    "- " + producto.getNombre() +
                    " (Cantidad: " + producto.getCantidad() +
                    Constantes.CATEGORIA + producto.getCategoria() + ")"
                );
            }
            System.out.println(Constantes.TOTAL + calcularTotal());
        }
    }

    /**
     * Vacía completamente el carrito eliminando todos los productos.
     */
    public void vaciarCarrito() {
        lista.clear();
    }
}