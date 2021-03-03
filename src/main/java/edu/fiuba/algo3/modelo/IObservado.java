package edu.fiuba.algo3.modelo;

public interface IObservado {

    public void agregarObservador(IObservador observador);

    public void notificarObservadores();
}
