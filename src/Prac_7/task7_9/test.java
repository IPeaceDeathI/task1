package Prac_7.task7_9;
import static Prac_7.task7_9.Book.*;
import static Prac_7.task7_9.Magazine.*;

public class test {
    public static void main(String[] args) {
        Printable[] printable = new Printable[10];
        printable[0] = new Printable("bkName_0", "book");
        printable[1] = new Printable("mgName_1", "magazine");
        printable[2] = new Printable("bkName_2", "book");
        printable[3] = new Printable("mgName_3", "magazine");
        printable[4] = new Printable("bkName_4", "book");
        printable[5] = new Printable("mgName_5", "magazine");
        printable[6] = new Printable("bkName_6", "book");
        printable[7] = new Printable("mgName_7", "magazine");
        printable[8] = new Printable("bkName_8", "book");
        printable[9] = new Printable("mgName_9", "magazine");
        printMagazines(printable);
        printBooks(printable);
    }
}
