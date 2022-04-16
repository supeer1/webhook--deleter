package me.supeer.webhook.deleter.gui;
/*
 *
 * @Author supeer
 *
 *
 * - 2022 -
 *
 */


import me.supeer.webhook.deleter.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void l(String ...ar){
        launch(ar);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Webhook Deleter by supeer");

        Parent root = FXMLLoader.load(Main.class.getResource("/main.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.setFullScreen(false);
        stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);

        stage.setOpacity(0.85);


        stage.show();
    }
}
