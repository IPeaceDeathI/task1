package Java_test.Task_1.Task_1;

public class Author {
    private String name;
    private String email;
    private char gender;
    String info = "dfdsgsgs";
    //public String toString(){return info;}
    public String getName(){return name;}
    //public void setName(String name){this.name = name; }
    public String getEmail(){return email;}
    public void setEmail(String name){this.email = email; }
    public char getGender(){return gender;}
    public Author(String name, char gender){
        this.name = name;
        this.gender = gender;
    }


}
