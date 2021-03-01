package edu.fiuba.algo3.controladores.bloquesControladores;


import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueDesactivarLapiz;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControladorBloqueDesactivarLapiz implements EventHandler<ActionEvent> {

    private final Algoritmo algoritmo;

    public ControladorBloqueDesactivarLapiz(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        algoritmo.agregarBloque(new BloqueDesactivarLapiz());
    }
}
