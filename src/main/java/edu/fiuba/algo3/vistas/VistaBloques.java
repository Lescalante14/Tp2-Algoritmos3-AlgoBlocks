package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.bloquesControladores.*;
import edu.fiuba.algo3.modelo.algortimo.Algoritmo;
import edu.fiuba.algo3.vistas.botones.bloquesBotones.BotonBloqueDesactivarLapiz;
import edu.fiuba.algo3.controladores.bloquesControladores.ControladorBloqueDesactivarLapiz;
import edu.fiuba.algo3.vistas.botones.bloquesBotones.*;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class VistaBloques extends BorderPane{

    private final ScrollPane bloquesScroll;
    private final VBox bloques;
    private final Algoritmo algoritmo;

    public VistaBloques(Algoritmo algoritmo){

        this.algoritmo = algoritmo;
        this.bloquesScroll = new ScrollPane();
        this.bloques = new VBox();
        this.setTop(new Titulo("Sector de Bloques"));
        this.setPadding(new Insets(25));
        this.dibujar();

        this.bloques.setPrefSize(20,50);
        this.bloquesScroll.setContent(bloques);
        this.bloquesScroll.setPrefSize(50,50);
        this.bloquesScroll.setFitToHeight(false);
        //this.bloquesScroll.setFitToWidth(true);
        this.bloquesScroll.setPannable(true);
        this.bloquesScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
    }

    public void dibujar() {

        Image imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/Tp2/barra_bloques.png",350,350,false,true);
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        bloques.setBackground(new Background(imagenDeFondo));

        bloques.getChildren().add(new BotonBloqueMoverArriba(new ControladorBloqueMoverArriba(algoritmo)));
        bloques.getChildren().add(new BotonBloqueMoverAbajo(new ControladorBloqueMoverAbajo(algoritmo)));
        bloques.getChildren().add(new BotonBloqueMoverDerecha(new ControladorBloqueMoverDerecha(algoritmo)));
        bloques.getChildren().add(new BotonBloqueMoverIzquierda(new ControladorBloqueMoverIzquierda(algoritmo)));
        bloques.getChildren().add(new BotonBloqueActivarLapiz(new ControladorBloqueActivarLapiz(algoritmo)));
        bloques.getChildren().add(new BotonBloqueDesactivarLapiz(new ControladorBloqueDesactivarLapiz(algoritmo)));
        bloques.getChildren().add(new BotonBloquePersonalizado(new ControladorBloquePerzonalizado(algoritmo)));
        bloques.getChildren().add(new BotonBloqueRepetir(new ControladorBloqueRepetir(algoritmo)));

        this.setCenter(bloquesScroll);
    }
}
