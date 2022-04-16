package me.supeer.webhook.deleter.gui;
/*
 *
 * @Author supeer
 *
 *
 * - 2022 -
 *
 */


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import jdk.nashorn.internal.scripts.JO;
import me.supeer.webhook.deleter.Deleter;

import java.net.URL;
import java.util.ResourceBundle;

public class MController implements Initializable {


    @FXML
    public TextField url;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void del(ActionEvent actionEvent){
        if(url.getText() != null){
            String u = url.getText();
            if(!u.isEmpty()){
                if(u.contains("webhook")){
                    Deleter.delete(u);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Done");
                    alert.setHeaderText("webhook was deleted");
                    alert.show();
                    return;
                }
            }
        }
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Unacceptable url");
        alert.setHeaderText("url is wrong");
        alert.show();
    }

}
