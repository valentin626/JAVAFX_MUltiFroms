/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import static multiframesprogramm.MultiFramesProgramm.radioButtonAnswer;
import static multiframesprogramm.MultiFramesProgramm.stageMain;

/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLFrame2Controller implements Initializable {

    @FXML
    private RadioButton radioButton1;
    @FXML
    private ToggleGroup Group1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private RadioButton radioButton3;
    @FXML
    private RadioButton radioButton4;
    @FXML
    private Label radioButtonLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        stageMain.setTitle("Образование");
        Group1.selectToggle(radioButton1);
        radioButton_Action(null);
    }    

    @FXML
    private void Back2(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("1"));
    }

    @FXML
    private void Next2(ActionEvent event) throws IOException {
         stageMain.setScene(new SceneBuilder().getScene("3"));
    }

    @FXML
    private void radioButton_Action(ActionEvent event) {
               RadioButton selectedRadioButton = (RadioButton) Group1.getSelectedToggle();
        String toogleGroupId = selectedRadioButton.getId();
        radioButtonAnswer = "";
        if (toogleGroupId.equals("radioButton1")) {
            radioButtonAnswer = "Неполное среднее";
        }
        if (toogleGroupId.equals("radioButton2")) {
            radioButtonAnswer = "Среднее";
        }
        if (toogleGroupId.equals("radioButton3")) {
            radioButtonAnswer = "Среднее - специальное";
        }
        if (toogleGroupId.equals("radioButton4")) {
            radioButtonAnswer = "Высшее";
        }
        radioButtonLabel.setText("Выбрано: " + radioButtonAnswer);
    }
    
}
