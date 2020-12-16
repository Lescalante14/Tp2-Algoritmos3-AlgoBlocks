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

    public void ejecutarBloque(Bloque unBloque){
        unBloque.ejecutar(this);
    }

    public void desactivarLapiz() { estado = new EstadoDesactivado();
    }

}
