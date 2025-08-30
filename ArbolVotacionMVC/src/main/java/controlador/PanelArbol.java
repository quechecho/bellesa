package controlador;

import modelo.Nodo;
import javax.swing.*;
import java.awt.*;

public class PanelArbol extends JPanel {
    private Nodo raiz;
    private static final int ANCHO_NODO = 150;
    private static final int ALTO_NODO = 70;
    private static final int ESPACIO_X = 50;
    private static final int ESPACIO_Y = 90;

    public PanelArbol(Nodo raiz) {
        this.raiz = raiz;
        setPreferredSize(new Dimension(900, 600));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (raiz != null) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            dibujarNodo(g2, raiz, getWidth() / 2, 50, getWidth() / 4);
        }
    }

    private void dibujarNodo(Graphics2D g, Nodo nodo, int x, int y, int offset) {
        if (nodo == null) return;

        // Líneas de conexión a hijos
        g.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        if (nodo.izquierda != null) {
            g.drawLine(x, y, x - offset, y + ESPACIO_Y);
            dibujarNodo(g, nodo.izquierda, x - offset, y + ESPACIO_Y, offset / 2);
        }
        if (nodo.derecha != null) {
            g.drawLine(x, y, x + offset, y + ESPACIO_Y);
            dibujarNodo(g, nodo.derecha, x + offset, y + ESPACIO_Y, offset / 2);
        }

        // Dibujar rectángulo redondeado para el nodo
        int rectX = x - ANCHO_NODO / 2;
        int rectY = y - ALTO_NODO / 2;

        g.setColor(Color.WHITE);
        g.fillRoundRect(rectX, rectY, ANCHO_NODO, ALTO_NODO, 20, 20);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.drawRoundRect(rectX, rectY, ANCHO_NODO, ALTO_NODO, 20, 20);

        // Escribir datos del nodo dentro del rectángulo
        g.setFont(new Font("Arial", Font.PLAIN, 11));
        FontMetrics fm = g.getFontMetrics();

        String linea1 = "Doc: " + nodo.getDocumento();
        String linea2 = nodo.getNombre() + " " + nodo.getApellido();
        String linea3 = "Voto: " + nodo.getVoto();

        int textY = rectY + 20;
        g.drawString(linea1, rectX + 10, textY);
        g.drawString(linea2, rectX + 10, textY + 18);
        g.drawString(linea3, rectX + 10, textY + 36);
    }
}
