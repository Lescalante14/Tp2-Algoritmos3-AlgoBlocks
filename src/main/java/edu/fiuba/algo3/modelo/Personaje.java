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

    public void ejecutarBloque(Bloque unBloque){
        unBloque.ejecutar(this);
    }

    public void desactivarLapiz() {
        estado = new EstadoDesactivado();
    }

    public Posicion getPosicion(){
        return posicion;
    }
}
