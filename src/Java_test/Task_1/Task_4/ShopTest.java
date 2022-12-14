package Java_test.Task_1.Task_4;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            shop.add(sc.nextInt(), sc.next());
        }
        Computer c = shop.get(sc.next());
        if(c!=null){
            System.out.println("PC found. ID: ");
            System.out.println(c.id);
        }
    }
}