package ss11.bai_tap;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfInteger();
        System.out.println("2. Stack of strings");
        stackOfString();
    }

    private static void stackOfInteger() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original stack size: " + stack.size());
        System.out.println("Elements in the original stack:");
        for (Integer i : stack) {
            System.out.println(i);
        }

        Stack<Integer> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }

        System.out.println("Reversed stack size: " + stack2.size());
        System.out.println("Elements in the reversed stack:");
        for (Integer i : stack2) {
            System.out.println(i);
        }
    }

    private static void stackOfString() {
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");

        System.out.println("Original stack size: " + stack.size());
        System.out.println("Elements in the original stack:");
        for (String s : stack) {
            System.out.println(s);
        }

        Stack<String> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }

        System.out.println("Reversed stack size: " + stack2.size());
        System.out.println("Elements in the reversed stack:");
        for (String s : stack2) {
            System.out.println(s);
        }
    }
}

