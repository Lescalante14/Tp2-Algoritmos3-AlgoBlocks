package edu.fiuba.algo3.controladores.bloquesControladores;

import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.vistas.VistaAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorReiniciarAlgoritmo implements EventHandler<ActionEvent> {

    private final Algoritmo algoritmo;
    private final VistaAlgoritmo vistaAlgoritmo;

    public ControladorReiniciarAlgoritmo(Algoritmo algoritmo, VistaAlgoritmo vistaAlgoritmo){
        this.algoritmo = algoritmo;
        this.vistaAlgoritmo = vistaAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoritmo.vaciarAlgoritmo();
        vistaAlgoritmo.vaciarVistaAlgoritmo();
    }
}
