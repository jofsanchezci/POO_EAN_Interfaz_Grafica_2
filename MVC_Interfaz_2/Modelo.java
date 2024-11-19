public class Modelo {
    public double realizarOperacion(String operacion, double numero1, double numero2) {
        switch (operacion) {
            case "+":
                return numero1 + numero2;
            case "-":
                return numero1 - numero2;
            case "*":
                return numero1 * numero2;
            case "/":
                if (numero2 != 0) {
                    return numero1 / numero2;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }

    public double realizarOperacionUnaria(String operacion, double numero) {
        switch (operacion) {
            case "sin":
                return Math.sin(numero);
            case "cos":
                return Math.cos(numero);
            case "tan":
                return Math.tan(numero);
            default:
                throw new IllegalArgumentException("Operación no válida");
        }
    }
}
