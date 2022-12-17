package org.penzgtu.demos.queue;

import org.penzgtu.demos.interfaces.Queue;

import java.util.ArrayList;
import java.util.LinkedList;

public class IntegerLinkedListQueue implements Queue {
    private LinkedList<Integer> queue;

    public IntegerLinkedListQueue() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(int item) {
        queue.add(item);
    }

    @Override
    public Integer dequeue() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        return "IntegerLinkedListQueue{" +
                "queue=" + queue +
                '}';
    }
}
