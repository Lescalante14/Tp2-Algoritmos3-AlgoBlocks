package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.direccion.DireccionAbajo;
import edu.fiuba.algo3.modelo.direccion.DireccionArriba;
import edu.fiuba.algo3.modelo.direccion.DireccionDerecha;
import edu.fiuba.algo3.modelo.direccion.DireccionIzquierda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    @Test
    public void creacióndelPersonajeConElLápizDesactivadoNoDibuja()
    {

        Personaje personaje = new Personaje();

        personaje.moverHacia(new DireccionIzquierda());
        assertEquals(0 , personaje.totalDeCasillasPintadas());

    }

    @Test
    public void posicionDeUnPersonajeRecienCreadoEsLaCorrespondiente(){

        Personaje personaje = new Personaje();

        Posicion posicionCero = new Posicion(0,0);

        assertTrue(Posicion.compararPosiciones(posicionCero, personaje.getPosicion()));

    }

    @Test
    public void alAplicarBloqueActivarLapizseActivaElLapizYDibujaAlMover()
    {

        Personaje personaje = new Personaje();

        personaje.cambiarEstadoLapiz(new EstadoActivado());
        personaje.moverHacia(new DireccionDerecha());

        assertEquals(1 , personaje.totalDeCasillasPintadas());

    }


    @Test
    public void AlAplicarMetodoMoverConDireccionDerechaSeMueveALaDerecha()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.moverHacia(new DireccionDerecha());
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.derechaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarMetodoMoverConDireccionIzquierdaSeMueveALaIzquierda()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.moverHacia(new DireccionIzquierda());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.izquierdaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarMetodoMoverConDireccionArribaSeMueveAArriba()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.moverHacia(new DireccionArriba());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.arribaDe(posicionInicial)));

    }

    @Test
    public void AlAplicarMetodoMoverConDireccionAbajoSeMueveALaAbajo()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.moverHacia(new DireccionAbajo());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.abajoDe(posicionInicial)));

    }

    @Test
    public void AlAplicarMetodoMoverConDireccionDerechaYMetodoMoverConDireccionAbajoElPersonajeEstaEnLaPosicionCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.moverHacia(new DireccionDerecha());
        personaje.moverHacia(new DireccionAbajo());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion() ,
                   Posicion.abajoDe(Posicion.derechaDe(posicionInicial) )));

    }

    @Test
    public void AlAplicarMetodoMoverConDireccionArribaYMetodoMoverConDireccionIzquierdaElPersonajeEstaEnLaPosicionCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        personaje.moverHacia(new DireccionArriba());
        personaje.moverHacia(new DireccionIzquierda());

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion() ,
                Posicion.izquierdaDe(Posicion.arribaDe(posicionInicial) )));

    }

    @Test
    public void AlMoverIzquierdaElSectorDeDibujoTienePintadaLaCantidadDeCasillasCorrespondiente(){

        Personaje personaje = new Personaje();

        personaje.cambiarEstadoLapiz(new EstadoActivado());
        personaje.moverHacia(new DireccionIzquierda());

        assertEquals(1,personaje.totalDeCasillasPintadas());

    }

    @Test
    public void AlMoverArribaYADerechaElSectorDeDibujoTienePintadaLaCantidadDeCasillasCorrespondiente(){

        Personaje personaje = new Personaje();

        personaje.cambiarEstadoLapiz(new EstadoActivado());

        personaje.moverHacia(new DireccionArriba());
        personaje.moverHacia(new DireccionDerecha());

        assertEquals(2,personaje.totalDeCasillasPintadas());

    }

    @Test
    public void AlMoverDerechaAbajoYALaIZquierdaElSectorDeDibujoTienePintadaLaCantidadDeCasillasCorrespondiente(){

        Personaje personaje = new Personaje();

        personaje.cambiarEstadoLapiz(new EstadoActivado());

        personaje.moverHacia(new DireccionDerecha());
        personaje.moverHacia(new DireccionAbajo());
        personaje.moverHacia(new DireccionIzquierda());

        assertEquals(3,personaje.totalDeCasillasPintadas());

    }
}
