package app;

import modelo.estudiantes;
import view.SalidasPariales;
import view.Totales;
import view.VistaCola;
import validar.Validar;
import controlador.ControladorCola;

public class App {

    public static void main(String[] args) {
        estudiantes est = new estudiantes();
        Totales tot = new Totales();
        SalidasPariales salPar = new SalidasPariales();
        Validar val = new Validar();
        VistaCola ent = new VistaCola();
        ControladorCola conCol = new ControladorCola(est, salPar, tot, val, ent);
        ent.getBtnCalcular().setEnabled(false);
        ent.getBtnTotalizar().setEnabled(false);
        conCol.titulo();
        conCol.mostrarVentana();
       ent.getBtnBuscarIdeEst().setEnabled(false);
       ent.getBtnBuscarapeEst().setEnabled(false);
       ent.getBtnBuscarnomEst().setEnabled(false);
       ent.getBtnBuscarproSem().setEnabled(false);
       ent.getBtnBuscarvalmatSem().setEnabled(false);
    }
}