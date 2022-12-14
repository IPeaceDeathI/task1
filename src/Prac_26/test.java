package Prac_26;

public class test {
    public static void main(String[] args){
        hashtab tab = new hashtab();
        tab.hashtabInit();
        tab.hashtabAdd(10,"a");
        tab.hashtabAdd(9,"b");
        tab.hashtabAdd(8,"c");
        tab.hashtabAdd(7,"d");
        tab.hashtabAdd(6,"e");
        tab.hashtabAdd(5,"f");
        tab.hashtabAdd(4,"g");
        tab.hashtabAdd(3,"h");
        tab.hashtabAdd(2,"i");
        tab.hashtabAdd(1,"j");
        tab.hashtabDelete(3);
        System.out.println(tab.hashtabLookUp(10));
        System.out.println(tab.hashtabLookUp(3));
    }
}

