package edu.fiuba.algo3.controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class OpcionAcercaDeEventHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Acerca de...");
        alert.setHeaderText("Ejemplo de mensaje de alerta");
        String mensaje = "75.07 Algoritmos y  programación III.";
        alert.setContentText(mensaje);
        alert.show();
    }
}
