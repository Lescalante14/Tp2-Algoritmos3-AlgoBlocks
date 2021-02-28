package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorAlgoritmo;
import edu.fiuba.algo3.controladores.ControladorBotonBloques;
import edu.fiuba.algo3.vistas.botones.BotonAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonBloque;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.util.Map;

public class VistaAlgoritmo extends BorderPane{

    private ControladorAlgoritmo controladorAlgoritmo;

    public VistaAlgoritmo(ControladorAlgoritmo controladorAlgoritmo) {
        this.controladorAlgoritmo = controladorAlgoritmo;
        this.setTop(new Titulo("Sector de Algoritmos"));
        this.setPadding(new Insets(25));
        this.dibujar();

    }

    public void dibujar(){
        HBox imagenHBox = new HBox();
        Image imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoVerde.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        imagenHBox.setBackground(new Background(imagenDeFondo));
        imagenHBox.getChildren().add(new BotonAlgoritmo(controladorAlgoritmo));
        this.setCenter(imagenHBox);
    }
}
