package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.controladores.ControladorGuardarAlgoritmo;
import edu.fiuba.algo3.controladores.ControladorVaciarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonEjecutarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonGuardarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.BotonVaciarAlgoritmo;
import javafx.geometry.Insets;
import javafx.scene.layout.*;

public class VistaAlgoritmo extends BorderPane{

    private ControladorVaciarAlgoritmo controladorVaciarAlgoritmo;
    private ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;
    private VBox imagenVBox;
    private BotonGuardarAlgoritmo botonGuardarAlgoritmo;

    public VistaAlgoritmo() {
        this.setTop(new Titulo("Sector de Algoritmos"));
        this.setPadding(new Insets(20));
        imagenVBox = new VBox();
        imagenVBox.setPrefSize(700,600);

    }

    public void setControladores(ControladorEjecutarAlgoritmo controladorAlgoritmo, ControladorVaciarAlgoritmo controladorVaciarAlgoritmo, ControladorGuardarAlgoritmo controladorGuardarAlgoritmo){
        this.controladorEjecutarAlgoritmo = controladorAlgoritmo;
        this.controladorVaciarAlgoritmo = controladorVaciarAlgoritmo;
        this.botonGuardarAlgoritmo = new BotonGuardarAlgoritmo(controladorGuardarAlgoritmo);
        this.dibujar();

    }

    private void dibujar(){
        HBox imagenHBox = new HBox(100);

        imagenHBox.getChildren().add(new BotonEjecutarAlgoritmo(controladorEjecutarAlgoritmo));
        imagenHBox.getChildren().add(new BotonVaciarAlgoritmo(controladorVaciarAlgoritmo));
        imagenHBox.getChildren().add(botonGuardarAlgoritmo);
        imagenVBox.getChildren().add(imagenHBox);
        this.setCenter(imagenVBox);
    }

    public void update(String nombreBoton){imagenVBox.getChildren().add(new Titulo(nombreBoton)); }

    public void vaciarVistaAlgoritmo(){
        this.imagenVBox = new VBox();
        this.dibujar();
    }

    public void desactivarBotonGuardado(boolean estado) {
        this.botonGuardarAlgoritmo.setDisable(estado);
    }
}
