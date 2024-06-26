import Ventana.SimpleWindow;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        SwingUtilities.invokeLater(() -> new SimpleWindow().setVisible(true));
    }
}