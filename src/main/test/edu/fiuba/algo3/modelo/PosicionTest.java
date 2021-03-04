package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.personaje.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PosicionTest {


    @Test
    public void comparaPosicionesLanzaTrueAlCompararPosicionesIguales() {

        Posicion posicion1 = new Posicion(1,1);
        Posicion posicion2 = new Posicion(1,1);
        assertTrue(Posicion.compararPosiciones(posicion1,posicion2));
    }

    @Test
    public void comparaPosicionesLanzaFalseAlCompararPosicionesDistintas() {

        Posicion posicion1 = new Posicion(0,1);
        Posicion posicion2 = new Posicion(1,3);
        assertFalse(Posicion.compararPosiciones(posicion1,posicion2));

    }

    @Test
    public void metodoDerechaDeUnaPosicionDevuelveLaPosicionCorrespondiente() {

        Posicion posicionEsperada = new Posicion(1, 0);
        Posicion posicionBase = new Posicion(0,0);
        Posicion posicionNueva = Posicion.derechaDe(posicionBase);
        assertFalse(Posicion.compararPosiciones(posicionBase,posicionNueva));
        assertTrue(Posicion.compararPosiciones(posicionEsperada,posicionNueva));
    }

    @Test
    public void metodoIzquierdaDeUnaPosicionDevuelveLaPosicionCorrespondiente() {

        Posicion posicionEsperada = new Posicion(-1, 0);
        Posicion posicionBase = new Posicion(0,0);
        Posicion posicionNueva = Posicion.izquierdaDe(posicionBase);
        assertFalse(Posicion.compararPosiciones(posicionBase,posicionNueva));
        assertTrue(Posicion.compararPosiciones(posicionEsperada,posicionNueva));
    }

    @Test
    public void metodoArribaDeUnaPosicionDevuelveLaPosicionCorrespondiente() {

        Posicion posicionEsperada = new Posicion(0, 1);
        Posicion posicionBase = new Posicion(0,0);
        Posicion posicionNueva = Posicion.arribaDe(posicionBase);
        assertFalse(Posicion.compararPosiciones(posicionBase,posicionNueva));
        assertTrue(Posicion.compararPosiciones(posicionEsperada,posicionNueva));
    }

    @Test
    public void metodoAbajoDeUnaPosicionDevuelveLaPosicionCorrespondiente() {

        Posicion posicionEsperada = new Posicion(0, -1);
        Posicion posicionBase = new Posicion(0,0);
        Posicion posicionNueva = Posicion.abajoDe(posicionBase);
        assertFalse(Posicion.compararPosiciones(posicionBase,posicionNueva));
        assertTrue(Posicion.compararPosiciones(posicionEsperada,posicionNueva));
    }
}
