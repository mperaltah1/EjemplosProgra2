/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.datastructures.test;

import com.umg.datastructures.Stack;
import com.umg.datastructures.nodes.Node;

/**
 *
 * @author mrph0
 */
public class TestStack {

    public static void main(String[] args) {
        Stack pila = new Stack();

        Node f = new Node(1, "Facebook");
        System.out.println("Agregando facebook a la pila");
        pila.push(f);

        Node i = new Node(2, "Instagram");
        System.out.println("Agregando instagram a la pila");
        pila.push(i);

        Node y = new Node(3, "Youtube");
        System.out.println("Agregando Youtube a la pila");
        pila.push(y);
        
        Node t = pila.pop();
        System.out.println("Retirando el elemento "+ t.getName());

        t = pila.pop();
        System.out.println("Retirando el elemento "+ t.getName());

        pila.peek();
    }
}
