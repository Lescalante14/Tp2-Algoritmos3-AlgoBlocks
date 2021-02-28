package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.vistas.VistaPersonaje;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;
import java.util.List;


public class ControladorAlgoritmo implements EventHandler<ActionEvent> {

    private final VistaPersonaje vistaPersonaje;
    private final Personaje personaje;
    private Algoritmo algortimo;

    public ControladorAlgoritmo(Personaje personaje, VistaPersonaje vistaPersonaje, Algoritmo algoritmo){
        this.personaje = personaje;
        this.vistaPersonaje = vistaPersonaje;
        this.algortimo = algoritmo;
    }

    public void handle(ActionEvent actionEvent) {
        algortimo.ejecutarAlgoritmo(personaje);
        vistaPersonaje.update();
    }
    }
