package edu.fiuba.algo3.vistas;

import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class VistaJuego {

    private VistaPersonaje vistaPersonaje;
    private VistaBloques vistaBloques;
    private VistaAlgoritmo vistaAlgoritmo;
    private GridPane contenedorTablero;

    public VistaJuego() {
        contenedorTablero = new GridPane();
        contenedorTablero.setGridLinesVisible(true); // QUITAR AL FINAL
    }

    public GridPane dibujarContenedores() {
        contenedorTablero.add(crearVistaPersonaje(), 0,0);
        contenedorTablero.add(crearVistaSectorBloques(), 1, 0);
        contenedorTablero.add(crearVistaSectorAlgoritmo(), 2, 0);
        return contenedorTablero;
    }

    private BorderPane crearVistaPersonaje(){
        vistaPersonaje = new VistaPersonaje();
        vistaPersonaje.dibujar();
        return vistaPersonaje;
    }

    private BorderPane crearVistaSectorAlgoritmo() {
        vistaAlgoritmo = new VistaAlgoritmo();
        vistaAlgoritmo.dibujar();
        return vistaAlgoritmo;
    }

    private BorderPane crearVistaSectorBloques() {
        vistaBloques = new VistaBloques();
        vistaBloques.dibujar();
        return vistaBloques;
    }


}
