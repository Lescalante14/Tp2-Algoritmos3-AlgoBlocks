package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverAbajo;
import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverArriba;
import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverDerecha;
import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueMoverIzquierda;
import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.vistas.botones.bloquesBotones.BotonBloqueMoverAbajo;
import edu.fiuba.algo3.vistas.botones.bloquesBotones.BotonBloqueMoverArriba;
import edu.fiuba.algo3.vistas.botones.bloquesBotones.BotonBloqueMoverDerecha;
import edu.fiuba.algo3.vistas.botones.bloquesBotones.BotonBloqueMoverIzquierda;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class VistaBloques extends BorderPane{

    private final VBox bloques;
    private final Algoritmo algoritmo;

    public VistaBloques(Algoritmo algoritmo){

        this.algoritmo = algoritmo;
        this.bloques = new VBox(20);
        this.setTop(new Titulo("Sector de Bloques"));
        this.setPadding(new Insets(25));
        this.dibujar();
    }

    public void dibujar() {

        Image imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoBloques.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        bloques.setBackground(new Background(imagenDeFondo));

        bloques.getChildren().add(new BotonBloqueMoverArriba(new ControladorBloqueMoverArriba(algoritmo)));
        bloques.getChildren().add(new BotonBloqueMoverAbajo(new ControladorBloqueMoverAbajo(algoritmo)));
        bloques.getChildren().add(new BotonBloqueMoverDerecha(new ControladorBloqueMoverDerecha(algoritmo)));
        bloques.getChildren().add(new BotonBloqueMoverIzquierda(new ControladorBloqueMoverIzquierda(algoritmo)));

        this.setCenter(bloques);
    }
}
