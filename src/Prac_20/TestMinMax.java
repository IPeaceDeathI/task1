package Prac_20;

public class TestMinMax {
    public static void main(String[] args) {
        MinMax<Double> tmp = new MinMax<>(new Double[]{5.0, 2.0, 3.5, 4.0, 1.0});
        System.out.printf("Min: %s\n",tmp.findMin());
        System.out.printf("Max: %s\n",tmp.findMax());
    }

}
