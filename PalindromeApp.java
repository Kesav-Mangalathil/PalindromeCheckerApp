class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}


public class PalindromeApp {
     Node head;

    // Add node
    void append(char data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Reverse linked list
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Check palindrome
    boolean isPalindrome() {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        Node firstHalf = head;

        // Compare halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        LinkedListPalindrome list = new LinkedListPalindrome();

        // Convert string to linked list
        for (char c : word.toCharArray()) {
            list.append(c);
        }

        if (list.isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

}
}
