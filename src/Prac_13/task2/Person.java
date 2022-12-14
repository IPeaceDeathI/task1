package Prac_13.task2;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    public Person(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public Person(String surname, String name){
        this.surname = surname;
        this.name = name;
        this.patronymic = "";
    }
    public Person(String surname){
        this.surname = surname;
        this.name = "";
        this.patronymic = "";
    }
    public String toString(){
        return surname + " " + name + " " + patronymic;
    }
}
