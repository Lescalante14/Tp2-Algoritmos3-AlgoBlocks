package edu.fiuba.algo3.vistas.botones;

import edu.fiuba.algo3.controladores.ControladorBreak;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class BotonBreak extends Button {
    public BotonBreak(ControladorBreak controladorBreak){
        super.setDisable(true);
        super.setText("Break");
        super.setOnAction(controladorBreak);
    }
}
