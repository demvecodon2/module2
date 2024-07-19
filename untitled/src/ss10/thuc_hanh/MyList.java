package ss10.thuc_hanh;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {

    private int size =0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements [];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(Object element){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size] = element;
        size++;
    }
    public Object get(int index){
        if(index >= size|| index < 0){
            throw new IndexOutOfBoundsException( "index :" + index+"size :" + index );
        }
;
        return (E) elements[index];
    }
    public int size(){
        return size;
    }
}
