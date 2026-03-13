import java.util.Stack;
import java.util.Scanner;

interface PalindromeStrategy {
    boolean check(String str);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String str) {
        return strategy.check(str);
    }
}



public class Main {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy = new StackStrategy();
        PalindromeContext context = new PalindromeContext(strategy);

        if (context.checkPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
