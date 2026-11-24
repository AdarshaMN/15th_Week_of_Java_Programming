public class MainStackLL {

    public static void main(String[] args) 
    {
        StackLL stack = new StackLL();

        System.out.println("---------------");
        System.out.println("Initially");
        System.out.println("---------------");

        stack.display();

        System.out.println();
        System.out.println("Is Empty : " + stack.isEmpty());

        System.out.println("\n---------------");
        System.out.println("Push Operations");
        System.out.println("---------------");

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println();

        stack.display();

        System.out.println("\n---------------");
        System.out.println("Peek Top Element");
        System.out.println("---------------");

        System.out.println("Top Element : " + stack.peek());

        System.out.println("\n---------------");
        System.out.println("Peek By Position");
        System.out.println("---------------");

        System.out.println("Position 1 : " + stack.peek(1));
        System.out.println("Position 2 : " + stack.peek(2));
        System.out.println("Position 3 : " + stack.peek(3));
        System.out.println("Position 4 : " + stack.peek(4));
        System.out.println("Position 5 : " + stack.peek(5));
        System.out.println("Position 6 : " + stack.peek(6));

        System.out.println("\n---------------");
        System.out.println("Pop Operation");
        System.out.println("---------------");

        System.out.println("Popped Element : " + stack.pop());

        System.out.println();

        stack.display();

        System.out.println("\n---------------");
        System.out.println("Top After Pop");
        System.out.println("---------------");

        System.out.println("Top Element : " + stack.peek());

        System.out.println("\n---------------");
        System.out.println("Pop Remaining Elements");
        System.out.println("---------------");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println();

        stack.display();

        System.out.println();

        System.out.println("Is Empty : " + stack.isEmpty());

        System.out.println();

        System.out.println("Try One More Pop");

        System.out.println(stack.pop());

        System.out.println();

        System.out.println("Try Peek On Empty Stack");

        System.out.println(stack.peek());
    }
}