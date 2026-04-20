package RECUPERACION;

/**
 * Enumeración que define las categorías posibles de los productos.
 * 
 * Se utiliza para evitar el uso de cadenas de texto libres,
 * reduciendo errores y asegurando valores válidos.
 */
public enum Categoria {

    /** Productos de alimentación */
    ALIMENTACION,

    /** Productos de limpieza del hogar */
    LIMPIEZA,

    /** Productos de higiene personal */
    HIGIENE,

    /** Productos electrónicos */
    ELECTRONICA,

    /** Otros productos no clasificados */
    OTROS
}