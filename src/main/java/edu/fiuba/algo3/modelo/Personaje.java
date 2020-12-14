package edu.fiuba.algo3.modelo;

public class Personaje {

    private EstadoLapiz estado;

    public Personaje(){
        estado = new EstadoDesactivado();
    }

    public String estadoLapiz(){
        return this.estado.dameEstado();
    }

    public void activarLapiz(){
        estado = new EstadoActivado();
    }

    public void ejecutarBloque(BloqueBajarLapiz unBloque){
        unBloque.ejecutar(this);
    }
}
