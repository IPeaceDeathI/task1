package Prac_23.Number1;

public class TestArrayQueueModule {
    public static void main(String[] args) {
        new ArrayQueueModule();
        for(int i =0 ;i < 10; i++) ArrayQueueModule.enqueue(i);
        System.out.println(ArrayQueueModule.show());
        System.out.println(ArrayQueueModule.element());
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.size());
        System.out.println(ArrayQueueModule.isEmpty());
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.show());
    }
}
