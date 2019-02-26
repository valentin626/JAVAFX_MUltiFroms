/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import static multiframesprogramm.MultiFramesProgramm.comboBoxAnswer;
import static multiframesprogramm.MultiFramesProgramm.stageMain;

/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLFrame3Controller implements Initializable {

private final ObservableList<String> arr = FXCollections.observableArrayList(
            "Отлично",
            "Хорошо",
            "Удовлетворительно",
            "Неудовлетворительно");

    @FXML
    private ComboBox<String> combobox;
    private Label comboBoxLabel;
    @FXML
    private Label Label3;


     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        stageMain.setTitle("Отрочество");
        combobox.setItems(arr);
       combobox.getSelectionModel().selectFirst();
        combobox_action(null);
    }    

    @FXML
    private void combobox_action(ActionEvent event) {
       String line = combobox.getSelectionModel().getSelectedItem();
       comboBoxAnswer = line;
       Label3.setText("Выбрано: " + line);
    }

    @FXML
    private void Back3(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("2"));
    }

    @FXML
    private void Next3(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("4"));
    }
    
}
