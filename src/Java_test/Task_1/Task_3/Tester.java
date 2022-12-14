package Java_test.Task_1.Task_3;

import java.util.Scanner;

public class Tester {
    private int n;
    public static Circle[] circles;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        circles = new Circle[n];
        for(int i=0; i<n; i++){
            circles[i]= new Circle(new Point(sc.nextInt(), sc.nextInt()), sc.nextInt());
        }
        for(int i=0; i<n; i++){
            System.out.println("Circumference:");
            System.out.println(circles[i].getLen());
        }
    }
}