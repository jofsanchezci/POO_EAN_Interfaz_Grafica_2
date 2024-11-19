import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton; 

public class Controlador {
    private Modelo modelo;
    private Vista vista;
    private String operacion;
    private double numero1;
    private boolean nuevaOperacion = true;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Manejo de eventos para los botones de números
        for (JButton boton : vista.getBotonesNumeros()) {
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (nuevaOperacion) {
                        vista.getPantalla().setText("");
                        nuevaOperacion = false;
                    }
                    vista.getPantalla().setText(vista.getPantalla().getText() + boton.getText());
                }
            });
        }

        // Manejo de eventos para los botones de operaciones
        for (JButton boton : vista.getBotonesOperaciones()) {
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String textoBoton = boton.getText();
                    try {
                        if ("=".equals(textoBoton)) {
                            double numero2 = Double.parseDouble(vista.getPantalla().getText());
                            double resultado = modelo.realizarOperacion(operacion, numero1, numero2);
                            vista.getPantalla().setText(String.valueOf(resultado));
                        } else if ("sin".equals(textoBoton) || "cos".equals(textoBoton) || "tan".equals(textoBoton)) {
                            double numero = Double.parseDouble(vista.getPantalla().getText());
                            double resultado = modelo.realizarOperacionUnaria(textoBoton, numero);
                            vista.getPantalla().setText(String.valueOf(resultado));
                        } else {
                            numero1 = Double.parseDouble(vista.getPantalla().getText());
                            operacion = textoBoton;
                            nuevaOperacion = true;
                        }
                    } catch (Exception ex) {
                        vista.getPantalla().setText("Error");
                    }
                }
            });
        }
    }

    public void iniciar() {
        vista.setVisible(true);
    }
}
