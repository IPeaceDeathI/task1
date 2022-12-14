package Prac_13.task5;

public class Telephone {
    String value1;
    String value2;
    String value3;
    String value4;
    String value5;
    public Telephone(String value){
        if(value.contains("+")){
            this.value1 = value.substring(1, 2);
            this.value2 = value.substring(2, 5);
            this.value3 = value.substring(5, 8);
            this.value4 = value.substring(8, 10);
            this.value5 = value.substring(10, 12);
        }
        else{
            this.value1 = "8";
            this.value2 = value.substring(1, 4);
            this.value3 = value.substring(4, 7);
            this.value4 = value.substring(7, 9);
            this.value5 = value.substring(9, 11);
        }
    }
    public String toString(){
        return value1 + " (" + value2 + ") " + value3 + " - " + value4 + " - " + value5;
    }
}
