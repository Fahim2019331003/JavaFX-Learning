package example.secondfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.io.IOException;

public class Controller2 {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label textLabel;



    public void Backto1(ActionEvent event) throws IOException {

        root= FXMLLoader.load(getClass().getResource("scene1.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void changeUsername(String username)
    {
        if(username.equals("Fiona") || username.equals("fiona")){
            textLabel.setText("Kire Foinna Kiaros?"  );
            return;
        }
        if(username.equals("Fariba") || username.equals("fariba")){
            textLabel.setText("Porte boy fariba!!!"  );
            return;
        }
        textLabel.setText("Hello "+ username  );

    }
}
