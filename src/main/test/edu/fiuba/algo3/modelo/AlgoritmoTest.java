package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.*;
import edu.fiuba.algo3.modelo.bloque.BloqueRepeticion;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueActivarLapiz;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueDesactivarLapiz;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverAbajo;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverDerecha;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.personaje.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoritmoTest {

    @Test
    public void seAgregaUnBloqueCorrectamente()
    {
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(bloqueActivaLapices);

        assertEquals(1 , algoritmo.cantidadBloques());
    }

    @Test
    public void seAgregan3BloquesCorrectamente()
    {
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(new BloqueActivarLapiz());
        algoritmo.agregarBloque(new BloqueDesactivarLapiz());
        algoritmo.agregarBloque(new BloqueMoverDerecha());

        assertEquals(3 , algoritmo.cantidadBloques());
    }

    @Test
    public void seAgreganunBloqueYSeEjecutaCorrectamente()
    {
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        algoritmo.agregarBloque(new BloqueMoverDerecha());

        algoritmo.ejecutarAlgoritmo(personaje);

        assertTrue(Posicion.compararPosiciones(Posicion.derechaDe(posicionInicial), personaje.getPosicion()));
    }

    @Test
    public void seAgreganBloquesYSeEjecutanCorrectamente()
    {
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();
        algoritmo.agregarBloque(new BloqueActivarLapiz());
        algoritmo.agregarBloque(new BloqueDesactivarLapiz());
        algoritmo.agregarBloque(new BloqueMoverDerecha());

        algoritmo.ejecutarAlgoritmo(personaje);

        assertEquals(0 , personaje.totalDeCasillasPintadas());
        assertTrue(Posicion.compararPosiciones(Posicion.derechaDe(posicionInicial), personaje.getPosicion()));
    }

    @Test
    public void seGuardaAlgoritmoPersonalizadoCorrectamente()
    {
        Algoritmo algoritmo = new Algoritmo();
        algoritmo.agregarBloque(new BloqueActivarLapiz());
        algoritmo.agregarBloque(new BloqueDesactivarLapiz());
        algoritmo.agregarBloque(new BloqueMoverDerecha());
        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();


        Bloque personalizado = algoritmo.guardaAlgoritmoPersonalizado("nombre");
        algoritmo.agregarBloque(personalizado);
        algoritmo.ejecutarAlgoritmo(personaje);


        assertEquals(0 , personaje.totalDeCasillasPintadas());
        assertTrue(Posicion.compararPosiciones(Posicion.derechaDe(posicionInicial), personaje.getPosicion()));
    }

    @Test
    public void algoritmoConBloqueDeRepeticion()
    {
        Algoritmo algoritmo = new Algoritmo();
        algoritmo.agregarBloque(new BloqueMoverDerecha());
        algoritmo.agregarBloque(new BloqueMoverAbajo());
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(2,-2);


        BloquePersonalizado personalizado = algoritmo.guardaAlgoritmoPersonalizado("nombre");
        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(2);
        bloqueRepeticion.agregarBloque(personalizado);
        algoritmo.agregarBloque(bloqueRepeticion);
        algoritmo.ejecutarAlgoritmo(personaje);

        assertEquals(0 , personaje.totalDeCasillasPintadas());
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));
    }

}


