package edu.fiuba.algo3.vistas.botones;

import edu.fiuba.algo3.controladores.ControladorAlgoritmo;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class BotonAlgoritmo extends Button {

    public BotonAlgoritmo(ControladorAlgoritmo controladorAlgoritmo) {
        super.setText("Ejecutar");
        super.setOnAction(controladorAlgoritmo);
    }
}
