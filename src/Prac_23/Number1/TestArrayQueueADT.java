package Prac_23.Number1;

public class TestArrayQueueADT {
    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        for (int i = 0; i < 10; i++) ArrayQueueADT.enqueue(queue, i);
        System.out.println(ArrayQueueADT.show(queue));
        System.out.println(ArrayQueueADT.element(queue));
        System.out.println(ArrayQueueADT.dequeue(queue));
        System.out.println(ArrayQueueADT.size(queue));
        System.out.println(ArrayQueueADT.isEmpty(queue));
        ArrayQueueADT.clear(queue);
        System.out.println(ArrayQueueADT.show(queue));
    }
}
