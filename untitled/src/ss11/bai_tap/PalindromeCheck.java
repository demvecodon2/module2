package ss11.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public  class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        String pocessedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : pocessedStr.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
