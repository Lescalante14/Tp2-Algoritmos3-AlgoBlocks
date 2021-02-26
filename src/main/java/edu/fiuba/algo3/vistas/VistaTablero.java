package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VistaTablero {

    private Tablero tablero;
    private VistaPersonaje vistaPersonaje;
    private VistaBloques vistaBloques;
    private VistaAlgoritmo vistaAlgoritmo;
    private GridPane contenedorTablero;

    public VistaTablero(Tablero tablero) {
        this.tablero = tablero;
        contenedorTablero = new GridPane();
        contenedorTablero.setGridLinesVisible(true); // QUITAR AL FINLAL
        contenedorTablero.setHgap(20);
    }

    public GridPane dibujarContenedores() {
        contenedorTablero.add(crearNombreSector("Sector de Dibujo"),0,0);
        contenedorTablero.add(crearVistaPersonaje(), 0,1);
        contenedorTablero.add(crearNombreSector("Sector de Bloques"),1,0);
        contenedorTablero.add(crearVistaSectorBloques(), 1, 1);
        contenedorTablero.add(crearNombreSector("Sector de Algoritmo"),2,0);
        contenedorTablero.add(crearVistaSectorAlgoritmo(), 2, 1);
        return contenedorTablero;
    }

    private Titulo crearNombreSector(String nombreSector) {
        return new Titulo(nombreSector);
    }


    private HBox crearVistaPersonaje(){

        Canvas canvasSectorDibujo = new Canvas(400, 400);
        vistaPersonaje = new VistaPersonaje(canvasSectorDibujo, tablero.getPersonaje());
        vistaPersonaje.dibujar();
        HBox sectorDibujo = new HBox(canvasSectorDibujo);
        sectorDibujo.setAlignment(Pos.CENTER);
        sectorDibujo.setSpacing(20);
        sectorDibujo.setPadding(new Insets(25));
        return sectorDibujo;

    }


    private GridPane crearVistaSectorAlgoritmo() {
        GridPane sectorAlgoritmo = new GridPane();
        sectorAlgoritmo.setAlignment(Pos.TOP_CENTER);
        sectorAlgoritmo.setPadding(new Insets(25));
        vistaAlgoritmo = new VistaAlgoritmo(sectorAlgoritmo);
        vistaAlgoritmo.dibujar();

        return sectorAlgoritmo;

    }

    private VBox crearVistaSectorBloques() {
        VBox bloques = new VBox();
        bloques.setAlignment(Pos.CENTER);
        bloques.setSpacing(20);
        bloques.setPadding(new Insets(25));
        vistaBloques = new VistaBloques(bloques);
        vistaBloques.dibujar();

        return bloques;
    }


}
