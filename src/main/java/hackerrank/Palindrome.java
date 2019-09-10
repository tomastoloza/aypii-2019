package hackerrank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }

     static boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;

        } else {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
    }
}
