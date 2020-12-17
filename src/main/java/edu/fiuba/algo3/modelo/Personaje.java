package edu.fiuba.algo3.modelo;

public class Personaje {

    private EstadoLapiz estado;
    private Posicion posicion;
    public Personaje(){
        estado = new EstadoDesactivado();
        posicion = new Posicion(0,0);
    }

    public String estadoLapiz(){
        return this.estado.dameEstado();
    }

    public void activarLapiz(){
        estado = new EstadoActivado();
    }

    public void desactivarLapiz() {
        estado = new EstadoDesactivado();
    }

    public void ejecutarBloque(Bloque unBloque){
        unBloque.ejecutar(this);
    }

    public Posicion getPosicion(){
        return posicion;
    }

    public void moverADerecha() {
        Posicion posicionNueva = Posicion.derechaDe(posicion);
        //estado.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;
    }

    public void moverAIzquierda() {
        Posicion posicionNueva = Posicion.izquierdaDe(posicion);
        //estado.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;
    }

    public void moverArriba() {
        Posicion posicionNueva = Posicion.arribaDe(posicion);
        //estado.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;
    }

    public void moverAbajo() {
        Posicion posicionNueva = Posicion.abajoDe(posicion);
        //estado.dibujarDesdeHasta(posicion, posicionNueva);
        posicion = posicionNueva;
    }
}
