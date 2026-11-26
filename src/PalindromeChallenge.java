class CharNode2 {
    char data;
    CharNode2 next;

    CharNode2(char data) {
        this.data = data;
        this.next = null;
    }
}

class CharStack2 {
    private CharNode2 top;

    public void push(char ch) {
        CharNode2 node = new CharNode2(ch);
        node.next = top;
        top = node;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char val = top.data;
        top = top.next;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class PalindromeChallenge {
    public static boolean isPalindrome(String str) {
        CharStack2 stack = new CharStack2();

        // Saare characters stack mein daalo
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop karte waqt original string ke characters se compare karo
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("madam -> " + isPalindrome("madam")); // true
        System.out.println("racecar -> " + isPalindrome("racecar")); // true
        System.out.println("java -> " + isPalindrome("java")); // false
    }
}