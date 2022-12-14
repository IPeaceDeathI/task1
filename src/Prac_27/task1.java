package Prac_27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class task1{
    public static void main(String[] args)
    {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
