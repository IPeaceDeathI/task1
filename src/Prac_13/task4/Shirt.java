package Prac_13.task4;

public class Shirt {
    String value1;
    String value2;
    String value3;
    String value4;
    public Shirt(String value){
        String[] array = value.split(",");
        value1 = array[0];
        value2 = array[1];
        value3 = array[2];
        value4 = array[3];
    }
    public String toString(){
        return "[" + value1 + "] [" + value2 + "] [" + value3 + "] [" + value4 + "]";
    }
}
