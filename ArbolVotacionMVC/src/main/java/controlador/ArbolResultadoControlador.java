package controlador;

import modelo.ArbolVotacion;
import modelo.Nodo;
import vista.FrmResultados;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.List;
import controlador.PanelArbol;

public class ArbolResultadoControlador implements ActionListener {

    private FrmResultados frmResultados;
    private ArbolVotacion arbol;

    public ArbolResultadoControlador(FrmResultados frmResultados, ArbolVotacion arbol) {
        this.frmResultados = frmResultados;
        this.arbol = arbol;

        frmResultados.btnBuscar.addActionListener(this);
        frmResultados.btnEliminar.addActionListener(this);

        frmResultados.btnInorden.addActionListener(this);
        frmResultados.btnPreorden.addActionListener(this);
        frmResultados.btnPostorden.addActionListener(this);
        frmResultados.btnNiveles.addActionListener(this);

        frmResultados.btnContar.addActionListener(this);
        frmResultados.btnAltura.addActionListener(this);
        frmResultados.btnHojas.addActionListener(this);
        frmResultados.btnInternos.addActionListener(this);
        frmResultados.btnBalanceado.addActionListener(this);

        frmResultados.btnLimpiar.addActionListener(this);
        frmResultados.btnCerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object btn = e.getSource();

        if (btn == frmResultados.btnBuscar) {
            String doc = frmResultados.txtDocumento.getText();
            Nodo encontrado = arbol.buscar(doc);
            if (encontrado != null) {
                cargarTabla(List.of(encontrado));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el documento");
            }
        }

        if (btn == frmResultados.btnEliminar) {
            String doc = frmResultados.txtDocumento.getText();
            arbol.eliminar(doc);
            JOptionPane.showMessageDialog(null, "Nodo eliminado (si existía)");
        }

        if (btn == frmResultados.btnInorden) {
            cargarTabla(arbol.inOrden());
            mostrarArbolGrafico("Inorden");
            JOptionPane.showMessageDialog(null, "Recorrido Inorden:\n" + listaComoTexto(arbol.inOrden()));
        }
        if (btn == frmResultados.btnPreorden) {
            cargarTabla(arbol.preOrden());
            mostrarArbolGrafico("Preorden");
            JOptionPane.showMessageDialog(null, "Recorrido Preorden:\n" + listaComoTexto(arbol.preOrden()));
        }
        if (btn == frmResultados.btnPostorden) {
            cargarTabla(arbol.postOrden());
            mostrarArbolGrafico("Postorden");
            JOptionPane.showMessageDialog(null, "Recorrido Postorden:\n" + listaComoTexto(arbol.postOrden()));
        }
        if (btn == frmResultados.btnNiveles) {
            cargarTabla(arbol.porNiveles());
            mostrarArbolGrafico("Niveles");
            JOptionPane.showMessageDialog(null, "Recorrido por Niveles:\n" + listaComoTexto(arbol.porNiveles()));
        }

        if (btn == frmResultados.btnContar) {
            JOptionPane.showMessageDialog(null, "Total de nodos: " + arbol.contar());
        }

        if (btn == frmResultados.btnAltura) {
            JOptionPane.showMessageDialog(null, "Altura del árbol: " + arbol.altura());
        }

        if (btn == frmResultados.btnHojas) {
            JOptionPane.showMessageDialog(null, "Número de hojas: " + arbol.contarHojas());
        }

        if (btn == frmResultados.btnInternos) {
            JOptionPane.showMessageDialog(null, "Nodos internos: " + arbol.contarInternos());
        }

        if (btn == frmResultados.btnBalanceado) {
            JOptionPane.showMessageDialog(null, "¿Árbol balanceado?: " + (arbol.estaBalanceado() ? "Sí" : "No"));
        }

        if (btn == frmResultados.btnLimpiar) {
            DefaultTableModel model = (DefaultTableModel) frmResultados.tablaResultados.getModel();
            model.setRowCount(0);
        }

        if (btn == frmResultados.btnCerrar) {
            frmResultados.setVisible(false);
        }
    }

    private void cargarTabla(List<Nodo> lista) {
        DefaultTableModel model = (DefaultTableModel) frmResultados.tablaResultados.getModel();
        model.setRowCount(0);
        for (Nodo n : lista) {
            model.addRow(new Object[]{n.getDocumento(), n.getNombre(), n.getApellido(), n.getVoto()});
        }
    }

    private void mostrarArbolGrafico(String tipo) {
        JFrame ventana = new JFrame("Árbol Binario - " + tipo);
        ventana.add(new PanelArbol(arbol.getRaiz()));
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private String listaComoTexto(List<Nodo> lista) {
        StringBuilder sb = new StringBuilder();
        for (Nodo n : lista) {
            sb.append(n.getDocumento())
                    .append(" - ").append(n.getNombre()).append(" ").append(n.getApellido())
                    .append(" (Voto: ").append(n.getVoto()).append(") | ");
        }
        return sb.toString();
    }

}
