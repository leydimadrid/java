import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Initial stack: " + stack);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop operation: " + stack);
        System.out.println("------------");
        Queue<String> cola = new PriorityQueue<>();
        cola.add("Arroz");
        cola.add("Panela");
        cola.add("Frijoles");
        System.out.println("Initial queue: " + cola);
        System.out.println("Removed element: " + cola.remove());
        System.out.println("after remove queue: " + cola);
    }
}