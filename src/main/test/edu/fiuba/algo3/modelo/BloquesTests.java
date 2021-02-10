package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.bloque.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BloquesTests {


    @Test
    public void bloqueDeActivarLapizEfectivamenteActivaElLapizDelPersonaje()
    {
        Personaje personaje = new Personaje();
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();

        bloqueActivaLapices.ejecutar(personaje);
        assertTrue(personaje.estadoLapiz().estaActivado());

    }

    @Test
    public void bloqueDeDesactivarLapizEfectivamenteDesactivaElLapizDelPersonajeQueTeniaElLapizActivado()
    {
        Personaje personaje = new Personaje();
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();

        bloqueActivaLapices.ejecutar(personaje);
        assertTrue(personaje.estadoLapiz().estaActivado());

        BloqueDesactivarLapiz bloqueDesactivaLapices = new BloqueDesactivarLapiz();

        bloqueDesactivaLapices.ejecutar(personaje);
        assertFalse(personaje.estadoLapiz().estaActivado());
    }

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

    @Test
    public void repiteUnBloqueCambiaLaPosicionDelPersonajeCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(-3,0);
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(new BloqueMoverIzquierda());
        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(3, algoritmo);
        bloqueRepeticion.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }

    @Test
    public void bloqueDeRepeticionDobleCambiaLaPosicionDelPersonajeCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(2,0);
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(new BloqueActivarLapiz());
        algoritmo.agregarBloque(new BloqueDesactivarLapiz());
        algoritmo.agregarBloque(new BloqueMoverDerecha());
        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(2, algoritmo);
        bloqueRepeticion.ejecutar(personaje);

        assertFalse(personaje.estadoLapiz().estaActivado());
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }

    @Test
    public void bloqueDeRepeticionTripleCambiaLaPosicionDelPersonajeCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(3,-3);
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(new BloqueMoverDerecha());
        algoritmo.agregarBloque(new BloqueMoverAbajo());
        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(3, algoritmo);
        bloqueRepeticion.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }

    @Test
    public void repiteUnBloquePersonalizado()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(2,-2);
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(new BloqueMoverDerecha());
        algoritmo.agregarBloque(new BloqueMoverAbajo());
        BloquePersonalizado bloquePersonalizado = algoritmo.guardaAlgoritmoPersonalizado("escalera");
        algoritmo.agregarBloque(bloquePersonalizado);

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(2, algoritmo);
        bloqueRepeticion.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }

}
