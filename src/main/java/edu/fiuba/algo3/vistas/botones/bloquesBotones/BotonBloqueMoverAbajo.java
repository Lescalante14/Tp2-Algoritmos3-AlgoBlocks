package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverAbajo;
import javafx.scene.control.Button;

public class BotonBloqueMoverAbajo extends Button {

    public BotonBloqueMoverAbajo(ControladorBloqueMoverAbajo controladorBloqueMoverAbajo) {
        super.setText("Bloque Mover Abajo");
        super.setOnAction(controladorBloqueMoverAbajo);
    }
}
