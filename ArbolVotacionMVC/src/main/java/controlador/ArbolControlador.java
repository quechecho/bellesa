package controlador;

import modelo.ArbolVotacion;
import modelo.Nodo;
import vista.FrmVotacion;
import vista.FrmResultados;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class ArbolControlador implements ActionListener {

    private FrmVotacion frmVotacion;
    private FrmResultados frmResultados;
    private ArbolVotacion arbol;
    private String votoSeleccionado = "";

    public ArbolControlador(FrmVotacion frmVotacion, FrmResultados frmResultados, ArbolVotacion arbol) {
        this.frmVotacion = frmVotacion;
        this.frmResultados = frmResultados;
        this.arbol = arbol;

        // botones de FrmVotacion
        frmVotacion.btnSantiago.addActionListener(this);
        frmVotacion.btnVanessa.addActionListener(this);
        frmVotacion.btnMoises.addActionListener(this);
        frmVotacion.btnVotoBlanco.addActionListener(this);

        frmVotacion.btnInsertar.addActionListener(this);
        frmVotacion.btnNuevo.addActionListener(this);
        frmVotacion.btnSalir.addActionListener(this);
        frmVotacion.btnCalcular.addActionListener(this);
        frmVotacion.btnTotalizar.addActionListener(this);
        frmVotacion.btnOpcionAvanzadas.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object btn = e.getSource();

        // seleccionar voto
        if (btn == frmVotacion.btnSantiago) votoSeleccionado = "Santiago";
        if (btn == frmVotacion.btnVanessa) votoSeleccionado = "Vanessa";
        if (btn == frmVotacion.btnMoises) votoSeleccionado = "Moises";
        if (btn == frmVotacion.btnVotoBlanco) votoSeleccionado = "Blanco";

        // insertar votante
        if (btn == frmVotacion.btnInsertar) {
            String doc = frmVotacion.txtDocumento.getText();
            String nom = frmVotacion.txtNombre.getText();
            String ape = frmVotacion.txtApellido.getText();

            if (doc.isEmpty() || nom.isEmpty() || ape.isEmpty() || votoSeleccionado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos y seleccionar un voto");
                return;
            }

            arbol.insertar(doc, nom, ape, votoSeleccionado);
            JOptionPane.showMessageDialog(null, "Votante insertado con éxito");
        }

        // limpiar
        if (btn == frmVotacion.btnNuevo) {
            frmVotacion.txtDocumento.setText("");
            frmVotacion.txtNombre.setText("");
            frmVotacion.txtApellido.setText("");
            votoSeleccionado = "";
        }

        // salir
        if (btn == frmVotacion.btnSalir) {
            System.exit(0);
        }

        // abrir opciones avanzadas
        if (btn == frmVotacion.btnOpcionAvanzadas) {
            frmResultados.setVisible(true);
        }

        // totalizar votos
        if (btn == frmVotacion.btnTotalizar) mostrarTotales();

        // calcular ganador
        if (btn == frmVotacion.btnCalcular) calcularGanador();
    }

    // contar votos de un candidato
    private int contarVotos(String candidato) {
        List<Nodo> lista = arbol.inOrden();
        int count = 0;
        for (Nodo n : lista) {
            if (n.getVoto().equalsIgnoreCase(candidato)) {
                count++;
            }
        }
        return count;
    }

    private void mostrarTotales() {
        int votosS = contarVotos("Santiago");
        int votosV = contarVotos("Vanessa");
        int votosM = contarVotos("Moises");
        int votosB = contarVotos("Blanco");

        int total = votosS + votosV + votosM + votosB;
        if (total == 0) {
            JOptionPane.showMessageDialog(null, "No hay votos registrados");
            return;
        }

        String mensaje = "Totales:\n"
                + "Santiago: " + votosS + " (" + (votosS * 100 / total) + "%)\n"
                + "Vanessa: " + votosV + " (" + (votosV * 100 / total) + "%)\n"
                + "Moises: " + votosM + " (" + (votosM * 100 / total) + "%)\n"
                + "Blanco: " + votosB + " (" + (votosB * 100 / total) + "%)\n"
                + "Total: " + total;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    private void calcularGanador() {
        int votosS = contarVotos("Santiago");
        int votosV = contarVotos("Vanessa");
        int votosM = contarVotos("Moises");
        int votosB = contarVotos("Blanco");

        int total = votosS + votosV + votosM + votosB;
        if (total == 0) {
            JOptionPane.showMessageDialog(null, "No hay votos registrados");
            return;
        }

        // blancos mayoría
        if (votosB > votosS && votosB > votosV && votosB > votosM) {
            JOptionPane.showMessageDialog(null, "❌ No hay candidato ganador.\nLos votos en blanco son mayoría.\nDebe repetirse la elección.");
            return;
        }

        String ganador = "Santiago";
        int max = votosS;

        if (votosV > max) { ganador = "Vanessa"; max = votosV; }
        if (votosM > max) { ganador = "Moises"; max = votosM; }

        int porcentaje = (max * 100) / total;

        JOptionPane.showMessageDialog(null, "✅ Ganador: " + ganador 
                + "\nVotos: " + max 
                + "\nPorcentaje: " + porcentaje + "%");
    }
}
