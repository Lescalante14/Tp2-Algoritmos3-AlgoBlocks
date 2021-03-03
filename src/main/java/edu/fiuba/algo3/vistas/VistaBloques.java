package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorEjecutarAlgoritmo;
import edu.fiuba.algo3.controladores.bloquesControladores.*;
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
    private final ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo;

    public VistaBloques(ControladorEjecutarAlgoritmo controladorEjecutarAlgoritmo){
        this.controladorEjecutarAlgoritmo = controladorEjecutarAlgoritmo;
        this.bloquesScroll = new ScrollPane();
        this.bloques = new VBox();
        this.setTop(new Titulo("Sector de Bloques"));
        this.setPadding(new Insets(25));
        this.dibujar();

        this.bloques.setPrefSize(20,150);
        this.bloquesScroll.setContent(bloques);
        this.bloquesScroll.setPrefSize(200,200);
        this.bloquesScroll.setFitToHeight(false);
        this.bloquesScroll.setPannable(true);
        this.bloquesScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        this.bloques.setId("contenedor-de-bloques");
    }

    public void dibujar() {

        Image imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/Tp2/barra_bloques.png",350,350,false,true);
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        bloques.setBackground(new Background(imagenDeFondo));

        bloques.getChildren().add(new BotonBloqueMoverArriba(new ControladorBloqueMoverArriba(controladorEjecutarAlgoritmo)));
        bloques.getChildren().add(new BotonBloqueMoverAbajo(new ControladorBloqueMoverAbajo(controladorEjecutarAlgoritmo)));
        bloques.getChildren().add(new BotonBloqueMoverDerecha(new ControladorBloqueMoverDerecha(controladorEjecutarAlgoritmo)));
        bloques.getChildren().add(new BotonBloqueMoverIzquierda(new ControladorBloqueMoverIzquierda(controladorEjecutarAlgoritmo)));
        bloques.getChildren().add(new BotonBloqueActivarLapiz(new ControladorBloqueActivarLapiz(controladorEjecutarAlgoritmo)));
        bloques.getChildren().add(new BotonBloqueDesactivarLapiz(new ControladorBloqueDesactivarLapiz(controladorEjecutarAlgoritmo)));
        bloques.getChildren().add(new BotonBloquePersonalizado(new ControladorBloquePerzonalizado(controladorEjecutarAlgoritmo)));
        bloques.getChildren().add(new BotonBloqueRepetir(new ControladorBloqueRepetir(controladorEjecutarAlgoritmo)));

        this.setCenter(bloquesScroll);
    }
}
