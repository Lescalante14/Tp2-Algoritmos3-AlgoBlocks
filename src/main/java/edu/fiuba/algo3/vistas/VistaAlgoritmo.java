package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.controladores.bloquesControladores.ControladorReiniciarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonEjecutarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonReiniciarAlgoritmo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class VistaAlgoritmo extends BorderPane{

    private ControladorReiniciarAlgoritmo controladorReiniciarAlgoritmo;
    private ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;
    private VBox imagenVBox;

    public VistaAlgoritmo() {

        this.setTop(new Titulo("Sector de Algoritmos"));
        this.setPadding(new Insets(20));
        imagenVBox = new VBox();
    }

    public void setControladores(ControladorEjecutarAlgoritmo controladorAlgoritmo, ControladorReiniciarAlgoritmo controladorReiniciarAlgoritmo){
        this.controladorEjecutarAlgoritmo = controladorAlgoritmo;
        this.controladorReiniciarAlgoritmo = controladorReiniciarAlgoritmo;
        this.dibujar();

    }

    private void dibujar(){
        HBox imagenHBox = new HBox();
        imagenHBox.getChildren().add(new BotonEjecutarAlgoritmo(controladorEjecutarAlgoritmo));
        imagenHBox.getChildren().add(new BotonReiniciarAlgoritmo(controladorReiniciarAlgoritmo));
        imagenVBox.getChildren().add(imagenHBox);
        this.setCenter(imagenVBox);
    }

    public void update(String nombreBoton){
        imagenVBox.getChildren().add(new Button(nombreBoton));
    }

    public void vaciarVistaAlgoritmo(){
        this.imagenVBox = new VBox();
        this.dibujar();
    }
}
