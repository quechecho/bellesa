
//Brayan Vega Bolaños - Jose Luis Vides Polo - Arnulfo Domingo Estrada Espire 

package App;

import controlador.ControladorSubsidio;
import modelo.estudiantes;
import validar.validar;
import view.Entrada;
import view.SalidasPariales;
import view.Totales;

import view.VistaSubsidios;


public class app {

   
    public static void main(String[] args) {
        estudiantes est        = new estudiantes();
        VistaSubsidios VisSub  = new VistaSubsidios();
        Entrada  ent            = new Entrada();
        Totales tot              = new Totales();
        SalidasPariales SalPar   = new SalidasPariales();
        validar val            = new validar();
        ControladorSubsidio Con = new ControladorSubsidio( est, VisSub, ent, SalPar, tot, val);
        Con.titulo();
        
        VisSub.getBtnCalcular().setEnabled(false);
        VisSub.getBtnTotalizar().setEnabled(false);
        VisSub.setVisible(true);
        Con.showPane(ent);

    }
   
}

