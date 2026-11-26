// Isme tumhari banayi hui Stack aur Node class use ho rahi hai
public class ReverseStackChallenge {
    public static Stack reverseStack(Stack original) {
        Stack tempStack = new Stack();

        // Original stack se pop karke naye stack mein push karo
        while (!original.isEmpty()) {
            int val = original.pop();
            tempStack.push(val);
        }

        return tempStack;
    }

    public static void main(String[] args) {
        Stack original = new Stack();
        original.push(10);
        original.push(20);
        original.push(30);
        original.push(40);

        System.out.println("Original Stack (Top -> Bottom):");
        original.display(); // 40 -> 30 -> 20 -> 10

        Stack reversed = reverseStack(original);
        System.out.println("Reversed Stack (Top -> Bottom):");
        reversed.display(); // 10 -> 20 -> 30 -> 40
    }
}