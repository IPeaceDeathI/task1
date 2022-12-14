package Prac_19;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> alStudents = new ArrayList<>();
        alStudents.add(new Student("Ivan", "Ivanov", "Designer",4, "IKBO-01-20",4));
        alStudents.add(new Student("Petr", "Petrov", "Drawer", 3, "IVBO-02-22", 5));
        new StudentUI(alStudents);
    }
}
