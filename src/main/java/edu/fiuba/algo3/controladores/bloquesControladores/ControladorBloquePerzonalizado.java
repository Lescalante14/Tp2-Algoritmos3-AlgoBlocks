package edu.fiuba.algo3.controladores.bloquesControladores;

import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBloquePerzonalizado implements EventHandler<ActionEvent> {

    private final ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;

    public ControladorBloquePerzonalizado(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo) {
        this.controladorEjecutarAlgoritmo = controladorEjecutarAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
