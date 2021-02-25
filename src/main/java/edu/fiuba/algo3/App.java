package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.modelo.personaje.Personaje;
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

        Tablero tablero = crearModelo();

        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, tablero);
        Scene escenaJuego = new Scene(contenedorPrincipal, 640, 480);

        /*AplicacionOnKeyPressEventHandler AplicacionOnKeyPressEventHandler = new AplicacionOnKeyPressEventHandler(stage, contenedorPrincipal.getBarraDeMenu());
        escenaJuego.setOnKeyPressed(AplicacionOnKeyPressEventHandler);

        ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(stage, escenaJuego);
        Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 640, 480);*/

        stage.setScene(escenaJuego);
        stage.setFullScreen(true);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    private Tablero crearModelo() {
        Personaje personaje = new Personaje();
        Algoritmo algoritmo = new Algoritmo();
        Tablero tablero = new Tablero(personaje, algoritmo);
        return tablero;
    }
}