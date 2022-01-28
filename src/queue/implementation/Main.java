package queue.implementation;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> mq = new Queue<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
