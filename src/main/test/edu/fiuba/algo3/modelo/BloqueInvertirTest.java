package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.BloqueInvertir;
import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
import edu.fiuba.algo3.modelo.bloque.BloqueRepeticion;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverAbajo;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverDerecha;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverIzquierda;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.personaje.Posicion;
import edu.fiuba.algo3.modelo.personaje.direccion.DireccionDerecha;
import edu.fiuba.algo3.modelo.personaje.lapiz.EstadoActivado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BloqueInvertirTest {

    @Test
    public void seInvierteUnBloqueDeMoverAArriba()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(0,-1);

        BloqueInvertir bloque = new BloqueInvertir();
        bloque.agregarBloque(new BloqueMoverArriba());
        bloque.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));
    }

    @Test
    public void seActivaElLapizConUnBloqueInvertir()
    {
        Personaje personaje = new Personaje();

        BloqueInvertir bloque = new BloqueInvertir();
        bloque.agregarBloque(new edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueDesactivarLapiz());
        bloque.ejecutar(personaje);

        personaje.moverHacia(new DireccionDerecha());

        assertEquals(1, personaje.totalDeCasillasPintadas());
    }

    @Test
    public void seDesactivaUnLapizActivadoConUnBloqueInvertir()
    {
        Personaje personaje = new Personaje();
        personaje.cambiarEstadoLapiz(new EstadoActivado());

        BloqueInvertir bloque = new BloqueInvertir();
        bloque.agregarBloque(new edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueActivarLapiz());
        bloque.ejecutar(personaje);

        personaje.moverHacia(new DireccionDerecha());

        assertEquals(0, personaje.totalDeCasillasPintadas());
    }

    @Test
    public void seInvierteUnosBloquesYElPersonajeEstaEnLaPosicionCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(1,0);

        BloqueInvertir bloque = new BloqueInvertir();
        bloque.agregarBloque(new BloqueMoverAbajo());
        bloque.agregarBloque(new BloqueMoverIzquierda());
        bloque.agregarBloque(new BloqueMoverArriba());
        bloque.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));
    }

    @Test
    public void seInvierteUnBoquePersonalizadoSeEjecutaYLaPosicionDelPersonajeEsLaCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(-1,1);

        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(new BloqueMoverDerecha());
        algoritmo.agregarBloque(new BloqueMoverAbajo());
        BloquePersonalizado bloquePersonalizado = algoritmo.guardaAlgoritmoPersonalizado("escalera");

        BloqueInvertir bloque = new BloqueInvertir();
        bloque.agregarBloque(bloquePersonalizado);

        bloque.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));
    }

    @Test
    public void seInvierteUnBloqueDeRepeticionSeEjecutaYLaPosicionDelPersonajeEsLaCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(-3,3);

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(3);
        bloqueRepeticion.agregarBloque(new BloqueMoverDerecha());
        bloqueRepeticion.agregarBloque(new BloqueMoverAbajo());

        BloqueInvertir bloque = new BloqueInvertir();
        bloque.agregarBloque(bloqueRepeticion);

        bloque.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));
    }

    @Test
    public void seInvierteUnBloquePersonalizadoQueContieneABloqueRepeticion()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(-2,2);

        Algoritmo algoritmo = new Algoritmo();

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(2);

        bloqueRepeticion.agregarBloque(new BloqueMoverDerecha());
        bloqueRepeticion.agregarBloque(new BloqueMoverAbajo());

        algoritmo.agregarBloque(bloqueRepeticion);

        BloquePersonalizado bloquePersonalizado = algoritmo.guardaAlgoritmoPersonalizado("NuevoBloque");

        BloqueInvertir bloque = new BloqueInvertir();
        bloque.agregarBloque(bloquePersonalizado);

        bloque.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));
    }
}
