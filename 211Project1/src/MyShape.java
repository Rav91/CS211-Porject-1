import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyShape {
    private int x;
    private int y;
    private javafx.scene.paint.Color color;

    MyShape(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public String toString(){
        return "MyShape centered at x = " + x + ", y = " + y;
    }

    public void draw(GraphicsContext gc){
    }

    public void setColor(javafx.scene.paint.Color color) {
        this.color = color;
    }
}
