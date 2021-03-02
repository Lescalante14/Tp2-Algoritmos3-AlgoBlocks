package edu.fiuba.algo3.controladores.bloquesControladores;

import edu.fiuba.algo3.controladores.ControladorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBloquePerzonalizado implements EventHandler<ActionEvent> {

    private final ControladorAlgoritmo controladorAlgoritmo;

    public ControladorBloquePerzonalizado(ControladorAlgoritmo controladorAlgoritmo) {
        this.controladorAlgoritmo = controladorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
