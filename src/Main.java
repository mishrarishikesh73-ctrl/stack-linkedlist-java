// Assignment ke sample test case aur edge cases test karne ke liye
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);                 // 10 inserted
        stack.push(20);                 // 20 inserted
        stack.push(30);                 // 30 inserted
        stack.display();                // 30 -> 20 -> 10
        System.out.println(stack.peek()); // 30
        stack.pop();                    // 30 removed
        stack.display();                // 20 -> 10
        System.out.println(stack.size()); // 2
        System.out.println(stack.isEmpty()); // false
        stack.pop();                    // 20 removed
        stack.pop();                    // 10 removed
        System.out.println(stack.isEmpty()); // true
        stack.pop();                    // Stack Underflow
    }
}