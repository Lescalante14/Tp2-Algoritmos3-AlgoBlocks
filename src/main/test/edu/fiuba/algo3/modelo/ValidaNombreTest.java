package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.excepciones.NombreVacioError;
import edu.fiuba.algo3.modelo.bloque.bloquesDeMovimiento.BloqueMoverAbajo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidaNombreTest {

    @Test
    public void alCrearAlgoritmoPersonalizadoConNombreNullLanzaError()
    {
        Algoritmo algoritmo = new Algoritmo();
        algoritmo.agregarBloque(new BloqueMoverAbajo());


        assertThrows(NombreVacioError.class, ()->{
            algoritmo.guardaAlgoritmoPersonalizado(null);
        });
    }

    @Test
    public void alCrearAlgoritmoPersonalizadoConNombreInvalidoLanzaError()
    {
        Algoritmo algoritmo = new Algoritmo();
        algoritmo.agregarBloque(new BloqueMoverAbajo());


        assertThrows(NombreVacioError.class, ()->{
            algoritmo.guardaAlgoritmoPersonalizado("   ");
        });
    }


}
