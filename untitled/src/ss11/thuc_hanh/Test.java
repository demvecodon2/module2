package ss11.thuc_hanh;

import java.util.ArrayDeque;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);
        System.out.println(stack.pop());
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.push("HELLO");
        arrayDeque.push("WORlD");
        arrayDeque.push("java");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pop());

    }
}
