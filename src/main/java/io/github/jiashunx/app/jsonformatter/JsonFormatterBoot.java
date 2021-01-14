package io.github.jiashunx.app.jsonformatter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author jiashunx
 */
public class JsonFormatterBoot extends Application {

    public static void main(String[] args) {
        launch(JsonFormatterBoot.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/app.fxml"));
        primaryStage.setTitle("JSON格式化工具");
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setWidth(1040);
        primaryStage.setHeight(706);
//        primaryStage.setResizable(false);

    }

}
