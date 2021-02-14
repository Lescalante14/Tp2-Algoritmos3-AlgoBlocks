package edu.fiuba.algo3.modelo;

public class Posicion {
    int coordenadaX;
    int coordenadaY;

    public Posicion(){
	    coordenadaX = 0;
	    coordenadaY = 0;
    }
    public Posicion(int posicionEnX, int posicionEnY) {

        coordenadaX = posicionEnX;

        coordenadaY = posicionEnY;
    }

    public boolean compararPosicion(Posicion unaPosicion) {
        return ((coordenadaX == unaPosicion.getCoordenadaX()) && (coordenadaY == unaPosicion.getCoordenadaY()) );
    }

    public void aDerecha() {
        coordenadaX += 1 ;
    }

    public void aIzquierda() {
        coordenadaX -= 1;
    }

    public void aArriba() {
        coordenadaY += 1;
    }

    public void aAbajo() {
        coordenadaY -= 1;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }
    public int  getCoordenadaY(){
        return coordenadaY;
    }
    public void sumar(Posicion unaPosicion){
	coordenadaX += unaPosicion.getCoordenadaX();
	coordenadaY += unaPosicion.getCoordenadaY();    
    }

}
