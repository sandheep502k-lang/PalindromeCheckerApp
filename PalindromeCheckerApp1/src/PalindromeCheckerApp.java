import java.util.*;

public class PalindromePerformance {

    public static boolean reverseCheck(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    public static boolean twoPointerCheck(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        long start, end;

        start = System.nanoTime();
        reverseCheck(input);
        end = System.nanoTime();
        System.out.println("Reverse Method Time: " + (end - start) + " ns");

        start = System.nanoTime();
        stackCheck(input);
        end = System.nanoTime();
        System.out.println("Stack Method Time: " + (end - start) + " ns");

        start = System.nanoTime();
        twoPointerCheck(input);
        end = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (end - start) + " ns");
    }
}