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
import javafx.scene.Group;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import static multiframesprogramm.MultiFramesProgramm.checkBoxAnswer;
import static multiframesprogramm.MultiFramesProgramm.stageMain;

/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLFrame4Controller implements Initializable {

    @FXML
    private Label Label4;
    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox3;
    @FXML
    private CheckBox checkBox4;
    @FXML
    private Group maxNumSelected;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        stageMain.setTitle("Еда");
        checkBox_Action(null);
    }    

    @FXML
    private void Next4(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("5"));
    
    }

    @FXML
    private void Back4(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("3"));
    }

    @FXML
    private void checkBox_Action(ActionEvent event) {
                checkBoxAnswer = "";
        if (checkBox1.isSelected()) {
            checkBoxAnswer += " Манная";
        }
        if (checkBox2.isSelected()) {
            checkBoxAnswer += " Гороховая";
        }
        if (checkBox3.isSelected()) {
            checkBoxAnswer += " Рисовая";
        }
        if (checkBox4.isSelected()) {
            checkBoxAnswer += " Гречневая";
        }
        Label4.setText("Выбрано: " + checkBoxAnswer);
    }
    }


