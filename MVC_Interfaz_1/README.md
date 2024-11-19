
# Proyecto MVC en Java

Este proyecto es un ejemplo de una aplicación gráfica que utiliza el patrón Modelo-Vista-Controlador (MVC). El objetivo es realizar una suma entre dos números ingresados por el usuario y mostrar el resultado en una interfaz gráfica.

## Descripción de los Archivos

### 1. **Modelo.java**
- **Rol:** Implementa la lógica de negocio de la aplicación.
- **Detalles:**
  - Contiene un método `sumar` que realiza la operación matemática de suma.
  - Proporciona un método `getResultado` para devolver el resultado de la operación.
- **Ubicación:** [Modelo.java](Modelo.java)

### 2. **Vista.java**
- **Rol:** Define la interfaz gráfica de usuario (GUI).
- **Detalles:**
  - Proporciona dos campos de texto para ingresar los números, un botón para realizar la suma y una etiqueta para mostrar el resultado.
  - Configura el diseño usando `GridLayout` para organizar los componentes visuales.
  - Métodos de acceso a los componentes GUI (`getCampoNumero1`, `getCampoNumero2`, `getBotonSumar`, y `getEtiquetaResultado`).
- **Ubicación:** [Vista.java](Vista.java)

### 3. **Controlador.java**
- **Rol:** Gestiona la interacción entre el modelo y la vista.
- **Detalles:**
  - Configura un evento (listener) para el botón de suma que toma los valores ingresados, los pasa al modelo para la operación de suma, y actualiza la vista con el resultado.
  - Maneja errores como entradas no numéricas, mostrando mensajes apropiados en la GUI.
- **Ubicación:** [Controlador.java](Controlador.java)

### 4. **Main.java**
- **Rol:** Punto de entrada de la aplicación.
- **Detalles:**
  - Crea las instancias de las clases `Modelo`, `Vista`, y `Controlador`.
  - Inicia la aplicación llamando al método `iniciar` del controlador.
- **Ubicación:** [Main.java](Main.java)

## Cómo Ejecutar

1. **Requisitos previos:**
   - Tener instalado Java Development Kit (JDK) 8 o superior.

2. **Compilación:** Desde la línea de comandos, navega al directorio del proyecto y compila todos los archivos `.java`:
   ```bash
   javac *.java
   ```

3. **Ejecución:** Ejecuta el programa principal con:
   ```bash
   java Main
   ```

## Ejemplo de Funcionamiento

1. Se abrirá una ventana gráfica con dos campos de texto para ingresar los números y un botón "Sumar".
2. Al presionar el botón, el resultado de la suma se mostrará en la etiqueta de la interfaz.
3. Si se ingresan datos no válidos, se mostrará un mensaje de error en la misma ventana.

## Licencia

Este proyecto es de uso libre para fines educativos.
