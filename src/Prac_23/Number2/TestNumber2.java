package Prac_23.Number2;

public class TestNumber2 {
    public static void main(String[] args) {
        AbstractQueue queue = new LinkedQueue();
        for (int i = 0; i  < 10; i++) queue.enqueue(i);
        System.out.println(queue.show());
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue.show());
    }
}
