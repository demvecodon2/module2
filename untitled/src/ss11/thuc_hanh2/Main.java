package ss11.thuc_hanh2;

public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(20);
        queue.enqueue(12);
        queue.enqueue(14);
        queue.enqueue(121);
        System.out.println(queue.dequeue().key);
    }
}
