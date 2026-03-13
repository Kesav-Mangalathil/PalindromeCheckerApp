
public class PalindromeApp {
       public boolean checkPalindrome(String str) {

        str = str.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String word = "level";

        if (checker.checkPalindrome(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
