package edu.fiuba.algo3.modelo;

public class Posicion {
    int coordenadaX;
    int coordenadaY;

    public Posicion(int posicionEnX, int posicionEnY) {

        coordenadaX = posicionEnX;

        coordenadaY = posicionEnY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }
    public int  getCoordenadaY(){
        return coordenadaY;
    }



    public boolean esIgualA(Posicion unaPosicion) {

        return((coordenadaX == unaPosicion.getCoordenadaX())&&(coordenadaY == unaPosicion.getCoordenadaY()));
    }
}
