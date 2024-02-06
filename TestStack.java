import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> integerStack = new Stack<>();
        // Test push method
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Create a stack of strings
        Stack<String> stringStack = new Stack<>();
        // Test push method
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");

        // Test empty, peek, pop, and search methods for Integer Stack
        System.out.println("Integer Stack Operations:");
        System.out.println("Is the integer stack empty? " + integerStack.empty());
        System.out.println("Top element (peek): " + integerStack.peek());
        System.out.println("Position of element '20' (search): " + integerStack.search(20));
        System.out.println("Remove top element (pop): " + integerStack.pop());
        System.out.println("Top element after pop (peek): " + integerStack.peek());

        // Test empty, peek, pop, and search methods for String Stack
        System.out.println("\nString Stack Operations:");
        System.out.println("Is the string stack empty? " + stringStack.empty());
        System.out.println("Top element (peek): " + stringStack.peek());
        System.out.println("Position of element 'World' (search): " + stringStack.search("World"));
        System.out.println("Remove top element (pop): " + stringStack.pop());
        System.out.println("Top element after pop (peek): " + stringStack.peek());
    }
}
