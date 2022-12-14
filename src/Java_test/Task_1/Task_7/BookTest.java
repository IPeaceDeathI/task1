package Java_test.Task_1.Task_7;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Book[] book = new Book[n];
        for(int i=0; i<n; i++){
            book[i] = new Book(sc.next(), sc.next(), sc.nextInt());
        }
        BookShelf bs = new BookShelf(n, book);
        bs.print();
        System.out.println("first: " + bs.first());
        System.out.println("last: " + bs.last());
        bs.sort();
        bs.print();
    }
}
