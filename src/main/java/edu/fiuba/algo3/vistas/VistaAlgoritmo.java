package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorGuardarAlgoritmo;
import edu.fiuba.algo3.controladores.algoritmoControladores.ControladorVaciarAlgoritmo;
import edu.fiuba.algo3.controladores.ControladorBreak;
import edu.fiuba.algo3.vistas.botones.juegoBotones.BotonBreak;
import edu.fiuba.algo3.vistas.botones.juegoBotones.BotonEjecutarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.juegoBotones.BotonGuardarAlgoritmo;
import edu.fiuba.algo3.vistas.botones.juegoBotones.BotonVaciarAlgoritmo;
import edu.fiuba.algo3.vistas.componentes.Titulo;
import javafx.geometry.Insets;
import javafx.scene.layout.*;

public class VistaAlgoritmo extends BorderPane{

    private ControladorVaciarAlgoritmo controladorVaciarAlgoritmo;
    private ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;
    private VBox imagenVBox;
    private HBox imagenHBox;
    private BotonEjecutarAlgoritmo botonEjecutarAlgoritmo;
    private BotonGuardarAlgoritmo botonGuardarAlgoritmo;
    private BotonBreak botonBreak;

    public VistaAlgoritmo() {
        Titulo titulo = new Titulo("Sector de Algoritmos");
        titulo.setId("titulo-algoritmo");
        this.setTop(titulo);
        this.setPadding(new Insets(20));
        imagenHBox = new HBox(100);
        imagenVBox = new VBox();
        imagenVBox.setPrefSize(700,600);


    }

    public void setControladores(ControladorEjecutarAlgoritmo controladorAlgoritmo, ControladorVaciarAlgoritmo controladorVaciarAlgoritmo, ControladorGuardarAlgoritmo controladorGuardarAlgoritmo){
        this.controladorEjecutarAlgoritmo = controladorAlgoritmo;
        this.controladorVaciarAlgoritmo = controladorVaciarAlgoritmo;
        this.botonGuardarAlgoritmo = new BotonGuardarAlgoritmo(controladorGuardarAlgoritmo);
        this.botonEjecutarAlgoritmo= new BotonEjecutarAlgoritmo(controladorEjecutarAlgoritmo);
        this.botonBreak = new BotonBreak(new ControladorBreak(controladorEjecutarAlgoritmo));
        this.dibujar();

    }

    private void dibujar(){
        imagenHBox = new HBox(100);
        imagenHBox.getChildren().add(botonEjecutarAlgoritmo);
        imagenHBox.getChildren().add(new BotonVaciarAlgoritmo(controladorVaciarAlgoritmo));
        imagenHBox.getChildren().add(botonGuardarAlgoritmo);
        imagenVBox.getChildren().add(imagenHBox);
        this.setCenter(imagenVBox);
    }

    public void update(String nombreBoton){imagenVBox.getChildren().add(new Titulo(nombreBoton)); }

    public void vaciarVistaAlgoritmo(){
        this.imagenVBox = new VBox();
        imagenVBox.setPrefSize(700,600);
        this.dibujar();
    }

    public void desactivarBotonGuardado(boolean estado) {
        this.botonGuardarAlgoritmo.setDisable(estado);
    }

    public void desactivarBotonEjecutar(boolean estado) {
        this.botonEjecutarAlgoritmo.setDisable(estado);
    }

    public void desactivarBotonBreak(boolean estado) {
        this.botonBreak.setDisable(estado);
    }

    public void mostrarBotonBreak() {
        desactivarBotonBreak(true);
        imagenHBox.getChildren().add(botonBreak);
    }

    public void removerBotonBreak() {
        imagenHBox.getChildren().remove(imagenHBox.getChildren().size()-1);

    }

    public void eliminarBloqueTemporal() {
        controladorEjecutarAlgoritmo.eliminarBloqueTemporal();
    }
}
