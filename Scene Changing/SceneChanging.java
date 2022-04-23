package com.example.firstfx;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static final int HEIGHT=700;
    public static final int WIDTH=800;


    @Override
    public void start(Stage stage) throws Exception {

        Group root=new Group();
        Scene scene=new Scene(root,WIDTH,HEIGHT, Color.DARKBLUE);
        Image icon=new Image("caro.png");
        stage.getIcons().add(icon);
        int totaly=HEIGHT/100;
        int totalx=WIDTH/100;

        for(int i=0;i<totalx;i++){
            for(int j=0;j<totaly;j++){
                Rectangle rectangle=new Rectangle();
                rectangle.setX(i+100*i);
                rectangle.setY(j+100*j);
                rectangle.setHeight(100);
                rectangle.setWidth(100);



                if( (i+j)%2==1 ) {
                    rectangle.setFill(Color.DARKCYAN);

                }
                else{
                    rectangle.setFill(Color.DARKBLUE);
                }

                root.getChildren().add(rectangle);
                if(j==0 || j==1){
                    Image image=new Image("white.png");
                    ImageView imageView=new ImageView(image);
                    imageView.setX(i+100*i);
                    imageView.setY(j+100*j);
                    imageView.setFitHeight(100);
                    imageView.setFitWidth(100);
                    imageView.setPreserveRatio(true);

                    root.getChildren().add(imageView);
                }
                if(j==totaly-1 || j==totaly-2){
                    Image image=new Image("black.png");
                    ImageView imageView=new ImageView(image);
                    imageView.setX(i+100*i);
                    imageView.setY(j+100*j);
                    imageView.setFitHeight(100);
                    imageView.setFitWidth(100);
                    imageView.setPreserveRatio(true);

                    root.getChildren().add(imageView);
                }







            }
        }
        int i=3,j=3;

        Text text=new Text();
        text.setText("Start Playing");
        text.setX(i+100*i);
        text.setY(j+100*j+50);
        text.setFont(Font.font("Verdana",30));
        //text.setStroke(Color.RED);
        text.setFill(Color.DARKGRAY);


        Line line=new Line();
        line.setStartX(i+100*i-10);
        line.setStartY(j+100*j+40);
        line.setEndX(i+100*i+200);
        line.setEndY(j+100*j+40);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(3);
        line.setOpacity(0.7);





        root.getChildren().add(text);
        root.getChildren().add(line);

        stage.setScene(scene);
        stage.show();
    }
}

//
//stage -> scene -> root/group.
