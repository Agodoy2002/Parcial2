package RECUPERACION;

/**
 * Clase de pruebas para la clase Producto.
 * 
 * Contiene tests manuales que verifican el correcto funcionamiento
 * del constructor y las validaciones definidas en la clase Producto.
 * 
 * Se prueban tanto casos válidos como no válidos (caja negra).
 */
public class ProductoTest {

    /**
     * Método principal que ejecuta todos los tests.
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        testProductoValido();
        testNombreVacio();
        testNombreCorto();
        testPrecioNegativo();
        testPrecioCero();
        testCantidadNegativa();
        testCategoriaNull();
        System.out.println("Todos los tests pasaron.");
    }

    /**
     * Test de caso válido.
     * Verifica que un producto con datos correctos se crea correctamente.
     */
    public static void testProductoValido() {
        Producto p = new Producto("Leche", 2.5, 1, Categoria.ALIMENTACION);

        assertEquals("Leche", p.getNombre());
        assertEquals(2.5, p.getPrecio());
        assertEquals(1, p.getCantidad());
        assertEquals(Categoria.ALIMENTACION, p.getCategoria());
    }

    /**
     * Test de nombre vacío.
     * Debe lanzar IllegalArgumentException.
     */
    public static void testNombreVacio() {
        try {
            new Producto("", 2.5, 1, Categoria.ALIMENTACION);
            throw new AssertionError("Debería lanzar IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Esperado
        }
    }

    /**
     * Test de nombre demasiado corto.
     * Debe lanzar IllegalArgumentException.
     */
    public static void testNombreCorto() {
        try {
            new Producto("A", 2.5, 1, Categoria.ALIMENTACION);
            throw new AssertionError("Debería lanzar IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Esperado
        }
    }

    /**
     * Test de precio negativo.
     * Debe lanzar IllegalArgumentException.
     */
    public static void testPrecioNegativo() {
        try {
            new Producto("Leche", -1, 1, Categoria.ALIMENTACION);
            throw new AssertionError("Debería lanzar IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Esperado
        }
    }

    /**
     * Test de precio cero.
     * Debe lanzar IllegalArgumentException.
     */
    public static void testPrecioCero() {
        try {
            new Producto("Leche", 0, 1, Categoria.ALIMENTACION);
            throw new AssertionError("Debería lanzar IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Esperado
        }
    }

    /**
     * Test de cantidad negativa.
     * Debe lanzar IllegalArgumentException.
     */
    public static void testCantidadNegativa() {
        try {
            new Producto("Leche", 2.5, -1, Categoria.ALIMENTACION);
            throw new AssertionError("Debería lanzar IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Esperado
        }
    }

    /**
     * Test de categoría nula.
     * Debe lanzar IllegalArgumentException.
     */
    public static void testCategoriaNull() {
        try {
            new Producto("Leche", 2.5, 1, null);
            throw new AssertionError("Debería lanzar IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Esperado
        }
    }

    /**
     * Método auxiliar para comprobar igualdad entre valores.
     * 
     * @param expected valor esperado
     * @param actual valor obtenido
     * @throws AssertionError si los valores no coinciden
     */
    private static void assertEquals(Object expected, Object actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }
}