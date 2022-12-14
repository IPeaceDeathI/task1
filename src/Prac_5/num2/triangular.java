package Prac_5.num2;
import java.awt.*;


public class triangular extends Shape{
    public triangular(Color color, int xpos, int ypos, int height, int width) {
        super(color, xpos, ypos);
    }

    @Override
    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillPolygon(new int[] {xpos, xpos+10, xpos+20}, new int[] {ypos+20,ypos,ypos+20}, 3);
    }
}