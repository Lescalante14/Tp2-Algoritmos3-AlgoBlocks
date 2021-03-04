package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverAbajo;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverDerecha;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverIzquierda;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.personaje.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BloquesDeMovimientoTest {
    @Test
    public void bloqueDeMoverADerechaCambiaLaPosicionDelPersonajeCorrespondientemente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueMoverDerecha bloqueDerecha = new BloqueMoverDerecha();

        bloqueDerecha.ejecutar(personaje);
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.derechaDe(posicionInicial)));

    }


    @Test
    public void bloqueDeMoverAIzquierdaCambiaLaPosicionDelPersonajeCorrespondientemente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueMoverIzquierda bloqueIzquierda = new BloqueMoverIzquierda();

        bloqueIzquierda.ejecutar(personaje);
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.izquierdaDe(posicionInicial)));

    }

    @Test
    public void bloqueDeMoverAArribaCambiaLaPosicionDelPersonajeCorrespondientemente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueMoverArriba bloqueArriba = new BloqueMoverArriba();

        bloqueArriba.ejecutar(personaje);
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.arribaDe(posicionInicial)));

    }

    @Test
    public void bloqueDeMoverAAbajoCambiaLaPosicionDelPersonajeCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueMoverAbajo bloqueAbajo = new BloqueMoverAbajo();

        bloqueAbajo.ejecutar(personaje);
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.abajoDe(posicionInicial)));

    }

}
