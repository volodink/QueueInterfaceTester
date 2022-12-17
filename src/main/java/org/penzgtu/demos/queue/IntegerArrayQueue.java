package org.penzgtu.demos.queue;

import org.penzgtu.demos.interfaces.Queue;

import java.util.ArrayList;

public class IntegerArrayQueue implements Queue {
    private ArrayList<Integer> queue;
    private int capacity;

    public IntegerArrayQueue() {
        queue = new ArrayList<>();
    }

    public IntegerArrayQueue(int capacity) {
        queue = new ArrayList<>();
        this.capacity = capacity;
    }

    public void enqueue(int item) {
        queue.add(item);
    }

    public Integer dequeue() {
        if (isEmpty()) return null;
        Integer first = queue.remove(0);
        return first;
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.size() == 0;
    }

    @Override
    public String toString() {
        return "IntegerArrayQueue{" +
                "queue=" + queue +
                '}';
    }
}
