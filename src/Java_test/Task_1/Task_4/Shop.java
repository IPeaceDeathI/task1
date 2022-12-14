package Java_test.Task_1.Task_4;
import java.util.ArrayList;

class Computer{
    public int id;
    public String name;

    public Computer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Shop {
    public ArrayList<Computer> list = new ArrayList<Computer>();
    public void add(int id, String name){
        list.add(new Computer(id, name));
    }
    public Computer get(String name){
        for (Computer c: list){
            if(c.name.equals(name)){
                return c;
            }
        }
        return null;
    }
    public void remove(String name){
        for (Computer c: list){
            if(c.name.equals(name)){
                list.remove(list.indexOf(c));
            }
        }
    }
}