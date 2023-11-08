package queue;

public class FixedSizeArrayQueue {

    private int[] queueRep ;
    private int size, front, rear;

    private static final int CAPACITY = 16;

    public FixedSizeArrayQueue() {
        queueRep =  new int[CAPACITY];
        size = 0 ;
        front = 0 ;
        rear = 0;
    }

    public FixedSizeArrayQueue(int capacity) {
        queueRep =  new int[capacity];
        size = 0 ;
        front = 0 ;
        rear = 0;
    }

    public void enQueue(int data) throws IllegalArgumentException {
        if (size == CAPACITY) {
            throw new IllegalArgumentException("Queue is full") ;
        } else {
            size ++ ;
            queueRep[rear] = data;
            rear = ( rear + 1 ) % CAPACITY;
        }
    }

    public int deQueue() throws IllegalArgumentException {
        if (size == 0) {
            throw new IllegalArgumentException("Queue is empty");
        } else {
            size --;
            int data = queueRep[ front % CAPACITY ];
            queueRep[ front] = Integer.MIN_VALUE;
            front = (front + 1) % CAPACITY;
            return data;
        }
    }

    public boolean isEmpty() {
        return size == 0 ;
    }

    public boolean isFull() {
        return size == CAPACITY;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result = "[" ;
        for (int i = 0 ; i < size ; i ++) {
            result =  result + queueRep[(front + i) % CAPACITY];
            if ( i< size-1) {
                result += "," ;
            }
        }
        result += "]" ;
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        FixedSizeArrayQueue fixedSizeArrayQueue = new FixedSizeArrayQueue();
        assert  fixedSizeArrayQueue.size == 0;
        assert  fixedSizeArrayQueue.isEmpty()  == true;

        fixedSizeArrayQueue.enQueue(10);
        fixedSizeArrayQueue.enQueue(20);
        fixedSizeArrayQueue.enQueue(30);
        fixedSizeArrayQueue.enQueue(40);
        fixedSizeArrayQueue.enQueue(50);
        fixedSizeArrayQueue.toString();

        fixedSizeArrayQueue.deQueue();
        fixedSizeArrayQueue.toString();

        fixedSizeArrayQueue.deQueue();
        fixedSizeArrayQueue.toString();

        fixedSizeArrayQueue.deQueue();
        fixedSizeArrayQueue.toString();


        fixedSizeArrayQueue.deQueue();
        fixedSizeArrayQueue.toString();

        fixedSizeArrayQueue.deQueue();
        fixedSizeArrayQueue.toString();

        fixedSizeArrayQueue.deQueue();
        fixedSizeArrayQueue.toString();

    }


}
