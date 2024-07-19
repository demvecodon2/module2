package ss10.bai_tap;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E e) {
        ensureCapacity();
        for (int i = 0; i < elements.length; i++) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }
    public E remove(int index) {
        E removeElenment = (E) elements[index];
        for (int i = index ; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return removeElenment;
    }
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == DEFAULT_CAPACITY) {
            elements = new Object[DEFAULT_CAPACITY];
        }
    }
}







