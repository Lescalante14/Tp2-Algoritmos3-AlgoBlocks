package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
import edu.fiuba.algo3.modelo.bloque.bloqueDeActivacion.BloqueActivarLapiz;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverArriba;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverDerecha;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import edu.fiuba.algo3.modelo.personaje.Posicion;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BloquePerzonalizadoTest {

    @Test
    public void seGuardaBloquePersonalizadoCorrectamente()
    {
        List<Bloque> secuenciaBloques = new ArrayList<>();
        secuenciaBloques.add(new BloqueActivarLapiz());
        secuenciaBloques.add(new BloqueMoverDerecha());
        Personaje personaje = new Personaje();

        BloquePersonalizado bloquePerzonalizado = new BloquePersonalizado("nombre", secuenciaBloques);
        bloquePerzonalizado.ejecutar(personaje);

        assertEquals(1 , personaje.totalDeCasillasPintadas());
    }

    @Test
    public void seMueveAlPersonajeConUnBloquePersonalizadoCorrectamente()
    {
        List<Bloque> secuenciaBloques = new ArrayList<>();
        secuenciaBloques.add(new BloqueMoverArriba());
        secuenciaBloques.add(new BloqueMoverDerecha());
        secuenciaBloques.add(new BloqueMoverArriba());
        secuenciaBloques.add(new BloqueMoverDerecha());
        Personaje personaje = new Personaje();
        Posicion posicionFinal = new Posicion(2,2);

        BloquePersonalizado bloquePerzonalizado = new BloquePersonalizado("nombre", secuenciaBloques);
        bloquePerzonalizado.ejecutar(personaje);


        assertTrue(Posicion.compararPosiciones(posicionFinal, personaje.getPosicion()));
    }
}
