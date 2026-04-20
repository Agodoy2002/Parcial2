# Proyecto Carrito de Compra

## 📌 Descripción

Este proyecto implementa un sistema de carrito de compra en Java. Permite añadir productos, mostrar el contenido del carrito y calcular el total.

---

## 👤 Autoría

Autor: [TU NOMBRE]
Versión: 1.0

---

## ⚙️ Funcionamiento

El sistema está compuesto por varias clases:

* **Producto**: Representa un producto con nombre, precio, cantidad y categoría.
* **Categoria**: Enum que define las categorías disponibles.
* **GestorCarrito**: Gestiona la lista de productos y las operaciones del carrito.
* **CarritoCompra**: Clase principal que ejecuta el programa.

El funcionamiento es:

1. Se crean productos
2. Se añaden al carrito
3. Se muestran los productos
4. Se calcula el total

---

## 🧪 Tests

Se han realizado pruebas sobre la clase `Producto` para validar los criterios definidos en el análisis de caja negra.

Se han probado:

* Casos válidos (datos correctos)
* Casos no válidos (errores en nombre, precio, cantidad y categoría)

Debido a problemas de configuración con JUnit, se ha implementado una versión alternativa de testing manual.
