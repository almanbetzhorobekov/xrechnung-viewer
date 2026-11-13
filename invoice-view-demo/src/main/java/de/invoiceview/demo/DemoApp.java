package de.invoiceview.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/** Platzhalter: prüft nur, dass JavaFX startet. */
public class DemoApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new Label("XRechnung Viewer – Demo"), 400, 200));
        stage.setTitle("XRechnung Viewer");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
