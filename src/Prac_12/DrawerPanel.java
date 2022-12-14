package Prac_12;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class DrawerPanel extends JPanel {
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    public boolean animating = false;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setDoubleBuffered(true);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public void addRectangle() {
        Rect rect = new Rect();
        rect.randomFill();
        shapes.add(rect);
    }

    public void addCircle() {
        Circle circle = new Circle();
        circle.randomFill();
        shapes.add(circle);
    }

    public void nextState() {
        for (Shape shape : shapes) {
            shape.y += shape.speed;
            if (shape.y <= 0 || shape.y >= 180) {
                shape.speed = -shape.speed;
            }
        }
        repaint();
    }
}

class Shape {
    public int x, y;
    public int width, height;
    public int speed = +2;
    public Color color = Color.RED;

    public int randint(int min, int max) {
        Random rnd = new Random();
        return min + rnd.nextInt(max - min);
    }

    public Color randomColor() {
        Color[] colors = new Color[]{new Color(0, 255, 0), new Color(0, 255, 255), new Color(0, 169, 255),
                new Color(106, 0, 255), new Color(200, 50, 255), new Color(255, 60, 200), new Color(255, 80, 80)};
        return colors[randint(0, colors.length)];
    }

    public void randomFill() {
        this.x = randint(20, 380);
        this.y = randint(20, 180);
        this.width = randint(10, 40);
        this.height = randint(10, 40);
        this.color = randomColor();
    }

    public void draw(Graphics g) {
    }
}


class Rect extends Shape {
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}


class Circle extends Shape {
    @Override
    public void randomFill() {
        super.randomFill();
        this.width = this.height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}