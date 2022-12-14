package Prac_6.task10;

public class test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Computer comp = new Computer("AMD r5 5600x", "Balistix 4000hz cl14", "asus TUF Gaming 280hz");
        shop.add(comp);
        shop.find(1);
    }
}