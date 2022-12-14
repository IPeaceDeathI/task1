package Prac_5.num2;
import java.awt.*;

public abstract  class Shape{
    protected Color color;
    protected int xpos;
    protected int ypos;
    public Shape(Color color_, int xpos_, int ypos_){
        xpos=xpos_;
        ypos=ypos_;
        color=color_;
    }
    public abstract void draw(Graphics g);
}
