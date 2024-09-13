/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.datastructures;

import com.umg.datastructures.nodes.Node;

/**
 *
 * @author mrph0
 */
public class Stack {
    //LIFO -> Last In, First Out
    private Node top;
    private int height;
    
    public void prinStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void push(Node newNode) {
        if(isEmpty()){
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    
    public Node pop() {
        if(isEmpty()){
            return null;
        } 
        
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
    
    public void peek(){
        if (isEmpty()) {
            return;
        }
        System.out.println("Peek: "+ top.toString());
    }
}
