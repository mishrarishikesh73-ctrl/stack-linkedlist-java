// String challenges ke liye custom Linked-List Character Stack
class CharNode {
    char data;
    CharNode next;

    CharNode(char data) {
        this.data = data;
        this.next = null;
    }
}

class CharStack {
    private CharNode top;

    public void push(char ch) {
        CharNode node = new CharNode(ch);
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

// 4 Additional Challenge Questions ke solutions
public class StackChallenges {

    // Challenge 1: String ko stack se reverse karna
    public static String reverseString(String str) {
        CharStack charStack = new CharStack();
        for (int i = 0; i < str.length(); i++) {
            charStack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!charStack.isEmpty()) {
            reversed.append(charStack.pop());
        }
        return reversed.toString();
    }

    // Challenge 2: Check karna ki string palindrome hai ya nahi
    public static boolean isPalindrome(String str) {
        CharStack charStack = new CharStack();
        for (int i = 0; i < str.length(); i++) {
            charStack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charStack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Challenge 3: Ek stack ke elements ko doosre stack ki madad se reverse karna
    public static Stack reverseStackUsingAnother(Stack original) {
        Stack reversedStack = new Stack();
        while (!original.isEmpty()) {
            int val = original.pop();
            reversedStack.push(val);
        }
        return reversedStack;
    }

    // Challenge 4: Linked List stack ka middle element nikalna (slow & fast pointer)
    public static int findMiddle(Stack stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        Node slow = stack.getTopNode();
        Node fast = stack.getTopNode();

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        // 1. Reverse String
        System.out.println("Reverse 'hello': " + reverseString("hello"));

        // 2. Check Palindrome
        System.out.println("Is 'madam' palindrome? " + isPalindrome("madam"));
        System.out.println("Is 'java' palindrome? " + isPalindrome("java"));

        // 3 & 4. Middle element aur stack reversal
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Middle element: " + findMiddle(s)); // 30

        Stack rev = reverseStackUsingAnother(s);
        System.out.print("Reversed stack: ");
        rev.display();
    }
}