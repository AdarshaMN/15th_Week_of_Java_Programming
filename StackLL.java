class Node {
    
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class StackLL {

    Node top;

    StackLL()
    {
        top = null; //no node is created
    }

    public void push(int value)
    {
        Node newNode = new Node(value);

        newNode.next = top;// is holding heads address

        top = newNode; //head is now pointing to new Node

        System.out.println(value + " :Pushed");
    }

    //pop()

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = top.data;

        top = top.next;

        return value;
    }

    // Peek (Top Element)
    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // Peek at Position
    // Position starts from 1 (Top = Position 1)
    public int peek(int position) {

        if (position <= 0) {
            System.out.println("Invalid Position");
            return -1;
        }

        Node temp = top;

        int count = 1;

        while (temp != null && count < position) {

            temp = temp.next;
            count++;

        }

        if (temp == null) {
            System.out.println("Position does not exist");
            return -1;
        }

        return temp.data;
    }

    // isEmpty
    public boolean isEmpty() {

        return top == null;

    }

    // Display
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top");

        Node temp = top;

        while (temp != null) {

            System.out.println("| " + temp.data + " |");
            System.out.println("-----");

            temp = temp.next;

        }
    }
}
