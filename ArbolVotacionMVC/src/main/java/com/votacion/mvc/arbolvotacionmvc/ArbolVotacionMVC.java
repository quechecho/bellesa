package com.votacion.mvc.arbolvotacionmvc;

import controlador.ArbolControlador;
import controlador.ArbolResultadoControlador;
import modelo.ArbolVotacion;
import vista.FrmResultados;
import vista.FrmVotacion;

public class ArbolVotacionMVC {
    public static void main(String[] args) {
        // Modelo
        ArbolVotacion arbol = new ArbolVotacion();

        // Vistas
        FrmVotacion frmVotacion = new FrmVotacion();
        FrmResultados frmResultados = new FrmResultados();

        // Controladores
        ArbolControlador ctrlArbol = new ArbolControlador(frmVotacion, frmResultados, arbol);
        ArbolResultadoControlador ctrlResultados = new ArbolResultadoControlador(frmResultados, arbol);

        // Mostrar vista principal
        frmVotacion.setVisible(true);
    }
}

