package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    enum MyColor{
        Black(Color.rgb(0, 0, 0));

        private Color color;

        MyColor(Color rgb) {
            this.color = rgb;
        }

        public Color getColor(){
            return this.color;
        }
        public void setColor(int r, int b, int g){ this.color = Color.rgb(r, g, b); }
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 275);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
