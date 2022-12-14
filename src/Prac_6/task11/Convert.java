package Prac_6.task11;

public class Convert implements Convertable{
    private double temperature;
    public Convert(double temperature){
        this.temperature = temperature;
    }
    public void convert() {
        System.out.printf("%s C \n%s K \n%s F", temperature, temperature+273, temperature*1.8+32);
    }
}
