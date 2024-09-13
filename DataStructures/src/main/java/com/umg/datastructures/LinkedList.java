package com.umg.datastructures;

import com.umg.datastructures.nodes.Node;


/**
 *
 * @author mrph0
 */
public class LinkedList {

    private Node head;

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public Node search(long id) {
        if (isEmpty()) {
            return null;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.getId() == id) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean updateName(long id, String newName) {
        Node temp = search(id);
        if (temp == null) {
            return false;
        }
        temp.setName(newName);
        return true;
    }

    private boolean removeFirst() {
        if (isEmpty()) {
            return false;
        }
        
        Node temp = head;
        head = head.next;
        temp.next = null;
        return true;
    }

    public boolean removeByValue(long id) {
        if (isEmpty()) {
            return false;
        }
        
        if (head.getId() == id) {
            return removeFirst();
        }
        
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.getId() == id) {
                //Este es el nodo que va a ser eliminado
                Node deleted = temp.next;
                temp.next = temp.next.next;
                deleted.next = null;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
