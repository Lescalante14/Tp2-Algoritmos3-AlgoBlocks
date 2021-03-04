package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloquePerzonalizado;
import javafx.scene.control.Button;

public class BotonBloquePersonalizado extends Button {

    public BotonBloquePersonalizado(ControladorBloquePerzonalizado controladorBloquePerzonalizado, String nombreDeBloque) {
        super.setText(nombreDeBloque);
        super.setId("boton-bloque-personalizado");
        super.setPrefSize(100,100);
        super.setOnAction(controladorBloquePerzonalizado);
    }
}
