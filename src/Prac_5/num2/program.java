package Prac_5.num2;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Frame extends JFrame{
    public Frame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(900, 600);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                Shape shape;
                Random rand = new Random();
                Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                int height = (int)Math.round((Math.random()*100));
                int width = (int)Math.round((Math.random()*100));
                switch (new Random().nextInt(3)) {
                    case 0:
                        shape = new oval(color, 100 * i, 100 * j, height, width);
                        break;
                    case 1:
                        shape = new rect(color, 100 * i, 100*j, height, width);
                        break;
                    case 2:
                        shape = new triangular(color, 100 * i, 100*j, height, width);
                        break;
                    default:
                        shape = null;
                        break;
                }
                shape.draw(g);
            }
        }
    }
}

public class program{
    public static void main(String[] args) {
        new Frame().setVisible(true);
    }
}
