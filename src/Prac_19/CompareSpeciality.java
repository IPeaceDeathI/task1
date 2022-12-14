package Prac_19;

import java.util.Comparator;

public class CompareSpeciality implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return first.getSpeciality().compareTo(second.getSpeciality());
    }
}
