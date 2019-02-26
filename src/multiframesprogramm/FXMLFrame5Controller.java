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
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import static multiframesprogramm.MultiFramesProgramm.stageMain;

import static multiframesprogramm.MultiFramesProgramm.stageMain;
import static multiframesprogramm.MultiFramesProgramm.comboBoxAnswer;
import static multiframesprogramm.MultiFramesProgramm.radioButtonAnswer;
import static multiframesprogramm.MultiFramesProgramm.checkBoxAnswer;


/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLFrame5Controller implements Initializable {

    @FXML
    private Button exit_is_system;
    @FXML
    private TextArea textarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        stageMain.setTitle("Результат");
        textarea.setText("1 Ваше образование: ? " + radioButtonAnswer + "\n2 Вы учились в пятом классе: ? " + comboBoxAnswer + "\n3 Ваша любимая каша: ? " + checkBoxAnswer );


    }    

    @FXML
    private void Back5(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("4"));
    }

    @FXML
    private void exit(ActionEvent event) {
        stageMain.close();
    }
    
}
