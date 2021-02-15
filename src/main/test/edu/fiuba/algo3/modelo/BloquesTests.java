package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.bloque.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BloquesTests {


    @Test
    public void bloqueDeActivarLapizEfectivamenteActivaElLapizDelPersonaje()
    {
        Personaje personaje = new Personaje();
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();

        bloqueActivaLapices.ejecutar(personaje);
        assertEquals(1,personaje.obtenerLapiz().obtenerDibujo());

    }

    @Test
    public void bloqueDeDesactivarLapizEfectivamenteDesactivaElLapizDelPersonajeQueTeniaElLapizActivado()
    {
        Personaje personaje = new Personaje();
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();

        bloqueActivaLapices.ejecutar(personaje);
        assertEquals(1,personaje.obtenerLapiz().obtenerDibujo());

        BloqueDesactivarLapiz bloqueDesactivaLapices = new BloqueDesactivarLapiz();

        bloqueDesactivaLapices.ejecutar(personaje);
        assertNotEquals(1,personaje.obtenerLapiz().obtenerDibujo());
    }

    @Test
    public void bloqueDeMoverADerechaCambiaLaPosicionDelPersonajeCorrespondientemente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueMoverDerecha bloqueDerecha = new BloqueMoverDerecha();

        bloqueDerecha.ejecutar(personaje);
        assertTrue(posicionInicial.compararPosicion(personaje.getPosicion()));

    }

    @Test
    public void bloqueDeMoverADerechaCambiaLaPosicionDelPersonajeCorrespondientementeConLapizActivado()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();
        bloqueActivaLapices.ejecutar(personaje);

        BloqueMoverDerecha bloqueDerecha = new BloqueMoverDerecha();
      	SectorDeDibujo unSector = new SectorDeDibujo();	

		bloqueDerecha.ejecutar(personaje);

		unSector.dibujarMovimiento(personaje);

        assertTrue(posicionInicial.compararPosicion(personaje.getPosicion()));
        assertEquals(1, unSector.estaDibujado(personaje.getPosicion()));

    }

    @Test
    public void bloqueDeMoverAIzquierdaCambiaLaPosicionDelPersonajeCorrespondientemente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueMoverIzquierda bloqueIzquierda = new BloqueMoverIzquierda();

        bloqueIzquierda.ejecutar(personaje);
        assertTrue(posicionInicial.compararPosicion(personaje.getPosicion()));

    }

    @Test
    public void bloqueDeMoverAArribaCambiaLaPosicionDelPersonajeCorrespondientemente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueMoverArriba bloqueArriba = new BloqueMoverArriba();

        bloqueArriba.ejecutar(personaje);
        assertTrue(posicionInicial.compararPosicion(personaje.getPosicion()));

    }

    @Test
    public void bloqueDeMoverAAbajoCambiaLaPosicionDelPersonajeCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionInicial = personaje.getPosicion();

        BloqueMoverAbajo bloqueAbajo = new BloqueMoverAbajo();

        bloqueAbajo.ejecutar(personaje);
        assertTrue(posicionInicial.compararPosicion(personaje.getPosicion()));

    }

    @Test
    public void repiteUnBloqueCambiaLaPosicionDelPersonajeCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(-3,0);

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(3);
        bloqueRepeticion.agregarBloque(new BloqueMoverIzquierda());
        bloqueRepeticion.ejecutar(personaje);

        assertTrue(posicionFinal.compararPosicion(personaje.getPosicion()));

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

        assertNotEquals(1,personaje.obtenerLapiz().obtenerDibujo());
        assertTrue(posicionFinal.compararPosicion(personaje.getPosicion()));

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

        assertTrue(posicionFinal.compararPosicion(personaje.getPosicion()));

    }

   @Test
    public void repiteUnBloquePersonalizado()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(2,-2);
        Algoritmo algoritmo = new Algoritmo();

        algoritmo.agregarBloque(new BloqueMoverDerecha());
        algoritmo.agregarBloque(new BloqueMoverAbajo());
        BloquePersonalizado bloquePersonalizado = algoritmo.guardaPersonalizado("escalera");

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(2);
        bloqueRepeticion.agregarBloque(bloquePersonalizado);
        bloqueRepeticion.ejecutar(personaje);

        assertTrue(posicionFinal.compararPosicion(personaje.getPosicion()));

    }

    @Test
    public void bloqueInvertirDeMoverAAbajoCambiaLaPosicionDelPersonajeCorrespondiente()
    {

        Personaje personaje = new Personaje();
        Posicion posicionFinal = personaje.getPosicion();
		posicionFinal.aArriba();

		BloqueMoverAbajo bloqueAbajo = new BloqueMoverAbajo();
		BloqueInvertir bloqueInvertir = new BloqueInvertir();
        
		bloqueInvertir.agregarBloque(bloqueAbajo);

		bloqueInvertir.invertir();
        bloqueInvertir.ejecutar(personaje);

        assertTrue(posicionFinal.compararPosicion(personaje.getPosicion()));

    }

	@Test
    public void bloqueInvertirDeRepiteUnBloqueCambiaLaPosicionDelPersonajeCorrespondiente()
    {
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(-3,0);
			
		BloqueInvertir bloqueInvertir = new BloqueInvertir();

        BloqueRepeticion bloqueRepeticion = new BloqueRepeticion(3);
        bloqueRepeticion.agregarBloque(new BloqueMoverIzquierda());
        
		bloqueInvertir.agregarBloque(bloqueRepeticion);
		
		bloqueInvertir.invertir();
		bloqueInvertir.ejecutar(personaje);

        assertTrue(posicionFinal.compararPosicion(personaje.getPosicion()));

    }

}
