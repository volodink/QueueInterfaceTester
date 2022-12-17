package org.penzgtu.demos;

import org.penzgtu.demos.interfaces.Queue;
import org.penzgtu.demos.queue.IntegerArrayQueue;
import org.penzgtu.demos.queue.IntegerLinkedListQueue;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Queue q = new IntegerArrayQueue();
        q.enqueue(10);

        Queue q2 = new IntegerLinkedListQueue();
        q2.enqueue(10);

        List<Queue> queueList = new ArrayList<>();
        queueList.add(q);
        queueList.add(q2);
        for (Queue queue : queueList) {
            System.out.println(queue);
            System.out.println(queue.isEmpty());
        }
    }
}
