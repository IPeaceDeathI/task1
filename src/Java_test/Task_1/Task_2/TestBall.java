package Java_test.Task_1.Task_2;

public class TestBall {
    public static void main(String[] args) {
        Ball test = new Ball(12.3,32.4);
        test.move(-23.3,-34.3);
        System.out.println(test.getX());
        System.out.println(test.getY());
    }
}