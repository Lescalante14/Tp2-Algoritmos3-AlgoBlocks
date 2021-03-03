package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.controladores.bloquesControladores.ControladorVaciarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonEjecutarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonVaciarAlgoritmo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class VistaAlgoritmo extends BorderPane{

    private ControladorVaciarAlgoritmo controladorVaciarAlgoritmo;
    private ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;
    private VBox imagenVBox;

    public VistaAlgoritmo() {

        this.setTop(new Titulo("Sector de Algoritmos"));
        this.setPadding(new Insets(20));
        imagenVBox = new VBox();
    }

    public void setControladores(ControladorEjecutarAlgoritmo controladorAlgoritmo, ControladorVaciarAlgoritmo controladorVaciarAlgoritmo){
        this.controladorEjecutarAlgoritmo = controladorAlgoritmo;
        this.controladorVaciarAlgoritmo = controladorVaciarAlgoritmo;
        this.dibujar();

    }

    private void dibujar(){
        HBox imagenHBox = new HBox();
        imagenHBox.getChildren().add(new BotonEjecutarAlgoritmo(controladorEjecutarAlgoritmo));
        imagenHBox.getChildren().add(new BotonVaciarAlgoritmo(controladorVaciarAlgoritmo));
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
