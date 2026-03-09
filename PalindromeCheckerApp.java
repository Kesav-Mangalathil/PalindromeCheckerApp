import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {
   public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for(char c : str.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear
        while(deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if(first != last) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if(isPalindrome(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    
}
}
