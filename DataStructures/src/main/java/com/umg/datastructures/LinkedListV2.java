package com.umg.datastructures;

import com.umg.datastructures.nodes.Node;

/**
 *
 * @author mrph0
 */
public class LinkedListV2 {

    private Node head;
    private Node tail;
    private int length;

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void append(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void prepend(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
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

    public boolean insert(int index, Node newNode) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(newNode);
            return true;
        }

        if (index == length) {
            append(newNode);
            return true;
        }
        Node before = get(index - 1);
        newNode.next = before.next;
        before.next = newNode;
        length++;
        return true;
    }

    public Node get(int index) {
        if (index < 0 || index >= length || isEmpty()) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }
    
    public boolean updateId(int index, long newId) {
        Node temp = get(index);
        if (temp == null) {
            return false;
        }
        temp.setId(newId);
        return true;
    }
    
    public boolean updateName(long id, String newName) {
        Node temp =search(id);
        if (temp == null) {
            return false;
        }
        temp.setName(newName);
        return true;
    }

    public boolean removeFirst() {
        if (isEmpty()) {
            return false;
        }
        
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
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

    public boolean removeByIndex(int index) {

        if (index < 0 || index >= length || isEmpty()) {
            return false;
        }

        if (index == 0) {
            return removeFirst();
        }
        
        
        Node before = get(index -1);
        Node temp = before.next;
         
        before.next = temp.next;
        temp.next = null;
        length--;
        return true;
    }

}
