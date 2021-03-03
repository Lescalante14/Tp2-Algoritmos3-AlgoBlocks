package edu.fiuba.algo3.controladores.bloquesControladores;

import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.modelo.bloque.BloqueInvertir;
import edu.fiuba.algo3.modelo.bloque.BloqueRepeticion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBloqueInvertir implements EventHandler<ActionEvent> {

    private final ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;

    public ControladorBloqueInvertir(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo) {

        this.controladorEjecutarAlgoritmo = controladorEjecutarAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        controladorEjecutarAlgoritmo.updateVistaAlgortimo("-------------- [Inicio] Bloque Inversion --------------");
        controladorEjecutarAlgoritmo.activarBloqueTemporal(new BloqueInvertir());
    }
}
