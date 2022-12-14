package Prac_6.task13_1;

public class test {
    public static void main(String[] args) {
        NewStringBuilder str = new NewStringBuilder();
        str.append("Some words");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.undo();
        System.out.println(str);
    }
}