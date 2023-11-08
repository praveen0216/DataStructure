package queue;

public class QueueArrayImp {

    static class Queue {
        int capacity;
        int front ;
        int rear;
        int size;
        int[] arr ;
    }

    Queue createQueue(int initialCapacity) {
        Queue queue = new Queue();
        queue.capacity = initialCapacity;
        queue.front = 0;
        queue.rear = 0;
        queue.size = initialCapacity -1 ;
        queue.arr = new int[initialCapacity];

        return queue;
    }

    void enQueue(int data, Queue queue) {

        if(queue.rear == queue.capacity) {
            throw new IllegalArgumentException(" queue is full");
        } else {
            queue.arr[queue.rear + 1] =  data;
            queue.rear ++;
        }

    }

    void deQueue(Queue queue) {
        if(queue.front == queue.rear) {
            throw new IllegalArgumentException(" queue is empty");
        } else {
            for(int i = 0 ; i < queue.size ; i ++) {
                queue.arr[i] = queue.arr[i+1];
            }
            queue.rear--;
        }
    }


    public static void main(String[] args) {
        QueueArrayImp queueArrayImp = new QueueArrayImp();

        int cap = 10;
        Queue queue = queueArrayImp.createQueue(cap);

        // to use assert , you need to enable this in vm options -ea
        assert  queue.size == cap - 1;
        assert queue.front == 0;
        assert queue.rear == 0;
        assert queue.capacity == cap;

        //insert data
        queueArrayImp.enQueue(2, queue);
        assert  queue.size == cap - 1;
        assert queue.front == 0;
        assert queue.rear == 1;
        assert queue.capacity == cap;

        //delete data
        queueArrayImp.deQueue(queue);
        assert  queue.size == cap - 1;
        assert queue.front == 0;
        assert queue.rear == 0;
        assert queue.capacity == cap;

    }


}
