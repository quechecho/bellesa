package modelo;

public class Validar {

    //Validar cadena
    public boolean validarCadena(String cad) {
        return cad.matches("^([A-Za-záéíóúÁÉÍÓÚ]+)$");
    }
    
    public boolean validarIsbn(String cad) {
        return cad.matches("^([0-9\\-]+)$");
    }
}
