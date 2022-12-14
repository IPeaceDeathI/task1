package Prac_5.num2;
import java.awt.*;

public class oval extends Shape{
    int height;
    int width;

    public oval(Color color, int xpos, int ypos, int height, int width) {
        super(color, xpos, ypos);
        this.width=width;
        this.height=height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(xpos, ypos, height, width);
    }
}
