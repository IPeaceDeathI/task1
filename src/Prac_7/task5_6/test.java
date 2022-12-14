package Prac_7.task5_6;

public class test {
    public static void main(String[] args) {
        String str = "123456789";
        StrEditor t = new StrEditor();
        System.out.printf("String| %s \n\t\tLength: %s\n\t\tEdited: %s\n", str, t.length(str), t.newString(str));
    }
}
