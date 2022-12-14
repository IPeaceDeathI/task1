package Prac_7.task7_9;

public class Book {
    private String name = "";
    public Book(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void printBooks(Printable[] printable){
        System.out.printf("Books|\t\t");
        for(int i = 0; i < printable.length; i++)
        {
            if(printable[i].getType() == "book")
                System.out.printf("%s ", printable[i].book.getName());
        }
        System.out.println();
    }
}