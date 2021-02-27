package edu.fiuba.algo3.vistas;

import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.util.concurrent.BrokenBarrierException;

public class VistaTablero {

    private VistaPersonaje vistaPersonaje;
    private VistaBloques vistaBloques;
    private VistaAlgoritmo vistaAlgoritmo;
    private GridPane contenedorTablero;

    public VistaTablero() {
        contenedorTablero = new GridPane();
        contenedorTablero.setGridLinesVisible(true); // QUITAR AL FINLAL
    }

    public GridPane dibujarContenedores() {
        contenedorTablero.add(crearVistaPersonaje(), 0,0);
        contenedorTablero.add(crearVistaSectorBloques(), 1, 0);
        contenedorTablero.add(crearVistaSectorAlgoritmo(), 2, 0);
        return contenedorTablero;
    }

    private BorderPane crearVistaPersonaje(){
        BorderPane sectorDibujo = new BorderPane();
        Canvas canvasSectorDibujo = new Canvas(400, 400);
        vistaPersonaje = new VistaPersonaje(canvasSectorDibujo, sectorDibujo);
        vistaPersonaje.dibujar();
        return sectorDibujo;
    }

    private BorderPane crearVistaSectorAlgoritmo() {
        BorderPane sectorAlgoritmo = new BorderPane();
        vistaAlgoritmo = new VistaAlgoritmo(sectorAlgoritmo);
        vistaAlgoritmo.dibujar();
        return sectorAlgoritmo;
    }

    private BorderPane crearVistaSectorBloques() {
        BorderPane sectorBloques = new BorderPane();
        vistaBloques = new VistaBloques(sectorBloques);
        vistaBloques.dibujar();
        return sectorBloques;
    }


}
