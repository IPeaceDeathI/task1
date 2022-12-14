package Prac_13.task3;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corp;
    private String flat;

    public Adress(String adress, String split){
        String[] array = adress.split(split);
        this.country = array[0];
        this.region = array[1];
        this.city = array[2];
        this.street = array[3];
        this.house = array[4];
        this.corp = array[5];
        this.flat = array[6];
    }
    public String toString(){
        return country + " " + region + " " + city + " " + street + " " + street + " " + house + " " + corp + " " + flat;
    }
}
