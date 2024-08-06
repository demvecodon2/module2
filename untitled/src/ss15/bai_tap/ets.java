package ss15.bai_tap;

import java.util.Scanner;

class Stack {
    private int[] stack = new int[5];
    private int top = -1;


    public void push() {
        Scanner scanner = new Scanner(System.in);

        if (top < stack.length - 1) {
            System.out.print("Enter the number: ");
            int item = scanner.nextInt();
            top++;
            stack[top] = item;
        } else {
            System.out.println("Stack is full");
        }
    }


    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(); } }
