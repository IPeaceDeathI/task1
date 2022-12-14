package Prac_14;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args){
        trueString();
        currency();
        math();
        year();
        mail();
        password();
        filt();
        dictionary();
    }
    static void trueString(){
        String value = "abcdefghijklmnopqrstuv18340";
        System.out.printf("String| %s: ", value);
        System.out.printf("%s\n", value.matches("abcdefghijklmnopqrstuv18340"));
    }
    static void currency(){
        String value = "12.02 USD 13.05 EU";
        String regex = "\\d+\\.\\d{2} (USD|RUB|EU)";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(value);
        System.out.printf("Currency| ");
        while(m1.find()){
            System.out.printf("%s    ", m1.group());
        }
    }
    static void math(){
        String value = "(1 + 8) – 9 / 4";
        System.out.printf("\nMath| %s", value.matches(".*(\\+)\\s*[0-9].*"));
    }
    static void year(){
        String value = "29/02/2003";
        boolean b = value.matches("(0[1-9]|[12][0-9]|3[01])[/](0[13578]|1[02])[/](([0-9]{2})[0-9]{2})|0[1-9]|[12][0-9]|30[/](0[469]|11)[/](([0-9]{2})[0-9]{2})|(0[1-9]|1[0-9]|2[0-8])[/](02)[/](([0-9]{2})[0-9]{2})|29[/](02)[/]((([0-9]{2})(04|08|[2468][048]|[13579][26]))|2000|1000)");
        System.out.printf("\nDate| %s", b);
    }
    static void mail(){
        String value = "email@mail.ru";
        System.out.printf("\nMail| %s\n", value.matches("([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)(()|(\\.([a-zA-Z]{2,5})))"));
    }
    static void password(){
        String value = "Aa123456";
        System.out.printf("Password| %s\n", value.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}"));
    }
    public static void filt(){
        String[] array = new String[]{"wordOne", "wordTwo", "null", "wordThree"};
        String[] newArray = (String[])filter(array, new Filter(){
            @Override
            public boolean apply(Object o ){
                return !o.equals("null");
            }
        });

        System.out.printf("Filter| %s\n", Arrays.toString(newArray));
    }
    public static Object[] filter(Object[] array, Filter filter) {
        int count = 0;
        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                count++;
            } else{
                array[i - count] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - count);
    }
    interface Filter {
        boolean apply(Object o);
    }
    public static void dictionary(){
        String value = "qwertyuiopaaasdfghjklzxcvbbnm";
        Map<String, Integer> dictionary = new HashMap<>();
        for(int i = 97; i < 123; i++){
            Pattern pattern = Pattern.compile(Character.toString((char)i));
            Matcher matcher = pattern.matcher(value);
            int count = 0;
            while(matcher.find()) count++;
            dictionary.put(Character.toString((char)i), count);
        }

        System.out.printf("Dictionary| %s\n", dictionary);
    }
}
