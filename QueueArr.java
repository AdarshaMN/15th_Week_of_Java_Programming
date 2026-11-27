public class QueueArr {

    int size;
    int front;
    int rare;
    int []queue;

    QueueArr(int size)
    {
        this.size = size;
        front = -1;
        rare = -1;
        queue = new int[size];
    }

    public void enQueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return;
        }
        rare++;
        queue[rare] = value;

        System.out.println("Values" + value);
    }

    public int deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        front++;
        return queue[front];
    }

    public boolean isEmpty()
    {
        return front == rare;
    }

    public boolean isFull()
    {
        return rare == size - 1;
    }

    public int first()
    {
        if(isEmpty())
        {
            System.err.println("Queue is Empty");
            return -1;
        }

        return queue[front + 1];
    }

    public int last()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[rare];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front");
        for(int i = front + 1; i < rare; i++)
        {
            System.out.println(queue[i] + " ");
        }
    }
}