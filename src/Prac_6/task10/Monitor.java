package Prac_6.task10;

public class Monitor {
    private String name;
    public Monitor(String name){
        this.name = name;
    }
    public String getName(){ return name; }
    public String toString() {
        return "\nMonitor: " + name;
    }
}
