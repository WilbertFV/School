import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        // Testing Queue with Strings
        Queue<String> queueString = new LinkedList<>();
        queueString.offer("Oklahoma");
        queueString.offer("Indiana");
        queueString.offer("Georgia");
        queueString.offer("Texas");

        System.out.println("Queue of Strings:");
        while (queueString.size() > 0) {
            System.out.print(queueString.remove() + " ");
        }

        System.out.println("\n\nTesting Queue with Integers:");
        // Testing Queue with Integers
        Queue<Integer> queueInteger = new LinkedList<>();

        // Testing 'add(E e)'
        queueInteger.add(10);
        queueInteger.add(20);

        // Testing 'offer(E e)'
        queueInteger.offer(30);
        queueInteger.offer(40);

        // Testing 'element()'
        System.out.println("Element at head (using element()): " + queueInteger.element());

        // Testing 'peek()'
        System.out.println("Element at head (using peek()): " + queueInteger.peek());

        // Testing 'poll()'
        System.out.println("Removed element (using poll()): " + queueInteger.poll());

        // Testing 'remove()'
        System.out.println("Removed element (using remove()): " + queueInteger.remove());

        System.out.println("Remaining Queue:");
        while (!queueInteger.isEmpty()) {
            System.out.print(queueInteger.poll() + " ");
        }
    }
}
