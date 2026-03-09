import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void  main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase(); 

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);  

        boolean isPalindrome = true;


        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("It is a Palindrome.");
        else
            System.out.println("Not a Palindrome.");

        sc.close();
    }
}
}
