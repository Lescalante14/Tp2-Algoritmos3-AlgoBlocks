package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorPrincipal extends GridPane {

    BarraDeMenu menuBar;
    VistaTablero vistaTablero;
    GridPane contenedorTablero;

    public ContenedorPrincipal(Stage stage, Tablero tablero) {
        this.setMenu(stage);
        this.setCentro(tablero);
        //this.setConsola();
        //this.setBotonera(tablero);
    }

    /*private void setBotonera(Tablero tablero) {

        Button botonMover = new Button();
        botonMover.setText("Mover");
        BotonMoverHandler moveButtonHandler = new BotonMoverHandler(vistaRobot, tablero);
        botonMover.setOnAction(moveButtonHandler);

        Button botonDireccion = new Button();
        botonDireccion.setText("Cambiar direccion");
        BotonDireccionHandler directionButtonHandler = new BotonDireccionHandler(robot);
        botonDireccion.setOnAction(directionButtonHandler);

        VBox contenedorVertical = new VBox(botonMover, botonDireccion);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);

    }*/

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.add(menuBar,0,0);
    }

    private void setCentro(Tablero tablero) {
        vistaTablero = new VistaTablero(tablero);

        contenedorTablero = vistaTablero.dibujarContenedores();
        /*Image imagen = new Image("file:src/vista/imagenes/fondo-verde.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        contenedorCentral.setBackground(new Background(imagenDeFondo));*/

        this.add(contenedorTablero, 0, 1);
    }

    /*private void setConsola() {

        // TODO cambiar por el modelo de Consola...
        Label etiqueta = new Label();
        etiqueta.setText("consola...");
        etiqueta.setFont(Font.font("courier new", FontWeight.SEMI_BOLD, 14));
        etiqueta.setTextFill(Color.WHITE);

        VBox contenedorConsola = new VBox(etiqueta);
        contenedorConsola.setSpacing(10);
        contenedorConsola.setPadding(new Insets(15));
        contenedorConsola.setStyle("-fx-background-color: black;");

        this.add(contenedorConsola, 2,0);
    }*/

    public BarraDeMenu getBarraDeMenu() {
        return menuBar;
    }
}
