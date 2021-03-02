package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.controladores.bloquesControladores.ControladorReiniciarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonEjecutarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonReiniciarAlgoritmo;
import javafx.geometry.Insets;
import javafx.scene.layout.*;

public class VistaAlgoritmo extends BorderPane{

    private ControladorReiniciarAlgoritmo controladorReiniciarAlgoritmo;
    private ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;

    public VistaAlgoritmo(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo, ControladorReiniciarAlgoritmo controladorReiniciarAlgoritmo) {
        this.controladorEjecutarAlgoritmo = controladorEjecutarAlgoritmo;
        this.controladorReiniciarAlgoritmo = controladorReiniciarAlgoritmo;
        this.setTop(new Titulo("Sector de Algoritmos"));
        this.setPadding(new Insets(25));
        this.dibujar();

    }

    public void dibujar(){
        HBox imagenHBox = new HBox();
        imagenHBox.getChildren().add(new BotonEjecutarAlgoritmo(controladorEjecutarAlgoritmo));
        imagenHBox.getChildren().add(new BotonReiniciarAlgoritmo(controladorReiniciarAlgoritmo));
        this.setCenter(imagenHBox);
    }
}
