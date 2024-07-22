import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public static boolean isPalindrome(String str) {
    String processedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
    Queue<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();
    for (char c : processedStr.toCharArray()) {
        queue.add(c);
        stack.push(c);
    }
    while (!queue.isEmpty()) {
        if (queue.remove() != stack.pop()) {
            return false;
        }
    }
    return true;
}  public static void main(String[] args) {
    String testStr1 = "Able was I ere I saw Elba";
    String testStr2 = "Hello, World!";
    System.out.println("Is \"" + testStr1 + "\" a palindrome? " + isPalindrome(testStr1));
    System.out.println("Is \"" + testStr2 + "\" a palindrome? " + isPalindrome(testStr2));
}
