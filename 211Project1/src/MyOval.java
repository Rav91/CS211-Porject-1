import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyOval extends MyRectangle {
    MyOval(double x, double y, double height, double width) {
        super(x, y, height, width);
    }
    private javafx.scene.paint.Color ovalColor;

    public Color getOvalColor() {
        return ovalColor;
    }

    public void setOvalColor(Color ovalColor) {
        this.ovalColor = ovalColor;
    }

    public String toString(){
        return "MyOval axes: " + getHeight() + ", " + getWidth()
                + "\nMyOval perimeter: " + 2*Math.PI*Math.sqrt(0.5*(getWidth()*getHeight()+getHeight()*getWidth()))
                + "\nMyOval area: " + Math.PI*getWidth()*getHeight();   
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(getColor());
        super.draw(gc);
        gc.setFill(getOvalColor());
        gc.fillOval(getX()-getWidth()/2, getY()-getHeight()/2, getWidth(), getHeight());
    }
}
