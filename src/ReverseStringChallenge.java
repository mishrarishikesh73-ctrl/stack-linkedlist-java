class CharNode1 {
    char data;
    CharNode1 next;

    CharNode1(char data) {
        this.data = data;
        this.next = null;
    }
}

class CharStack1 {
    private CharNode1 top;

    public void push(char ch) {
        CharNode1 node = new CharNode1(ch);
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

public class ReverseStringChallenge {
    public static String reverseString(String str) {
        CharStack1 stack = new CharStack1();

        // String ke har character ko stack mein push karo
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // LIFO order mein pop karke reverse string banao
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverseString(input)); // olleh
    }
}