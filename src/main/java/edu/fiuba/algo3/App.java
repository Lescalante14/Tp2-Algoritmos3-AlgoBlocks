package edu.fiuba.algo3;

import edu.fiuba.algo3.vistas.componentes.ContenedorPrincipal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("AlgoBlocks");

        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage);
        final Scene escenaJuego = new Scene(contenedorPrincipal, 640, 480);
        File file = new File("src/main/java/edu/fiuba/algo3/resources/style.css");
        escenaJuego.getStylesheets().add("file:///" + file.getAbsolutePath().replace("\\", "/"));

        stage.setScene(escenaJuego);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}