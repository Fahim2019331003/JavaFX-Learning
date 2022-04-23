package example.secondfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.util.EventListener;

public class HelloController {

    @FXML
    private Circle circle;



    @FXML
    private Line line;

    private double x;
    private double y;

    private double lineY;

    public void rotate(ActionEvent e)
    {
        line.setRotate(lineY+=10);

    }

    public void up(ActionEvent e)
    {
        System.out.println(y);
        circle.setCenterY(y-=10);
    }
    public void down(ActionEvent e)
    {
        System.out.println(y);
        circle.setCenterY((y+=10) );
    }
    public void right(ActionEvent e)
    {
        System.out.println(x);
        circle.setCenterX( (x+=10) );
    }
    public void left(ActionEvent e)
    {
        System.out.println(x);
        circle.setCenterX(x-=10);
    }
}