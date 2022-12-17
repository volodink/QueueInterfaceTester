package org.penzgtu.demos.interfaces;

public interface Queue {
    public void enqueue(int item);
    public Integer dequeue();

    public int size();

    public boolean isEmpty();
}
