package ss11.bai_tap;

import static ss11.bai_tap.PalindromeCheck.isPalindrome;

public class check {
    public static void main(String[] args) {
        String testStr1 = "Able was I ere I saw Elba";
        String testStr2 = "Hello, World!";
        System.out.println("Is \"" + testStr1 + "\" a palindrome? " + isPalindrome(testStr1));
        System.out.println("Is \"" + testStr2 + "\" a palindrome? " + isPalindrome(testStr2));
    }
    }

