package com.ck;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

// JavaFX Application
public class FXApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("ScanDocDiff...");

//        stage.getIcons().add(new Image(String.valueOf(this.getClass().getClassLoader().getResource("logo.png"))));

        //抓螢幕的尺寸：
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        //set Stage boundaries to visible bounds of the main screen
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());

        Scene scene = new Scene(new Group(), stage.getWidth(), stage.getHeight());
//        scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
        HBox root = new HBox(10);//20

        scene.setRoot(root);

        root.getChildren().add(new Text("Hello World"));

        stage.setScene(scene);
        stage.show();
    }

}