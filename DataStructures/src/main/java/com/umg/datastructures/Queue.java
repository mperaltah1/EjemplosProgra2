package com.umg.datastructures;

import com.umg.datastructures.nodes.Node;


/**
 *
 * @author mrph0
 */
public class Queue {

    //FIFO -> First In, First Out
    private Node first;
    private Node last;
    private int length;

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(Node newNode) {
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if (isEmpty()) {
            return null;
        }

        Node temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        
        length--;
        return temp;
    }
}
