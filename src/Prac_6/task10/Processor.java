package Prac_6.task10;

public class Processor {
    private String name;
    Processor(String name){
        this.name = name;
    }
    public String getName(){ return name; }

    public String toString() {
        return "\nProcessor: " + name;
    }
}
