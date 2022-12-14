package Prac_13.task1;

public class string {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        System.out.println(str.charAt(str.length()-1));

        if (str.endsWith("!!!")){System.out.println("Yes");}
        else{System.out.println("No");}

        if (str.startsWith("I like")){System.out.println("Yes");}
        else{System.out.println("No");}

        if (str.contains("Java")){System.out.println("Yes");}
        else{System.out.println("No");}

        System.out.println(str.indexOf("Java"));

        System.out.println(str.replace("a","o"));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String newstr=str.substring(7,11);
        System.out.println(newstr);
    }
}



