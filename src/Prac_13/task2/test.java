package Prac_13.task2;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person("Surname", "Name", "Patronymic");
        Person p2 = new Person("Surname", "Name");
        Person p3 = new Person("Surname");
        System.out.printf("Person|\n%s\n%s\n%s\n", p1, p2, p3);
    }
}
