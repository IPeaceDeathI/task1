package Prac_6.task10;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Computer> array;
    public void add(Computer computer){
        array = new LinkedList<Computer>();
        array.add(computer);
        computer.setId(array.size());
    }
    public void remove(int id){
        array.remove(id);
    }
    public void find(int id){
        for(int i = 0; i < array.size(); i++){
            if(array.get(i).getId() == id){
                System.out.println(array.get(i));
                break;
            }
        }
    }
}
