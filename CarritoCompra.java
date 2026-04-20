package RECUPERACION;

/**
 * Clase principal del programa.
 * Se encarga de ejecutar la aplicación del carrito de compra.
 * 
 * En esta clase se crean productos, se añaden al carrito,
 * se muestran los productos y se vacía el carrito.
 */
public class CarritoCompra {

    /**
     * Método principal que inicia la ejecución del programa.
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        /** Gestor encargado de manejar el carrito */
        GestorCarrito gestor = new GestorCarrito();

        /** Creación de productos de ejemplo */
        Producto leche = new Producto("Leche", 2.5, 1, Categoria.ALIMENTACION);
        Producto pan = new Producto("Pan", 1.0, 2, Categoria.ALIMENTACION);
        Producto huevos = new Producto("Huevos", 3.0, 1, Categoria.ALIMENTACION);
        Producto movil = new Producto("Móvil", 300, 1, Categoria.ELECTRONICA);

        /** Añadir productos al carrito */
        gestor.agregarProducto(leche);
        gestor.agregarProducto(pan);
        gestor.agregarProducto(huevos);
        gestor.agregarProducto(movil);

        /** Mostrar productos del carrito */
        gestor.mostrarProductos();

        /** Vaciar carrito */
        gestor.vaciarCarrito();
        System.out.println(Constantes.CARRITO_VACIADO);

        /** Mostrar carrito tras vaciarlo */
        gestor.mostrarProductos();
    }
}