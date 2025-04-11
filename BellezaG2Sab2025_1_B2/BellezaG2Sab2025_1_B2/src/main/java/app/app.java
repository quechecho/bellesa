
package app;

import controller.ControladorBelleza;
import model.Belleza;
import validate.Validar;
import view.Entrada;
import view.Parcial;
import view.Total;
import view.VistaBelleza;

public class app {

    public static void main(String[] args) {
        Belleza bel             = new Belleza();
        VistaBelleza visBel    = new VistaBelleza();
        Entrada ent            = new Entrada();
        Parcial par            = new Parcial();
        Total tot              = new Total();
        Validar val            = new Validar();
        ControladorBelleza con = new ControladorBelleza(bel, visBel, ent, par, tot, val);
        con.titulo();
        visBel.getBtnCalcular().setEnabled(false);
        visBel.getBtnTotalizar().setEnabled(false);
        visBel.setVisible(true);
        con.showPane(ent);
    }
}
