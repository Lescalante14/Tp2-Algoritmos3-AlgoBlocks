package edu.fiuba.algo3;

import edu.fiuba.algo3.vistas.ContenedorPrincipal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("AlgoBlocks");

        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage);
        Scene escenaJuego = new Scene(contenedorPrincipal, 640, 480);
        escenaJuego.getStylesheets().add("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/style.css");

        stage.setScene(escenaJuego);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}