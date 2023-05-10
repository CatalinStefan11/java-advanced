package _6_generics.part_1;

import java.util.*;

public class Stack<E> {
    private List<E> elements;

    public Stack() {
        elements = new ArrayList<E>();
    }

    public void push(E element) {
        elements.add(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
