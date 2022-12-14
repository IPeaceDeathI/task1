package Prac_7.task7_9;

public class Magazine {
    private String name = "";
    public Magazine(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void printMagazines(Printable[] printable){
        System.out.printf("Magazines|\t");
        for(int i = 0; i < printable.length; i++)
        {
            if(printable[i].getType() == "magazine")
                System.out.printf("%s ", printable[i].magazine.getName());
        }
        System.out.println();
    }
}
