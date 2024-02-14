import java.util.Stack;

public class ReversedStack {
    public static <E extends Comparable<E>> Stack<E> reversedStackIterative(Stack<E> stack) {
        Stack<E> temp = new Stack<>();
        while (!stack.isEmpty()) // push all elements to temp stack
            temp.push(stack.pop());
        return temp;
    }

    public static <E extends Comparable<E>> Stack<E> reversedStackRecursive(Stack<E> stack) {
        if (stack.isEmpty()) {
            return new Stack<>();
        }
        E bottom = popBottom(stack);
        Stack<E> reversed = reversedStackRecursive(stack);
        reversed.push(bottom);
        return reversed;
    }

    private static <E extends Comparable<E>> E popBottom(Stack<E> stack) {
        E top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        } else {
            E bottom = popBottom(stack);
            stack.push(top);
            return bottom;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 5; i++)
            s.push(i);
        System.out.println("Initial stack bottom to top: " + s);

        long start = System.nanoTime();
        Stack<Integer> reversedIterative = reversedStackIterative((Stack<Integer>) s.clone());
        long end = System.nanoTime();
        System.out.println("Iterative method time: " + (end - start) + " nanoseconds");
        System.out.println("Stack after calling iterative method: " + reversedIterative);

        start = System.nanoTime();
        Stack<Integer> reversedRecursive = reversedStackRecursive((Stack<Integer>) s.clone());
        end = System.nanoTime();
        System.out.println("Recursive method time: " + (end - start) + " nanoseconds");
        System.out.println("Stack after calling recursive method: " + reversedRecursive);
    }
}
