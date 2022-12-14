package Prac_7.task7_9;

public class Printable {
    public Book book;
    public Magazine magazine;
    private String type;
    public Printable(String name, String type){
        this.type = type;
        if(type == "book"){
            book = new Book(name);
            magazine = new Magazine("default");
        }
        else{
            magazine = new Magazine(name);
            book = new Book("default");
        }
    }
    public String getType(){
        return type;
    }
}
