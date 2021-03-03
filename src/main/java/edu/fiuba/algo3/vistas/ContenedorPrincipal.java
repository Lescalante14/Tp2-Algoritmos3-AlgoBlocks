package edu.fiuba.algo3.vistas;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
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
    }

    private void setEncabezado(Stage stage) {
        VBox encabezado = new VBox();
        this.menuBar = new BarraDeMenu(stage);
        encabezado.getChildren().add(menuBar);
        encabezado.getChildren().add(crearTitulo());
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
