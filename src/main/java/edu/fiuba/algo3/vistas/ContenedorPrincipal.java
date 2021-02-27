package edu.fiuba.algo3.vistas;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {

    BarraDeMenu menuBar;
    VistaJuego vistaJuego;
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
        Image imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoTitulo.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        encabezado.setBackground(new Background(imagenDeFondo));
        encabezado.setAlignment(Pos.TOP_CENTER);
        this.setTop(encabezado);

    }

    private void setCentro() {
        vistaJuego = new VistaJuego();
        pantallaDeJuego = vistaJuego.dibujarContenedores();
        this.setCenter(pantallaDeJuego);
    }

    private Label crearTitulo() {
        Titulo titulo = new Titulo("ALGOBLOCKS");
        titulo.setFont(Font.font(24));
        return titulo;
    }

}
