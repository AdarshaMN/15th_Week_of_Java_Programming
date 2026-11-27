public class MainQueueArr {
    
    public static void main(String[] args)
    {
        QueueArr queue = new QueueArr(5);

        System.out.println("--------");
        System.out.println("Initially");
        System.out.println("--------");

        System.out.println();

        queue.display();
        System.out.println();

        System.out.println(queue.isEmpty());

        System.err.println();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        System.out.println();

        queue.display();

        System.out.println();

        System.out.println("\n--------");
        System.out.println("First");
        System.out.println("--------");

        System.out.println("First Element: " + queue.first());

        System.out.println("\n--------");
        System.out.println("Last");
        System.out.println("--------");

        System.out.println("Last Element: " + queue.last());

        System.out.println();

        System.out.println("\n--------");
        System.out.println("DeQueue");
        System.out.println("--------");

        System.out.println("Delete Element: " + queue.deQueue());
        System.out.println("Delete Element: " + queue.deQueue());

        System.out.println();

        System.out.println("\n---------------");
        System.out.println("first After Dequeue");
        System.out.println("---------------");

        System.out.println("First Element: " + queue.first());

        System.out.println();

        System.out.println("\n---------------");
        System.out.println("Last After Dequeue");
        System.out.println("---------------");

        System.out.println("Last Element: " + queue.last());
          
        System.out.println();

    }
}
