import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {
    private JTextField campoNumero1;
    private JTextField campoNumero2;
    private JButton botonSumar;
    private JLabel etiquetaResultado;

    public Vista() {
        // Configuración de la ventana
        setTitle("Ejemplo MVC - Suma");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Componentes
        add(new JLabel("Número 1:"));
        campoNumero1 = new JTextField();
        add(campoNumero1);

        add(new JLabel("Número 2:"));
        campoNumero2 = new JTextField();
        add(campoNumero2);

        botonSumar = new JButton("Sumar");
        add(botonSumar);

        etiquetaResultado = new JLabel("Resultado: ");
        add(etiquetaResultado);
    }

    public JTextField getCampoNumero1() {
        return campoNumero1;
    }

    public JTextField getCampoNumero2() {
        return campoNumero2;
    }

    public JButton getBotonSumar() {
        return botonSumar;
    }

    public JLabel getEtiquetaResultado() {
        return etiquetaResultado;
    }
}
