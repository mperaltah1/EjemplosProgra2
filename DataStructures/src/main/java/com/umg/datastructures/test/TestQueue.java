/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.datastructures.test;

import com.umg.datastructures.Queue;
import com.umg.datastructures.nodes.Node;

/**
 *
 * @author mrph0
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue cola = new Queue();
        
        Node f = new Node(1, "Facebook");
        System.out.println("Agregando facebook a la pila");
        cola.enqueue(f);

        Node i = new Node(2, "Instagram");
        System.out.println("Agregando instagram a la pila");
        cola.enqueue(i);

        Node y = new Node(3, "Youtube");
        System.out.println("Agregando Youtube a la pila");
        cola.enqueue(y);
        
        Node t = cola.dequeue();
        System.out.println("Retirando el elemento "+ t.getName());

        t = cola.dequeue();
        System.out.println("Retirando el elemento "+ t.getName());

    }
}
