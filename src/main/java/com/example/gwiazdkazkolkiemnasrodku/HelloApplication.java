package com.example.gwiazdkazkolkiemnasrodku;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Path path = new Path();

        MoveTo moveTo = new MoveTo(108, 71);
        LineTo line1 = new LineTo(321, 161);
        LineTo line2 = new LineTo(126,232);
        LineTo line3 = new LineTo(232,52);
        LineTo line4 = new LineTo(269, 250);
        LineTo line5 = new LineTo(108, 71);

        Circle circle = new Circle(220, 150, 25);

        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);

        Group root = new Group(path);
        root.getChildren().add(circle);
        Scene scene = new Scene(root, 500, 300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}