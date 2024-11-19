
# Calculadora Científica en Java

Este proyecto implementa una calculadora científica utilizando el patrón de diseño Modelo-Vista-Controlador (MVC). La aplicación permite realizar operaciones básicas como suma, resta, multiplicación y división, así como funciones científicas como seno, coseno y tangente.

## Estructura del Proyecto

1. **Modelo (`Modelo.java`)**
   - **Rol:** Contiene la lógica de negocio de la calculadora.
   - **Detalles:**
     - Implementa las operaciones básicas (+, -, *, /) y funciones científicas (sin, cos, tan).
     - Maneja errores como división por cero o entradas no válidas.
   - **Ubicación:** [Modelo.java](Modelo.java)

2. **Vista (`Vista.java`)**
   - **Rol:** Define la interfaz gráfica de usuario (GUI).
   - **Detalles:**
     - Proporciona botones para números (0-9) y operaciones (+, -, *, /, sin, cos, tan, =).
     - Incluye una pantalla para mostrar los resultados y entradas.
     - Usa `JButton` y `JTextField` para interactuar con el usuario.
   - **Ubicación:** [Vista.java](Vista.java)

3. **Controlador (`Controlador.java`)**
   - **Rol:** Gestiona la interacción entre el modelo y la vista.
   - **Detalles:**
     - Configura los eventos de los botones para realizar las operaciones.
     - Coordina la lógica entre los componentes de la vista y el modelo.
     - Maneja errores y muestra mensajes en la pantalla de la calculadora.
   - **Ubicación:** [Controlador.java](Controlador.java)

4. **Clase Principal (`Main.java`)**
   - **Rol:** Punto de entrada de la aplicación.
   - **Detalles:**
     - Crea las instancias de las clases `Modelo`, `Vista`, y `Controlador`.
     - Llama al método `iniciar()` del controlador para lanzar la interfaz gráfica.
   - **Ubicación:** [Main.java](Main.java)

## Cómo Ejecutar

### Requisitos:
- **Java Development Kit (JDK):** Versión 8 o superior.

### Pasos:
1. **Compilar los archivos:**
   ```bash
   javac *.java
   ```

2. **Ejecutar la aplicación:**
   ```bash
   java Main
   ```

## Funcionalidades

### Operaciones Soportadas
1. **Básicas:**
   - Suma (+)
   - Resta (-)
   - Multiplicación (*)
   - División (/)

2. **Científicas:**
   - Seno (sin)
   - Coseno (cos)
   - Tangente (tan)

3. **Manejo de errores:**
   - División por cero: muestra un mensaje de error.
   - Entrada no válida: notifica al usuario en la pantalla.

### Ejemplo de Uso
1. Ingresa un número.
2. Selecciona una operación (por ejemplo, `+` o `sin`).
3. Ingresa el segundo número (si es necesario).
4. Presiona el botón `=` para obtener el resultado.

## Licencia

Este proyecto es de uso libre para fines educativos.
