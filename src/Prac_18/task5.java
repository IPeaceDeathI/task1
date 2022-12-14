package Prac_18;

public class task5 {
    public static void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
    }
    public static void main(String[] args) {
        try {
            getDetails(null);
        } catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
