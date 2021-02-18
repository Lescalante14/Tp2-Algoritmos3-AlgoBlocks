package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BloquesTests {


    @Test
    public void bloqueDeActivarLapizActivaElLapizDelPersonaje()
    {
        Personaje personaje = new Personaje();
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();

        bloqueActivaLapices.ejecutar(personaje);
        personaje.mover(Posicion.abajoDe(personaje.getPosicion()));

        assertEquals(1 , personaje.totalDeCasillasPintadas());

    }

    @Test
    public void bloqueDeDesactivarLapizDesactivaElLapizDelPersonajeQueTeniaElLapizActivado()
    {
        Personaje personaje = new Personaje();
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();

        bloqueActivaLapices.ejecutar(personaje);
        personaje.mover(Posicion.abajoDe(personaje.getPosicion()));

        assertEquals(1 , personaje.totalDeCasillasPintadas());

        BloqueDesactivarLapiz bloqueDesactivaLapices = new BloqueDesactivarLapiz();

        bloqueDesactivaLapices.ejecutar(personaje);
        personaje.mover(Posicion.abajoDe(personaje.getPosicion()));

        assertEquals(1 , personaje.totalDeCasillasPintadas());
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
    public void bloqueDeMoverADerechaCambiaLaPosicionDelPersonajeCorrespondientementeConLapizActivado()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();
        bloqueActivaLapices.ejecutar(personaje);

        BloqueMoverDerecha bloqueDerecha = new BloqueMoverDerecha();
        bloqueDerecha.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), Posicion.derechaDe(posicionInicial)));
        assertEquals(1, personaje.totalDeCasillasPintadas());

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

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(3);
        bloqueRepeticion.agregarBloque(new BloqueMoverIzquierda());
        bloqueRepeticion.ejecutar(personaje);

        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }

    @Test
    public void bloqueDeRepeticionDobleCambiaLaPosicionDelPersonajeCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(2,0);

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(2);
        bloqueRepeticion.agregarBloque(new BloqueActivarLapiz());
        bloqueRepeticion.agregarBloque(new BloqueDesactivarLapiz());
        bloqueRepeticion.agregarBloque(new BloqueMoverDerecha());
        bloqueRepeticion.ejecutar(personaje);


        assertEquals(0 , personaje.totalDeCasillasPintadas());
        assertTrue(Posicion.compararPosiciones(personaje.getPosicion(), posicionFinal));

    }

    @Test
    public void bloqueDeRepeticionTripleCambiaLaPosicionDelPersonajeCorrespondiente()
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
    public void repiteUnBloquePersonalizado()
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
        bloque.agregarBloque(new BloqueDesactivarLapiz());
        bloque.ejecutar(personaje);

        personaje.mover(Posicion.derechaDe(personaje.getPosicion()));

        assertEquals(1, personaje.totalDeCasillasPintadas());
    }

    @Test
    public void seDesactivaUnLapizActivadoConUnBloqueInvertir()
    {
        Personaje personaje = new Personaje();
        personaje.cambiarEstadoLapiz(new EstadoActivado());

        BloqueInvertir bloque = new BloqueInvertir();
        bloque.agregarBloque(new BloqueActivarLapiz());
        bloque.ejecutar(personaje);

        personaje.mover(Posicion.derechaDe(personaje.getPosicion()));

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
