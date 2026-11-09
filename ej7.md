# Ejercicio 7: Notificable

## Explicación Lógica
1. **Colecciones Heterogéneas:** Permite agrupar diferentes tipos de notificaciones (`Email`, `SMS`, `Push`) dentro de un `ArrayList<Notificable>`.
2. **Iteración Polimórfica:** El bucle `for-each` ejecuta `enviarNotificacion(...)` disparando el comportamiento adecuado según la clase del elemento.