package Prac_11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*==============Add====================
---Add elements ( 6kk )
LinkedList: 2264 ms
ArrayList: 493 ms
ArrayList is faster

==============Insert=================
---Insert elements to begin( 100k )
LinkedList: 132 ms
ArrayList: 2742 ms
LinkedList is faster

---Insert elements to middle( 60k )
LinkedList: 4110 ms
ArrayList: 494 ms
ArrayList is faster

==============Remove=================
---Remove elements from begin ( 100k )
LinkedList: 2 ms
ArrayList: 3220 ms
LinkedList is faster

---Remove elements from middle ( 100k )
LinkedList: 7519 ms
ArrayList: 1544 ms
ArrayList is faster

---Remove elements from end ( 1kk )
LinkedList: 37 ms
ArrayList: 8 ms
ArrayList is faster

==============Get====================
---Get elements from begin ( 4kk )
LinkedList: 25 ms
ArrayList: 7 ms
ArrayList is faster

---Get elements from middle ( 40k )
LinkedList: 2320 ms
ArrayList: 0 ms
ArrayList is faster

---Get elements from end ( 3kk )
LinkedList: 23 ms
ArrayList: 5 ms
ArrayList is faster

==============Set====================
---Set elements at begin ( 1kk )
LinkedList: 342 ms
ArrayList: 12 ms
ArrayList is faster

---Set elements at middle ( 50k )
LinkedList: 3734 ms
ArrayList: 1 ms
ArrayList is faster

---Set elements at end ( 3kk )
LinkedList: 40 ms
ArrayList: 267 ms
LinkedList faster*/

public class test {
    public static void main(String[] args) {
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        d1.set(Calendar.YEAR,2003);
        d1.set(Calendar.MONTH,Calendar.APRIL);
        d1.set(Calendar.DAY_OF_MONTH,4);
        Developer dev1 = new Developer("Den", d1, d2);
        System.out.println(dev1);
    }
}
