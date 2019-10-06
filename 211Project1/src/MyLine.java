import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class MyLine extends MyShape {
    MyLine(int x, int y, Color c) {
        super(x, y);
    }
    private int x2;
    private int y2;
    MyLine(int x, int y, int x2, int y2){
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public String toString(){
        return "MyLine length: " + Math.sqrt(Math.pow((getX()-x2), 2) + Math.pow((getY()-y2), 2))
                + "\n" + "Angle with respect to x-axis: " + Math.atan((y2-getY())/(x2-getX()));
    }

    public void draw(GraphicsContext gc){
        gc.setStroke(getColor());
        gc.strokeLine(getX(), getX(), x2, y2);
    }
}
