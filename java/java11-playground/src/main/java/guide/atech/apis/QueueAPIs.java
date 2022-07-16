package guide.atech.apis;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueAPIs {
    public static void main(String[] args) {
        /**
         * QUEUE APIs
         */
        Queue<Integer> q = new LinkedList<>();

        // To add the element
        q.add(1);

        // To remove head of queue
        /*
            Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
            Returns: the head of this queue
            Throws:NoSuchElementException – if this queue is empty
        */
        Integer removedElem1 = q.remove();

        /*
        Retrieves and removes the head of this queue, or returns null if this queue is empty.
        Returns: the head of this queue, or null if this queue is empty
        */
        Integer removedElem2 = q.poll();

        // To view the head of queue
        Integer viewedElem = q.peek();

        // to get the size
        Integer sizeOfQueue = q.size();

        /**
         * DUEUE APIs
         */
        Deque<Integer> deque = new LinkedList<>();
        // Start APIs
        deque.addFirst(1);
        deque.removeFirst();
        deque.pollFirst();
        deque.peekFirst();

        // End APIs
        deque.addLast(1);
        deque.removeLast();
        deque.pollLast();
        deque.peekLast();
    }
}
