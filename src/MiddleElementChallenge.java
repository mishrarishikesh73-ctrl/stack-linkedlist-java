// Isme tumhari banayi hui Stack aur Node class use ho rahi hai
public class MiddleElementChallenge {
    public static int findMiddle(Stack stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        Node slow = stack.getTopNode(); // 1 step chalega
        Node fast = stack.getTopNode(); // 2 steps chalega

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack (Top -> Bottom):");
        stack.display(); // 50 -> 40 -> 30 -> 20 -> 10

        System.out.println("Middle Element: " + findMiddle(stack)); // 30
    }
}