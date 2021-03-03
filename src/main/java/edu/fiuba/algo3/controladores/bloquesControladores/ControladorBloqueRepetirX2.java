package edu.fiuba.algo3.controladores.bloquesControladores;

import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.modelo.bloque.BloqueRepeticion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBloqueRepetirX2 implements EventHandler<ActionEvent> {

    private final ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;

    public ControladorBloqueRepetirX2(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo) {
        this.controladorEjecutarAlgoritmo = controladorEjecutarAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        controladorEjecutarAlgoritmo.updateVistaAlgortimo("-------------- [Inicio] Bloque Repeticion x2 --------------");
        controladorEjecutarAlgoritmo.activarBloqueTemporal(new BloqueRepeticion(2));
    }
}
