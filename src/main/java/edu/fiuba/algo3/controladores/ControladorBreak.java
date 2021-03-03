package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorEjecutarAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBreak implements EventHandler<ActionEvent> {
    
    ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;

    public ControladorBreak(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo) {
        this.controladorEjecutarAlgoritmo= controladorEjecutarAlgoritmo;
    }
    @Override
    public void handle(ActionEvent actionEvent) {

        controladorEjecutarAlgoritmo.desactivarBloqueTemporal();
        controladorEjecutarAlgoritmo.updateVistaAlgortimo("--------------[Fin Secuencia] --------------");

    }


}
