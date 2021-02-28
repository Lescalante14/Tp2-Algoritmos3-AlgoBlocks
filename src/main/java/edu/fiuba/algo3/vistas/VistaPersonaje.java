package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.modelo.Personaje;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class VistaPersonaje extends BorderPane {

    private Canvas canvasSectorDibujo;
    private Personaje personaje;

    public VistaPersonaje(){
        canvasSectorDibujo = new Canvas(400, 400);
        this.personaje = new Personaje();
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
        canvasSectorDibujo.getGraphicsContext2D().setFill(Color.BLUE);
        canvasSectorDibujo.getGraphicsContext2D().fillOval(personaje.getPosicion().getX() + 200, personaje.getPosicion().getY() + 200, 10, 10);
    }

    public void clean() {

        canvasSectorDibujo.getGraphicsContext2D().setFill(Color.BEIGE);
        canvasSectorDibujo.getGraphicsContext2D().fillRect(0, 0, 400, 400);
    }

    public void update() {
        this.dibujar();
    }
}
