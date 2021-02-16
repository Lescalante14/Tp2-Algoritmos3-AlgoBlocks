package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    @Test
    public void creacióndelPersonajeConElLápizDesactivado()
    {

        Personaje personaje = new Personaje();

        assertFalse(personaje.estadoLapiz().estaActivado());

    }

    @Test
    public void posicionDeUnPersonajeRecienCreadoEsLaCorrespondiente(){

        Personaje personaje = new Personaje();

        Posicion posicionCero = new Posicion(0,0);

        assertTrue(Posicion.compararPosiciones(posicionCero, personaje.getPosicion()));

    }

    @Test
    public void alAplicarBloqueActivarLapizseActivaElLapiz()
    {

        Personaje personaje = new Personaje();
        Lapiz lapizActivo = new Lapiz();

        lapizActivo.activar();
        personaje.cambiarLapiz(lapizActivo);
        assertTrue(personaje.estadoLapiz().estaActivado());

    }



    @Test
    public void alAplicarBloqueSubirLapizseDesactivaElLapiz()
    {

        Personaje personaje = new Personaje();
        Lapiz lapizActivo = new Lapiz();
        lapizActivo.activar();

        personaje.cambiarLapiz(lapizActivo);
        assertTrue(personaje.estadoLapiz().estaActivado());

        lapizActivo.desactivar();
        personaje.cambiarLapiz(lapizActivo);

        assertFalse(personaje.estadoLapiz().estaActivado());

    }

    @Test
    public void AlAplicarBloqueMoverDerechaSeMueveALaDerecha()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.mover(Posicion.derechaDe(personaje.getPosicion()));
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.derechaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverIzquierdaSeMueveALaIzquierda()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.mover(Posicion.izquierdaDe(personaje.getPosicion()));

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.izquierdaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverArribaSeMueveAArriba()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.mover(Posicion.arribaDe(personaje.getPosicion()));

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.arribaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverAbajoSeMueveAAbajo()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.mover(Posicion.abajoDe(personaje.getPosicion()));

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.abajoDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverDerechaYAbajoEstaEnLaPosicionCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.mover(Posicion.derechaDe(personaje.getPosicion()));
        personaje.mover(Posicion.abajoDe(personaje.getPosicion()));

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion() ,
                   Posicion.abajoDe(Posicion.derechaDe(posicionInicial) )));

    }

    @Test
    public void AlAplicarBloqueMoverArribaEIzquierdaEstaEnLaPosicionCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.mover(Posicion.arribaDe(personaje.getPosicion()));
        personaje.mover(Posicion.izquierdaDe(personaje.getPosicion()));

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion() ,
                Posicion.izquierdaDe(Posicion.arribaDe(posicionInicial) )));

    }

    @Test
    public void AlMoverIzquierdaElSectorDeDibujoTienePintadaLaCantidadDeCasillasCorrespondiente(){

        Personaje personaje = new Personaje();
        Lapiz lapizActivo = new Lapiz();
        lapizActivo.activar();

        personaje.cambiarLapiz(lapizActivo);
        personaje.mover(Posicion.izquierdaDe(personaje.getPosicion()));

        assertEquals(1,personaje.totalDeCasillasPintadas());

    }

    @Test
    public void AlMoverArribaYADerechaElSectorDeDibujoTienePintadaLaCantidadDeCasillasCorrespondiente(){

        Personaje personaje = new Personaje();
        Lapiz lapizActivo = new Lapiz();
        lapizActivo.activar();

        personaje.cambiarLapiz(lapizActivo);
        personaje.mover(Posicion.arribaDe(personaje.getPosicion()));
        personaje.mover(Posicion.derechaDe(personaje.getPosicion()));

        assertEquals(2,personaje.totalDeCasillasPintadas());

    }

    @Test
    public void AlMoverDerechaAbajoYALaIZquierdaElSectorDeDibujoTienePintadaLaCantidadDeCasillasCorrespondiente(){

        Personaje personaje = new Personaje();
        Lapiz lapizActivo = new Lapiz();
        lapizActivo.activar();

        personaje.cambiarLapiz(lapizActivo);
        personaje.mover(Posicion.derechaDe(personaje.getPosicion()));
        personaje.mover(Posicion.abajoDe(personaje.getPosicion()));
        personaje.mover(Posicion.izquierdaDe(personaje.getPosicion()));

        assertEquals(3,personaje.totalDeCasillasPintadas());

    }
}
