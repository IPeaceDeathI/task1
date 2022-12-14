package Prac_7.task1_3;

public class test {
    public static void main(String[] args) {
        MovablePoint topleft = new MovablePoint(15,15,2);
        MovablePoint bottomright = new MovablePoint(5,5,2);
        MovableRectangle rect = new MovableRectangle(bottomright,topleft);
        System.out.println(rect);
        if(rect.SpeedTest(topleft,bottomright)){
            rect.moveDown(10);
            System.out.println(rect);
        }
    }
}
