package edu.fiuba.algo3.modelo;

public class Personaje {

    private boolean estadoLapiz;

    public Personaje(){estadoLapiz = false;}

    public boolean lapiz()
    {
        return estadoLapiz;
    }

    public void activarLapiz(){estadoLapiz = true;}
}
