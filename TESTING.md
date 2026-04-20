# TESTING - Clase Producto

## 🔍 Tabla de análisis de parámetros

| Atributo  | Tipo      | Restricción                   |
| --------- | --------- | ----------------------------- |
| nombre    | String    | No vacío, mínimo 2 caracteres |
| precio    | double    | Mayor que 0                   |
| cantidad  | int       | Mayor o igual a 0             |
| categoria | Categoria | No puede ser null             |

---

## ✅ Tabla de casos válidos

| Caso | nombre  | precio | cantidad | categoria    | Resultado esperado |
| ---- | ------- | ------ | -------- | ------------ | ------------------ |
| 1    | "Leche" | 2.5    | 1        | ALIMENTACION | Correcto           |
| 2    | "Pan"   | 1.0    | 2        | ALIMENTACION | Correcto           |
| 3    | "Móvil" | 300    | 1        | ELECTRONICA  | Correcto           |

---

## ❌ Tabla de casos no válidos

| Caso | nombre     | precio | cantidad | categoria    | Resultado esperado        |
| ---- | ---------- | ------ | -------- | ------------ | ------------------------- |
| 1    | ""         | 2.5    | 1        | ALIMENTACION | Error: nombre vacío       |
| 2    | "A"        | 2.5    | 1        | ALIMENTACION | Error: nombre corto       |
| 3    | "Leche"    | -1     | 1        | ALIMENTACION | Error: precio negativo    |
| 4    | "Pan"      | 0      | 1        | ALIMENTACION | Error: precio cero        |
| 5    | "Huevos"   | 2.5    | -1       | ALIMENTACION | Error: cantidad negativa  |
| 6    | "Producto" | 2.5    | 1        | null         | Error: categoría inválida |
