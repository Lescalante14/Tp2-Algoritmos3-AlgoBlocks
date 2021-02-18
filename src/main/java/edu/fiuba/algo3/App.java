package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("AlgoBlocks");
        titulo.setTextAlignment(TextAlignment.CENTER);
        titulo.setFont(new Font("Arial", 24));

        Label sectorDibujo = new Label("sectorDibujo");
        Label sectorBloquesDisponibles = new Label("sectorBloques");
        Label sectorAlgoritmo = new Label("sectorAlgoritmo");

        HBox nombresSectores = new HBox(150, sectorDibujo, sectorBloquesDisponibles, sectorAlgoritmo);
        HBox tablero = new HBox(20, new Rectangle(200, 200, Color.DARKBLUE),
                                        new Rectangle(100, 200, Color.DARKGREEN),
                                        new Rectangle(300, 300, Color.DARKGREY));

        VBox contenedorPrincipal = new VBox(20, titulo, nombresSectores, tablero);
        contenedorPrincipal.setAlignment(Pos.BASELINE_CENTER);
        contenedorPrincipal.setPadding(new Insets(10,10,10,10));


        Scene scene = new Scene(contenedorPrincipal, 1080, 720);
        stage.setTitle("AlgoBlocks");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}