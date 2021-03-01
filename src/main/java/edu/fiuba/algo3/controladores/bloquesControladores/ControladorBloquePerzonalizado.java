package edu.fiuba.algo3.controladores.bloquesControladores;

import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBloquePerzonalizado implements EventHandler<ActionEvent> {

    private final Algoritmo algoritmo;

    public ControladorBloquePerzonalizado(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
