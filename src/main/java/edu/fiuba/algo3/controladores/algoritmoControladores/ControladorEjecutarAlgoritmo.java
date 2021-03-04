package edu.fiuba.algo3.controladores.algoritmoControladores;

import edu.fiuba.algo3.excepciones.AlgoritmoVacioError;
import edu.fiuba.algo3.excepciones.BloquesDeSecuenciaAnidadosDeError;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Algoritmo;
import edu.fiuba.algo3.modelo.bloque.Bloque;
import edu.fiuba.algo3.modelo.bloque.BloquesDeSecuencia;
import edu.fiuba.algo3.vistas.VistaAlgoritmo;
import edu.fiuba.algo3.vistas.VistaSectorDibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;


public class ControladorEjecutarAlgoritmo implements EventHandler<ActionEvent> {

    private final VistaSectorDibujo vistaSectorDibujo;
    private final Personaje personaje;
    private final Algoritmo algortimo;
    private BloquesDeSecuencia bloqueTemporal;
    private final VistaAlgoritmo vistaAlgoritmo;
    private Image imagen;
    private boolean hayBloqueTemporal;

    public ControladorEjecutarAlgoritmo(Personaje personaje, VistaSectorDibujo vistaSectorDibujo, Algoritmo algoritmo, VistaAlgoritmo vistaAlgoritmo){
        this.personaje = personaje;
        this.vistaSectorDibujo = vistaSectorDibujo;
        this.algortimo = algoritmo;
        this.vistaAlgoritmo = vistaAlgoritmo;
        this.imagen = new Image("file:" + System.getProperty("user.dir") + "/src/main/java/edu/fiuba/algo3/resources/imagenes/personaje_lapiz_desactivado.png", 60,60,false, true);
        this.hayBloqueTemporal = false;
    }

    public void handle(ActionEvent actionEvent) {
        try{
            algortimo.ejecutarAlgoritmo(personaje);
        }
        catch(AlgoritmoVacioError algoritmoVacioError) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Algoritmo vacío, agrega al menos un bloque para ejecutar");

            alert.showAndWait();
        }
        vistaSectorDibujo.update(this.imagen);

    }

    public void setImagen(Image imagen){
        this.imagen = imagen;
    }

    public void agregarBloque(Bloque bloque) {

        if(hayBloqueTemporal){
            bloqueTemporal.agregarBloque(bloque);
            vistaAlgoritmo.desactivarBotonBreak(false);
        }else {
            algortimo.agregarBloque(bloque);
            vistaAlgoritmo.desactivarBotonGuardado(false);
        }

    }

    public void activarBloqueTemporal(BloquesDeSecuencia bloqueTemporal){
        
		if( this.hayBloqueTemporal ){
		   throw new BloquesDeSecuenciaAnidadosDeError();
        }
		this.hayBloqueTemporal = true;
        this.bloqueTemporal= bloqueTemporal;
        vistaAlgoritmo.mostrarBotonBreak();
        vistaAlgoritmo.desactivarBotonEjecutar(true);

    }
    public void updateVistaAlgortimo(String nombreBloque) {
       vistaAlgoritmo.update(nombreBloque);
    }

    public void desactivarBloqueTemporal() {
        this.hayBloqueTemporal = false;
        agregarBloque((Bloque) this.bloqueTemporal);
        vistaAlgoritmo.removerBotonBreak();
        vistaAlgoritmo.desactivarBotonEjecutar(false);
    }

    public void eliminarBloqueTemporal() {
        hayBloqueTemporal = false;
    }
}
