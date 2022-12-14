package Java_test.Task_1.Task_6;

import java.util.Scanner;

public class Circle2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle2 c1 = new Circle2(sc.nextInt());
        Circle2 c2 = new Circle2(sc.nextInt());
        System.out.println("length of 1st and 2nd circles:"  + c1.length() + " and " + c2.length());
        if(c1.more(c2)){
            System.out.println("1st circle is bigger");
        }
        else
        {
            System.out.println("2nd circle is bigger");
        }
    }
}