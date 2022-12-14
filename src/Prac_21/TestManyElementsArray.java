package Prac_21;

public class TestManyElementsArray {
    public static void main(String[] args) {
        ManyElementsArray<Integer> storage = new ManyElementsArray<>();
        Integer[] ar = {1,2,3,4,5};
        storage.setArray(ar);
        System.out.println(storage.get(3));
    }
}
