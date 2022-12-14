package Prac_23.Number1;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        for(int i = 0; i < 10; i++) queue.enqueue(i);
        System.out.println(queue.show());
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue.show());
    }
}
