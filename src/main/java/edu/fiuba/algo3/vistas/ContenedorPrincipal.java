package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import javafx.css.Stylesheet;
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

public class ContenedorPrincipal extends BorderPane {

    BarraDeMenu menuBar;
    VistaTablero vistaTablero;
    GridPane pantallaDeJuego;

    public ContenedorPrincipal(Stage stage) {
        this.setEncabezado(stage);
        this.setCentro();
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

    private void setEncabezado(Stage stage) {
        VBox encabezado = new VBox();
        this.menuBar = new BarraDeMenu(stage);
        encabezado.getChildren().add(menuBar);
        encabezado.getChildren().add(crearTitulo());
        encabezado.setAlignment(Pos.TOP_CENTER);
        this.setTop(encabezado);

    }

    private void setCentro() {
        vistaTablero = new VistaTablero();
        pantallaDeJuego = vistaTablero.dibujarContenedores();
        this.setCenter(pantallaDeJuego);
    }

    private Label crearTitulo() {
        Titulo titulo = new Titulo("ALGOBLOCKS");
        titulo.setFont(Font.font(24));
        return titulo;
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
