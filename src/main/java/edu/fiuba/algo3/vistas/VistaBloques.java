package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorBotonBloques;
import edu.fiuba.algo3.vistas.botones.BotonBloque;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.util.HashMap;
import java.util.Map;

public class VistaBloques extends BorderPane{

    private VBox bloques;
    HashMap<String, Image> infoBloques;

    public VistaBloques(){
        infoBloques = new HashMap<>();
        this.bloques = new VBox();
        this.setTop(new Titulo("Sector de Bloques"));
        this.setPadding(new Insets(25));
        inicializarBloques();
    }

    private void inicializarBloques() {
        infoBloques.put("mover abajo", new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoBloques.jpg"));
        infoBloques.put("mover arriba", new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoVerde.jpg"));
        infoBloques.put("levantar Lapiz", new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/personaje.jpg"));
    }

    public void dibujar() {

        Image imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/fondoBloques.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        bloques.setBackground(new Background(imagenDeFondo));

        ControladorBotonBloques controladorBotonBloques = new ControladorBotonBloques();

        for(Map.Entry<String, Image> entry : infoBloques.entrySet()) {
            String nombre = entry.getKey();
            Image imagenBloque = entry.getValue();
            bloques.getChildren().add(new BotonBloque(nombre, imagenBloque, controladorBotonBloques));
        }

        this.setCenter(bloques);
    }
}
