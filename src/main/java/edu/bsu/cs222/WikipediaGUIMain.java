package edu.bsu.cs222;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class WikipediaGUIMain extends Application {

    private final TextField inputField  = new TextField();
    private final TextArea outputArea = new TextArea();

    @Override
    public void start(Stage primaryStage)  {
        Button button = new Button("Get revisions for title");
        button.setOnAction((event)->{
            String articleTitle = inputField.getText();

            Revisions Format = new Revisions();
            String FormattedRevisions = null;
            if (articleTitle.equals("")) {
                System.err.println("Article name required");
                FormattedRevisions = "Please enter an article name";

            }
            try {
                FormattedRevisions = Format.FormatRevisions(articleTitle, true);
            } catch (IOException exception) {
                exception.printStackTrace();
            }

            outputArea.setText(FormattedRevisions);
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
        outputArea.setDisable(true);
        outputArea.setPrefWidth(400);
        outputArea.setPrefHeight(600);
        bottomBox.getChildren().addAll(new Label("Output: "), outputArea);
        return bottomBox;
    }
}