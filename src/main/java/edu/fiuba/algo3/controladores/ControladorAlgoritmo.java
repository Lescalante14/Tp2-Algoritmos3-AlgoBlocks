package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.vistas.VistaPersonaje;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;
import java.util.List;


public class ControladorAlgoritmo implements EventHandler<ActionEvent> {

    private List<Bloque> secuenciaBloques;
    private final VistaPersonaje vistaPersonaje;
    private final Personaje personaje;

    public ControladorAlgoritmo(Personaje personaje, VistaPersonaje vistaPersonaje){
        secuenciaBloques = new ArrayList<>();
        this.personaje = personaje;
        this.vistaPersonaje = vistaPersonaje;
    }

    public void handle(ActionEvent actionEvent) {
        for (Bloque unBLoque : secuenciaBloques) {
            unBLoque.ejecutar(personaje);
            this.vistaPersonaje.update();
        }
        secuenciaBloques = new ArrayList<>();
    }

    public void agregarBloque(Bloque bloque){
        this.secuenciaBloques.add(bloque);
    }
}
