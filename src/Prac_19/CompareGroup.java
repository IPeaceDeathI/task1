package Prac_19;

import java.util.Comparator;

public class CompareGroup implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second){
        return first.getGroup().compareTo(second.getGroup());
    }
}