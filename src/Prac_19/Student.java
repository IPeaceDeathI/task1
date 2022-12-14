package Prac_19;

public class Student {
    private String name;
    private String surname;
    private String speciality;
    private Integer course;
    private Integer GPAScore = 0;

    private String group;

    public Student(String name, String surname, String speciality, Integer course, String group, Integer GPAScore) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.GPAScore = GPAScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String stName) {
        this.name = stName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String stSurname) {
        this.surname = stSurname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String stSpeciality) {
        this.speciality = stSpeciality;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer iCourse) {
        this.course = iCourse;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String stGroup) {
        this.group = stGroup;
    }

    public Integer getGPAScore() {
        return GPAScore;
    }

    public void setGPAScore(Integer GPAScore) {
        this.GPAScore = GPAScore;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", " + surname + ", " + group + ", " + speciality + ", " + course + ", " + GPAScore;
    }
}