package edu.fiuba.algo3.modelo;

public class Lapiz {
    private EstadoLapiz estado;

    public Lapiz(){
        estado = new EstadoDesactivado();
    }

    public EstadoLapiz estado(){
        return estado;
    }

    public void activar(){
        estado = new EstadoActivado();
    }
    public void desactivar(){
        estado = new EstadoDesactivado();
    }
    public void dibujar(){

    }
    public boolean estaActivado(){
        return this.estado.estaActivado();
    }
}
