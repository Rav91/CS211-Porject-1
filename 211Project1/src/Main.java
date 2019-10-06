import javafx.application.Application;
import javafx.scene.Group;
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
        MyColor c = MyColor.Black;
        c.setColor(2,4,6);

        MyLine l = new MyLine(0, 0, 100, 100);
        l.setColor(c.getColor());
        System.out.println(l);

        primaryStage.setTitle("Hello World");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        l.draw(gc);

        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
