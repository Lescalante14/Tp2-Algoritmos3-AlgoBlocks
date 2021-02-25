package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.modelo.personaje.Personaje;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class VistaPersonaje {

    private Canvas canvasSectorDibujo;
    private Personaje personaje;

    public VistaPersonaje(Canvas canvas, Personaje personaje){
        canvasSectorDibujo = canvas;
        this.personaje = personaje;
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
        canvasSectorDibujo.getGraphicsContext2D().fillRect(0, 0, 460, 220);
    }

    public void update() {
        this.dibujar();
    }
}
