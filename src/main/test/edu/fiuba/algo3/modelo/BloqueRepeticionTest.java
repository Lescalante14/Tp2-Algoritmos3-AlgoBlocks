package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
import edu.fiuba.algo3.modelo.bloque.BloqueRepeticion;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverAbajo;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverDerecha;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverIzquierda;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.personaje.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BloqueRepeticionTest {

    @Test
    public void bloqueDeRepeticionTripleConBloqueMoverAIzquierdaCambiaLaPosicionDelPersonajeCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(-3,0);

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(3);
        bloqueRepeticion.agregarBloque(new BloqueMoverIzquierda());
        bloqueRepeticion.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }

    @Test
    public void bloqueDeRepeticionDobleConVariedadDeBloquesCambiaLaPosicionDelPersonajeCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(2,0);

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(2);
        bloqueRepeticion.agregarBloque(new edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueActivarLapiz());
        bloqueRepeticion.agregarBloque(new edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueDesactivarLapiz());
        bloqueRepeticion.agregarBloque(new BloqueMoverDerecha());
        bloqueRepeticion.ejecutar(personaje);


        assertEquals(0 , personaje.totalDeCasillasPintadas());
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }

    @Test
    public void bloqueDeRepeticionTripleConVariedadDeBloquesCambiaLaPosicionDelPersonajeCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(3,-3);

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(3);
        bloqueRepeticion.agregarBloque(new BloqueMoverDerecha());
        bloqueRepeticion.agregarBloque(new BloqueMoverAbajo());
        bloqueRepeticion.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }

    @Test
    public void seAgregaAunBloqueDeRepeticionUnBloquePersonalizadoYSeEjecutaCorrespondientemente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(2,-2);
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(new BloqueMoverDerecha());
        algoritmo.agregarBloque(new BloqueMoverAbajo());
        BloquePersonalizado bloquePersonalizado = algoritmo.guardaAlgoritmoPersonalizado("escalera");

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(2);
        bloqueRepeticion.agregarBloque(bloquePersonalizado);
        bloqueRepeticion.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }
}
