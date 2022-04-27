package example.secondfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    public TextField textField;
    private Stage stage;
    private Scene scene;
    private Parent root;




    public void switchtoScene2(ActionEvent event) throws IOException {


        FXMLLoader loader=new FXMLLoader(getClass().getResource("scene2.fxml"));
        root=loader.load();

        String username=textField.getText();

        Controller2 control=loader.getController();
        control.changeUsername(username);


        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
