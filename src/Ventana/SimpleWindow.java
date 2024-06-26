package Ventana;

import Models.HiloUsuario;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {
    private JTextArea textArea;
    private JTextField textField;
    private JButton button1;
    private JButton button2;
    private JLabel label;

    public SimpleWindow() {
        // Configuración de la ventana
        setTitle("Ventana Simple");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear componentes
        textArea = new JTextArea();
        textField = new JTextField();
        button1 = new JButton("Nuevo usuario");
        button2 = new JButton("Comprar");
        label = new JLabel("Total tickets");

        // Configuración de un panel para el TextField y los botones
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Añadir el TextField y los botones al panel
        panel.add(textField, BorderLayout.NORTH);
        panel.add(button1, BorderLayout.WEST);
        panel.add(button2, BorderLayout.EAST);

        // Añadir el label al panel sur
        JPanel southPanel = new JPanel();
        southPanel.add(label);

        // Añadir componentes a la ventana
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);

        // Acción para botón 1 utilizando expresiones lambda
        button1.addActionListener(e -> new HiloUsuario(e.getIdentificacion)));

        // Acción para botón 2 utilizando expresiones lambda
        button2.addActionListener(e -> label.setText(textField.getText()));
    }
}
