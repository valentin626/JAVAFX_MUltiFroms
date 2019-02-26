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
import static multiframesprogramm.MultiFramesProgramm.stageMain;

/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLFrame1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          stageMain.setTitle("Анкетирование!");
    }    

    @FXML
    private void exit(ActionEvent event) {
        stageMain.close();
    }

    @FXML
    private void start(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("2"));
    }
    
}
