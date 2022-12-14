package Prac_6.task6;

import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book(988, "Крещение Руси"));
        list.add(new Book(1836, "Нос"));
        list.add(new Book(1833, "Евгений Онегин"));
        list.add(new Book(1836, "Капитанская Дочка"));

        for(int i=0; i<list.size(); i++){
            list.get(i).print();
        }
    }
}