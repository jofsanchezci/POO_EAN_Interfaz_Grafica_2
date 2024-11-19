import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {
    private JTextField pantalla;
    private JButton[] botonesNumeros;
    private JButton[] botonesOperaciones;

    public Vista() {
        setTitle("Calculadora Científica");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Pantalla
        pantalla = new JTextField();
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        add(pantalla, BorderLayout.NORTH);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 4));

        // Botones de números
        botonesNumeros = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            botonesNumeros[i] = new JButton(String.valueOf(i));
            panelBotones.add(botonesNumeros[i]);
        }

        // Botones de operaciones
        String[] operaciones = {"+", "-", "*", "/", "sin", "cos", "tan", "="};
        botonesOperaciones = new JButton[operaciones.length];
        for (int i = 0; i < operaciones.length; i++) {
            botonesOperaciones[i] = new JButton(operaciones[i]);
            panelBotones.add(botonesOperaciones[i]);
        }

        add(panelBotones, BorderLayout.CENTER);
    }

    public JTextField getPantalla() {
        return pantalla;
    }

    public JButton[] getBotonesNumeros() {
        return botonesNumeros;
    }

    public JButton[] getBotonesOperaciones() {
        return botonesOperaciones;
    }
}
