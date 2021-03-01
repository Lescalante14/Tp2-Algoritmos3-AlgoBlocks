package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverIzquierda;
import javafx.scene.control.Button;

public class BotonBloqueMoverIzquierda extends Button {

    public BotonBloqueMoverIzquierda(ControladorBloqueMoverIzquierda controladorBloqueMoverIzquierda){
        super.setText("Bloque Mover Izquierda");
        super.setOnAction(controladorBloqueMoverIzquierda);
    }
}
