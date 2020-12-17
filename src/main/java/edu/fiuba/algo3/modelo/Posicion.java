package edu.fiuba.algo3.modelo;

public class Posicion {
    int coordenadaX;
    int coordenadaY;

    public Posicion(int posicionEnX, int posicionEnY) {

        coordenadaX = posicionEnX;

        coordenadaY = posicionEnY;
    }

    public static boolean compararPosiciones(Posicion posicion1, Posicion posicion2) {
        return ((posicion1.getCoordenadaX() == posicion2.getCoordenadaX())&&(posicion1.getCoordenadaY() == posicion2.getCoordenadaY()));
    }

    public static Posicion derechaDe(Posicion posicion) {
        return (new Posicion(posicion.coordenadaX + 1, posicion.coordenadaY));
    }

    public static Posicion izquierdaDe(Posicion posicion) {
        return (new Posicion(posicion.coordenadaX -1 , posicion.coordenadaY));
    }

    public static Posicion arribaDe(Posicion posicion) {
        return (new Posicion(posicion.coordenadaX, posicion.coordenadaY + 1));
    }

    public static Posicion abajoDe(Posicion posicion) {
        return (new Posicion(posicion.coordenadaX, posicion.coordenadaY - 1));
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }
    public int  getCoordenadaY(){
        return coordenadaY;
    }

}
