package edu.fiuba.algo3.modelo;
import edu.fiuba.algo3.modelo.personaje.direccion.DireccionAbajo;
import edu.fiuba.algo3.modelo.personaje.direccion.DireccionArriba;
import edu.fiuba.algo3.modelo.personaje.direccion.DireccionDerecha;
import edu.fiuba.algo3.modelo.personaje.direccion.DireccionIzquierda;
import edu.fiuba.algo3.modelo.personaje.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DireccionTest {

    @Test
    public void metodoPosicionEnDireccionDeAbajoRegresaLaPosicionCorrespondiente(){

        DireccionAbajo direccion = new DireccionAbajo();
        Posicion posicionBase = new Posicion(0,0);
        Posicion posicionNueva = direccion.posicionEnDireccionDe(posicionBase);

        Posicion posicionEsperada = new Posicion(0, -1);

        assertFalse(Posicion.compararPosiciones(posicionBase,posicionNueva));
        assertTrue(Posicion.compararPosiciones(posicionEsperada,posicionNueva));
    }

    @Test
    public void metodoPosicionEnDireccionDeArribaRegresaLaPosicionCorrespondiente(){

        DireccionArriba direccion = new DireccionArriba();
        Posicion posicionBase = new Posicion(0,0);
        Posicion posicionNueva = direccion.posicionEnDireccionDe(posicionBase);

        Posicion posicionEsperada = new Posicion(0, 1);

        assertFalse(Posicion.compararPosiciones(posicionBase,posicionNueva));
        assertTrue(Posicion.compararPosiciones(posicionEsperada,posicionNueva));
    }

    @Test
    public void metodoPosicionEnDireccionDerechaRegresaLaPosicionCorrespondiente(){

        DireccionDerecha direccion = new DireccionDerecha();
        Posicion posicionBase = new Posicion(0,0);
        Posicion posicionNueva = direccion.posicionEnDireccionDe(posicionBase);

        Posicion posicionEsperada = new Posicion(1, 0);

        assertFalse(Posicion.compararPosiciones(posicionBase,posicionNueva));
        assertTrue(Posicion.compararPosiciones(posicionEsperada,posicionNueva));
    }

    @Test
    public void metodoPosicionEnDireccionIzquierdaRegresaLaPosicionCorrespondiente(){

        DireccionIzquierda direccion = new DireccionIzquierda();
        Posicion posicionBase = new Posicion(0,0);
        Posicion posicionNueva = direccion.posicionEnDireccionDe(posicionBase);

        Posicion posicionEsperada = new Posicion(-1, 0);

        assertFalse(Posicion.compararPosiciones(posicionBase,posicionNueva));
        assertTrue(Posicion.compararPosiciones(posicionEsperada,posicionNueva));
    }
}
