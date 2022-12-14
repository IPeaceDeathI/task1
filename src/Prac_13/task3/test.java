package Prac_13.task3;

public class test {
    public static void main(String[] args) {
        String str = "Country,Region,City,Street,House,Corp,Flat";
        Adress a1 = new Adress(str, ",");
        System.out.printf("Adress| %s\n", a1);
    }
}
