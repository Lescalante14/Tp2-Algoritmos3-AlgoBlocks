package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.bloque.bloqueDeMovimiento.BloqueMoverDerecha;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.HashMap;


public class ControladorBotonBloques implements EventHandler<ActionEvent>{

    private ControladorAlgoritmo controladorAlgoritmo;
    private static HashMap<String, Bloque> infoBloques;

    public ControladorBotonBloques(ControladorAlgoritmo controladorAlgoritmo){
        this.controladorAlgoritmo = controladorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        controladorAlgoritmo.agregarBloque(new BloqueMoverDerecha());
    }
}
