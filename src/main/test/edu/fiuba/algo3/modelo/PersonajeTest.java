package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    @Test
    public void creacióndelPersonajeConElLápizArriba()
    {

        Personaje personaje = new Personaje();

        assertEquals(personaje.estadoLapiz(), "ESTADO DESACTIVADO");

    }

    @Test
    public void posicionDeUnPersonajeRecienCreadoEsLaCorrespondiente(){

        Personaje personaje = new Personaje();

        Posicion posicionCero = new Posicion(0,0);

        assertTrue(Posicion.compararPosiciones(posicionCero, personaje.getPosicion()));

    }

    @Test
    public void alAplicarBloqueBajarLapizseActivaElLapiz()
    {

        Personaje personaje = new Personaje();

        personaje.ejecutarBloque(new BloqueBajarLapiz());

        assertEquals(personaje.estadoLapiz(), "ESTADO ACTIVADO");

    }

    @Test
    public void alAplicarBloqueSubirLapizseDesactivaElLapiz()
    {

        Personaje personaje = new Personaje();

        personaje.ejecutarBloque(new BloqueBajarLapiz());

        assertEquals(personaje.estadoLapiz(), "ESTADO ACTIVADO");

        personaje.ejecutarBloque(new BloqueSubirLapiz());

        assertEquals(personaje.estadoLapiz(), "ESTADO DESACTIVADO");

    }

    @Test
    public void AlAplicarBloqueMoverDerechaSeMueveALaDerecha()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.ejecutarBloque(new BloqueMoverDerecha());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.derechaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverIzquierdaSeMueveALaIzquierda()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.ejecutarBloque(new BloqueMoverIzquierda());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.izquierdaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverArribaSeMueveAArriba()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.ejecutarBloque(new BloqueMoverArriba());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.arribaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverAbajoSeMueveAAbajo()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.ejecutarBloque(new BloqueMoverAbajo());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.abajoDe(posicionInicial)));

    }

    @Test
    public void AlAplicarBloqueMoverDerechaYAbajoEstaEnLaPosicionCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.ejecutarBloque(new BloqueMoverDerecha());
        personaje.ejecutarBloque(new BloqueMoverAbajo());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion() ,
                   Posicion.abajoDe(Posicion.derechaDe(posicionInicial) )));

    }

    @Test
    public void AlAplicarBloqueMoverArribaEIzquierdaEstaEnLaPosicionCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        personaje.ejecutarBloque(new BloqueMoverArriba());
        personaje.ejecutarBloque(new BloqueMoverIzquierda());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion() ,
                Posicion.izquierdaDe(Posicion.arribaDe(posicionInicial) )));

    }
}
