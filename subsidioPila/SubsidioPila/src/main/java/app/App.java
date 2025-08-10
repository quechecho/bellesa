package app;

import modelo.estudiantes;
import view.SalidasPariales;
import view.Totales;
import view.VistaPila;
import validar.Validar;
import controlador.ControladorPila;

public class App {

    public static void main(String[] args) {
        estudiantes est = new estudiantes();
        Totales tot = new Totales();
        SalidasPariales salPar = new SalidasPariales();
        Validar val = new Validar();
        VistaPila ent = new VistaPila();
        ControladorPila conPil = new ControladorPila(est, salPar, tot, val, ent);
        ent.getBtnCalcular().setEnabled(false);
        ent.getBtnTotalizar().setEnabled(false);
        conPil.titulo();
        conPil.mostrarVentana();
        ent.getBtnBuscarIdeEst().setEnabled(false);
        ent.getBtnBuscarapeEst().setEnabled(false);
        ent.getBtnBuscarnomEst().setEnabled(false);
        ent.getBtnBuscarproSem().setEnabled(false);
        ent.getBtnBuscarvalmatSem().setEnabled(false);
    }
}