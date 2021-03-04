package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.*;
import edu.fiuba.algo3.modelo.bloque.BloqueInvertir;
import edu.fiuba.algo3.modelo.bloque.BloqueRepeticion;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueActivarLapiz;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueDesactivarLapiz;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverAbajo;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverDerecha;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverIzquierda;
import edu.fiuba.algo3.modelo.personaje.direccion.DireccionDerecha;
import edu.fiuba.algo3.modelo.personaje.lapiz.EstadoActivado;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.personaje.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BloquesTests {


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
        bloqueRepeticion.agregarBloque(new BloqueActivarLapiz());
        bloqueRepeticion.agregarBloque(new BloqueDesactivarLapiz());
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

        personaje.moverHacia(new DireccionDerecha());

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
