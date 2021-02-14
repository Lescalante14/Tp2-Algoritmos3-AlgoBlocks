package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

/*    @Test
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


        personaje.activarLapiz();
        assertTrue(personaje.estadoLapiz().estaActivado());

    }



    @Test
    public void alAplicarBloqueSubirLapizseDesactivaElLapiz()
    {

        Personaje personaje = new Personaje();

        personaje.activarLapiz();

        assertTrue(personaje.estadoLapiz().estaActivado());

        personaje.desactivarLapiz();

        assertFalse(personaje.estadoLapiz().estaActivado());

    }

    /*@Test
    public void AlAplicarBloqueMoverDerechaSeMueveALaDerecha()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.moverADerecha();
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.derechaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverIzquierdaSeMueveALaIzquierda()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.moverAIzquierda();

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.izquierdaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverArribaSeMueveAArriba()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.moverArriba();

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.arribaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverAbajoSeMueveAAbajo()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.moverAbajo();

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.abajoDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverDerechaYAbajoEstaEnLaPosicionCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.moverADerecha();
        personaje.moverAbajo();

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion() ,
                   Posicion.abajoDe(Posicion.derechaDe(posicionInicial) )));

    }

    @Test
    public void AlAplicarBloqueMoverArribaEIzquierdaEstaEnLaPosicionCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.moverArriba();
        personaje.moverAIzquierda();

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion() ,
                Posicion.izquierdaDe(Posicion.arribaDe(posicionInicial) )));

    }

    @Test
    public void AlMoverIzquierdaElSectorDeDibujoTienePintadaLaCantidadDeCasillasCorrespondiente(){

        Personaje personaje = new Personaje();
        personaje.activarLapiz();
        personaje.moverAIzquierda();

        assertEquals(1,personaje.totalDeCasillasPintadas());

    }

    @Test
    public void AlMoverArribaYADerechaElSectorDeDibujoTienePintadaLaCantidadDeCasillasCorrespondiente(){

        Personaje personaje = new Personaje();
        personaje.activarLapiz();
        personaje.moverArriba();
        personaje.moverADerecha();

        assertEquals(2,personaje.totalDeCasillasPintadas());

    }

    @Test
    public void AlMoverDerechaAbajoYALaIZquierdaElSectorDeDibujoTienePintadaLaCantidadDeCasillasCorrespondiente(){

        Personaje personaje = new Personaje();
        personaje.activarLapiz();
        personaje.moverADerecha();
        personaje.moverAbajo();
        personaje.moverAIzquierda();

        assertEquals(3,personaje.totalDeCasillasPintadas());

    }*/
}
