package edu.fiuba.algo3.vistas.botones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorReiniciarAlgoritmo;
import javafx.scene.control.Button;

public class BotonReiniciarAlgoritmo extends Button {

    public BotonReiniciarAlgoritmo(ControladorReiniciarAlgoritmo controladorReiniciarAlgoritmo){
        super.setText("Reiniciar");
        super.setOnAction(controladorReiniciarAlgoritmo);
    }
}
