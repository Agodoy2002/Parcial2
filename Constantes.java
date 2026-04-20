package RECUPERACION;

/**
 * Clase que contiene todas las constantes de texto utilizadas en la aplicación.
 * 
 * Se utiliza para evitar el uso de "magic strings" (cadenas de texto escritas directamente en el código),
 * facilitando el mantenimiento y la modificación de los mensajes.
 */
public class Constantes {

    /** Mensaje mostrado cuando el carrito está vacío */
    public static final String CARRITO_VACIO = "El carrito está vacío.";

    /** Mensaje que indica el listado de productos en el carrito */
    public static final String PRODUCTOS_CARRITO = "Productos en el carrito:";

    /** Texto que precede al total del carrito */
    public static final String TOTAL = "Total: $";

    /** Mensaje mostrado al vaciar el carrito */
    public static final String CARRITO_VACIADO = "Carrito vaciado.";

    /** Texto utilizado al añadir un producto al carrito */
    public static final String ANADIDO_CARRITO = " añadido al carrito. Cantidad: ";

    /** Texto que indica el precio total de un producto */
    public static final String PRECIO_TOTAL = ". Precio total: $";

    /** Texto que indica la categoría de un producto */
    public static final String CATEGORIA = ", Categoría: ";
}