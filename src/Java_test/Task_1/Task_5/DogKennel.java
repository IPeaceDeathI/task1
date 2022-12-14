package Java_test.Task_1.Task_5;

import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dog[] dogs = new Dog[n];
        for(int i=0; i<n; i++){
            String a = sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            Dog dog = new Dog(name, age);
            dogs[i]=dog;
        }
        for(int i=0; i<n; i++){
            System.out.println(dogs[i] + " - " + dogs[i].toHuman() + " in human's age");
        }
    }
}
