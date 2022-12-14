package Prac_7.task5_6;

public class StrEditor implements StringInterface {
    public int length(String str) {
        return str.length();
    }

    public String newString(String str) {
        char arr[] = str.toCharArray();
        String newStr = "";
        for(int i = 0; i < str.length(); i+=2)
            newStr += arr[i];
        return newStr;
    }

    public String reverse(String str) {
        char arr[] = str.toCharArray();
        String newStr = "";
        for(int i = str.length(); i > 0; i--)
            newStr += arr[i];
        return newStr;
    }
}
