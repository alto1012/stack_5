package tom;

import java.util.ArrayList;
import java.util.List;


public class Stack implements StackInterface {
    private List<Object> elements = new ArrayList<>();
    private int size = 0;

    //test
    public Object push(Object item) {
        elements.add(item);
        size++;
        return item;
    }

    public Object pop() {
        Object item = peek();
        return item;
    }

    public Object peek() {
        return elements.get(size - 1);
    }

    public int size() {
        return size;
    }

}
