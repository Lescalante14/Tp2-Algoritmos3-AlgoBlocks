package edu.fiuba.algo3.vistas.botones.bloquesBotones;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloquePerzonalizado;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class BotonBloquePersonalizado extends Button {

    public BotonBloquePersonalizado(ControladorBloquePerzonalizado controladorBloquePerzonalizado, String nombreDeBloque) {
        super.setText(nombreDeBloque);
        Image bloquePerzonalizado = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/bloque_grande.png");
        BackgroundImage imagenDeFondo = new BackgroundImage(bloquePerzonalizado, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        super.setPrefSize(100,100);
        super.setBackground(new Background(imagenDeFondo));
        super.setOnAction(controladorBloquePerzonalizado);
        super.setId("boton-bloque-personalizado");
    }
}
