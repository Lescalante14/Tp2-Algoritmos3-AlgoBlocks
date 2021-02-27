package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueActivarLapiz;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueDesactivarLapiz;
import edu.fiuba.algo3.modelo.direccion.DireccionDerecha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloquesDeActivacionTest {

    @Test
    public void bloqueDeActivarLapizActivaElLapizDelPersonaje()
    {
        Personaje personaje = new Personaje();
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();

        bloqueActivaLapices.ejecutar(personaje);
        personaje.moverHacia(new DireccionDerecha());

        assertEquals(1 , personaje.totalDeCasillasPintadas());

    }

    @Test
    public void bloqueDeDesactivarLapizDesactivaElLapizDelPersonajeQueTeniaElLapizActivado()
    {
        Personaje personaje = new Personaje();
        BloqueActivarLapiz bloqueActivaLapices = new BloqueActivarLapiz();

        bloqueActivaLapices.ejecutar(personaje);
        personaje.moverHacia(new DireccionDerecha());

        assertEquals(1 , personaje.totalDeCasillasPintadas());

        BloqueDesactivarLapiz bloqueDesactivaLapices = new BloqueDesactivarLapiz();

        bloqueDesactivaLapices.ejecutar(personaje);
        personaje.moverHacia(new DireccionDerecha());

        assertEquals(1 , personaje.totalDeCasillasPintadas());
    }
}
