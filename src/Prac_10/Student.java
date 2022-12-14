package Prac_10;

public class Student implements Comparable<Student>{
    int course;
    int group;
    String speciality;
    String name;
    String LastName;
    int mark;

    public Student(String speciality, int course, int group, String name, String LastName, int mark) {
        this.speciality = speciality;
        this.group = group;
        this.course = course;
        this.name = name;
        this.LastName = LastName;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "speciality: " +speciality+
                ", course=" + course +", group=" + group +
                ", name='" + name + '\'' +", LastName='" + LastName +'\''+
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.mark - this.mark;
    }
}
