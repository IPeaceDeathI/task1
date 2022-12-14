package Prac_25;

import java.util.regex.Pattern;

public class IPvChecker {

    public static void main( String[] args){
        System.out.println("abc.def.gha.bcd:\t" + (checkIP("abc.def.gha.bcd")? "Correct" : "Incorrect"));
        System.out.println("127.0.0.1:\t\t\t" + (checkIP("127.0.0.1")? "Correct" : "Incorrect"));
        System.out.println("1300.6.7.8:\t\t\t" + (checkIP("1300.6.7.8")? "Correct" : "Incorrect"));
    }

    public static Boolean checkIP(String IPv){
        var regex = "^(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5]))\\.){3}(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5])))$";
        return (Pattern.matches(regex, IPv));
    }
}
