package Prac_9;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args){
        TreeSet<Person> people = new TreeSet<Person>();
        people.add(new Person("Den"));
        people.add(new Person("Arg"));
        people.add(new Person("Gsdt"));
        people.add(new Person("Cwqe"));
        people.add(new Person("Sasd"));
        for(Person person : people) {
            System.out.println(person.getName());
        }
    }
}
