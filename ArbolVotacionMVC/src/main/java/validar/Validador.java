package validar;

import javax.swing.JOptionPane;

public class Validador {
    public static boolean validarTexto(String texto, String campo) {
        if (texto == null || texto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo " + campo + " es obligatorio");
            return false;
        }
        return true;
    }

    public static boolean validarNumero(String texto, String campo) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El campo " + campo + " debe ser numérico");
            return false;
        }
    }
}

