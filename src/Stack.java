// Manually created Singly Linked List se bana Stack (LIFO)
class Stack {
    private Node top;   // Stack ka top element point karta hai
    private int count;  // Total elements ka track rakhne ke liye

    public Stack() {
        this.top = null;
        this.count = 0;
    }

    // 1. Top par element insert karna
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
        System.out.println(data + " inserted");
    }

    // 2. Top element remove aur return karna
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        count--;
        System.out.println(poppedValue + " removed");
        return poppedValue;
    }

    // 3. Top element bina remove kiye return karna
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // 4. Check karna ki stack khali hai ya nahi
    public boolean isEmpty() {
        return top == null;
    }

    // 5. Stack ke total elements ki sankhya return karna
    public int size() {
        return count;
    }

    // 6. Top se bottom tak saare elements print karna
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Challenge 4 ke liye internal top node ka reference
    Node getTopNode() {
        return top;
    }
}