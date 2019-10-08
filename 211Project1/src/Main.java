import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
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
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        StackPane pane = new StackPane();
        pane.getChildren().add(canvas);

        MyColor c = MyColor.Black;

        MyShape s = new MyShape(0, 0);
        s.setColor(c.getColor());
        s.draw(gc, canvas);

        c.setColor(200, 200, 200);

        //MyRectangle r = new MyRectangle(canvas.getWidth()/2, canvas.getHeight()/2, 100, 100);
        MyOval r = new MyOval(canvas.getWidth()/2, canvas.getHeight()/2, 100, 100);
        r.setColor(c.getColor());
        c.setColor(50, 50, 50);
        r.setOvalColor(c.getColor());
        System.out.println(r);
        r.draw(gc);

        c.setColor(72, 240, 117);

        MyLine l = new MyLine(0, 0, canvas.getWidth(), canvas.getHeight());
        l.setColor(c.getColor());
        System.out.println(l);
        l.draw(gc);

        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
