package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorAlgoritmo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.vistas.botones.BotonAlgoritmo;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

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
        imagenHBox.getChildren().add(new BotonAlgoritmo(controladorAlgoritmo));
        this.setCenter(imagenHBox);
    }
}
