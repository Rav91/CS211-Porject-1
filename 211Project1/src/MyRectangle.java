import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

public class MyRectangle extends MyShape {
    MyRectangle(double x, double y) {
        super(x, y);
    }
    double height;
    double width;
    MyRectangle(double x, double y, double height, double width){
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public String toString(){
        return "MyRectangle height: " + height
                + "\nMyRectangle width: " + width
                + "\nMyRectangle perimeter: " + 2*(height+width)
                + "\nMyRectangle area: " + height*width;
    }

    public void draw(GraphicsContext gc){
        gc.setFill(getColor());
        gc.fillRect(getX()-width/2, getY()-height/2, width, height);
    }
}
