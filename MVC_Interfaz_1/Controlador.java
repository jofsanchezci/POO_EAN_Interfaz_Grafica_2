import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Añadir el listener al botón
        this.vista.getBotonSumar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarSuma();
            }
        });
    }

    public void iniciar() {
        vista.setVisible(true);
    }

    private void realizarSuma() {
        try {
            int numero1 = Integer.parseInt(vista.getCampoNumero1().getText());
            int numero2 = Integer.parseInt(vista.getCampoNumero2().getText());
            modelo.sumar(numero1, numero2);
            vista.getEtiquetaResultado().setText("Resultado: " + modelo.getResultado());
        } catch (NumberFormatException e) {
            vista.getEtiquetaResultado().setText("Por favor, ingrese números válidos.");
        }
    }
}
