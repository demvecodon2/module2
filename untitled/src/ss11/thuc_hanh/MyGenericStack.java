package ss11.thuc_hanh;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyGenericStack<T> {
    private Stack<T> stack;

    public MyGenericStack() {
        stack = new Stack<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();

        }
        return stack.removeLast();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }

        return false;
    }
    static void stackOfIString(){
        MyGenericStack stack = new MyGenericStack();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        stack.push("Python");
        System.out.println("1.1 Size of stack after push operations"+stack.size());
        System.out.println("2.2 Size of stack after push operations");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("3.3 Size of stack after pop operations"+stack.size());
    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.1 Size of stack after push operations"+stack.size());
        System.out.println("2.2 Size of stack after push operations");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());

        }
        System.out.println("3.3 Size of stack after pop operations"+stack.size());
    }
}

