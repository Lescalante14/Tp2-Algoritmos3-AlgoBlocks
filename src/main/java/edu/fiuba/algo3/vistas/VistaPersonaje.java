package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.modelo.Personaje;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class VistaPersonaje extends BorderPane {

    private final Canvas canvasSectorDibujo;
    private final Personaje personaje;
    private final Image imagenPersonaje;

    public VistaPersonaje(Personaje personaje){
        imagenPersonaje = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/personaje_lapiz_desactivado.png", 60,60,false, true);

        canvasSectorDibujo = new Canvas(400, 400);
        this.personaje = personaje;
        this.setTop(new Titulo("Sector de Dibujo"));
        this.setCenter(canvasSectorDibujo);
        this.setPadding(new Insets(25));
        this.dibujar();
    }

    public void dibujar() {
        this.dibujarFormas();
    }

    private void dibujarFormas() {
        this.clean();
        canvasSectorDibujo.getGraphicsContext2D().drawImage(imagenPersonaje, personaje.getPosicion().getX() + 200, personaje.getPosicion().getY()*(-1) + 200);
        canvasSectorDibujo.getGraphicsContext2D().setFill(Color.BLUE);
        }

    public void clean() {
        canvasSectorDibujo.getGraphicsContext2D().setFill(Color.BEIGE);
        canvasSectorDibujo.getGraphicsContext2D().fillRect(0, 0, 400, 400);
    }

    public void update() {
        this.dibujar();
    }
}
