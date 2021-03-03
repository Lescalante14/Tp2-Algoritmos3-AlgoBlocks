package edu.fiuba.algo3.vistas;

import edu.fiuba.algo3.controladores.ControladorSectorDibujo;
import edu.fiuba.algo3.controladores.bloquesControladores.ControladorReiniciarPosicion;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.vistas.botones.bloquesBotones.BotonReiniciarPosicion;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class VistaSectorDibujo extends BorderPane {

    private Canvas canvasPersonaje;
    private Personaje personaje;
    private Image imagenPersonaje;
    private Group grupo;
    private Canvas canvasDibujo;
    ControladorSectorDibujo controladorSectorDibujo;

    public VistaSectorDibujo(Personaje personaje){
        imagenPersonaje = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/personaje_lapiz_desactivado.png", 60,60,false, true);
        this.personaje = personaje;
        this.setTop(new Titulo("Sector de Dibujo"));
        crearVistaPrincipal();
        ControladorReiniciarPosicion controladorReiniciarPosicion = new ControladorReiniciarPosicion(personaje, this);
        this.setBottom(new BotonReiniciarPosicion(controladorReiniciarPosicion));

        this.setPadding(new Insets(25));
        this.dibujar();


        this.controladorSectorDibujo = new ControladorSectorDibujo(personaje.getSectorDibujo(), this);
    }

    public void dibujar() {
        this.dibujarFormas();
    }

    private void dibujarFormas() {
        this.clean();
        canvasPersonaje.getGraphicsContext2D().drawImage(imagenPersonaje, personaje.getPosicion().getX() + 200, personaje.getPosicion().getY()*(-1) + 200);
        canvasPersonaje.getGraphicsContext2D().setFill(Color.BLUE);
        }

    public void clean() {
        canvasPersonaje.getGraphicsContext2D().setFill(Color.BEIGE);
        canvasPersonaje.getGraphicsContext2D().fillRect(0, 0, 400, 400);
    }

    public void update(Image imagen) {
        this.imagenPersonaje = imagen;
        this.dibujar();
    }

    public void vaciarVistaPersonaje(Personaje personaje, Image imagenInicial) {
        this.personaje = personaje;
        crearVistaPrincipal();
        update(imagenInicial);
    }

    public void pintarCasilla(Posicion posicionInicial, Posicion posicionFinal) {
        canvasDibujo.getGraphicsContext2D().strokeLine(posicionInicial.getX() +200, posicionInicial.getY()*(-1) +200, posicionFinal.getX() +200, posicionFinal.getY()*(-1) +200);
    }

    private void crearVistaPrincipal(){
        canvasPersonaje = new Canvas(400, 400);
        canvasDibujo = new Canvas(400,400);
        this.grupo = new Group(canvasPersonaje, canvasDibujo);
        this.setCenter(grupo);
    }
}
