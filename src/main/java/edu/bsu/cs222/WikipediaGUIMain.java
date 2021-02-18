package edu.bsu.cs222;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class WikipediaGUIMain extends Application {

        private final TextField inputField  = new TextField();
        private final TextField outputField = new TextField();

        @Override
        public void start(Stage primaryStage) {
            Button button = new Button("Get revitions for title");
            button.setOnAction((event)->{
                String title = inputField.getText();
                WikipediaConnection connection = new WikipediaConnection();
                ArrayList<Object> revisions = null;
                try {
                    revisions = (WikipediaParser.parseForRevisions(connection.Connection(title)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                outputField.setText(String.valueOf(revisions));
            });
            VBox box = new VBox();
            box.getChildren().addAll(makeTopBox(), button,  makeBottomBox());
            primaryStage.setScene(new Scene(box));
            primaryStage.show();
        }

        private HBox makeTopBox() {
            HBox topBox = new HBox();
            topBox.getChildren().addAll(new Label("Input: "), inputField);
            return topBox;
        }

        private HBox makeBottomBox() {
            HBox bottomBox = new HBox();
            bottomBox.getChildren().addAll(new Label("Output: "), outputField);
            return bottomBox;
        }

    }