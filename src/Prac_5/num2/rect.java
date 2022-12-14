package Prac_5.num2;
import java.awt.*;

public class rect extends Shape{
    int height;
    int width;
    public rect(Color color, int xpos, int ypos, int height, int width) {
        super(color, xpos, ypos);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillRect(xpos, ypos, width, height);
    }
}