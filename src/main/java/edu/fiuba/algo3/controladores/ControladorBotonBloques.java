package edu.fiuba.algo3.controladores;

import edu.fiuba.algo3.modelo.bloque.Bloque;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Optional;

public class ControladorBotonBloques implements EventHandler<ActionEvent>{

    private EventHandler<ActionEvent> controladorAlgoritmo;
    private static HashMap<String, Bloque> infoBloques;

    public ControladorBotonBloques(EventHandler<ActionEvent> controladorAlgoritmo){
        this.controladorAlgoritmo = controladorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Agregar bloque");
        alert.setHeaderText("¿Desea agregar el bloque?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            controladorAlgoritmo.agregarBloque();
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }
}
