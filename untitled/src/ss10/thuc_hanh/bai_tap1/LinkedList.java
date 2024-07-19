package ss10.thuc_hanh.bai_tap1;

public class LinkedList<T> {
    private class Node {
        private Object data;
        private Node next;

        public Node(Node next, Object data) {
            this.data = data;
        }
        public Object getData() {
            return data;
        }
    }
}
