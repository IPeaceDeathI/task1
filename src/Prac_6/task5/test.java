package Prac_6.task5;

import java.awt.*;

public class test {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(Color.blue,5,5);
        circle.move(10,5);
        System.out.println(circle);
    }
}
