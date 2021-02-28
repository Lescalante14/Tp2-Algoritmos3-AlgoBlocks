package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.bloque.bloqueDeMovimiento.BloqueMoverDerecha;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.HashMap;


public class ControladorBotonBloques implements EventHandler<ActionEvent>{

    private Algoritmo algoritmo;
    private static HashMap<String, Bloque> infoBloques;

    public ControladorBotonBloques(Algoritmo algoritmo){
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoritmo.agregarBloque(new BloqueMoverDerecha());
    }
}
