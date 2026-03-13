
public class PalindromeApp {
      static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");

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

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        if (isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
