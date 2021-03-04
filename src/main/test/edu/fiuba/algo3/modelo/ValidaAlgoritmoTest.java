package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.excepciones.AlgoritmoVacioError;
import edu.fiuba.algo3.modelo.personaje.Personaje;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidaAlgoritmoTest {

    @Test
    public void alEjecutaAlgoritmoVacioLanzaExcepcion()
    {
        Algoritmo algoritmo = new Algoritmo();
        Personaje personaje = new Personaje();

        assertThrows(AlgoritmoVacioError.class, ()->{
            algoritmo.ejecutarAlgoritmo(personaje);
        });
    }

    @Test
    public void alCrearAlgoritmoPersonalizadoDeUnAlgoritmoVacioSeLanzaError()
    {
        Algoritmo algoritmo = new Algoritmo();

        assertThrows(AlgoritmoVacioError.class, ()->{
            algoritmo.guardaAlgoritmoPersonalizado("Algoritmo vacio");
        });
    }
}
