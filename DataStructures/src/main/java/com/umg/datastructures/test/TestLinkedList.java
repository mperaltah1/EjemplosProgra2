/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umg.datastructures.test;

import com.umg.datastructures.LinkedList;
import com.umg.datastructures.nodes.Node;

/**
 *
 * @author mrph0
 */
public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList estudiantes = new LinkedList();
        Node A = new Node(1111, "Cesar");
        Node B = new Node(2222, "Lucas");
        Node C = new Node(3333, "Alan");
        Node D = new Node(4444, "Elliott");
        
        //Agregando estudiantes a la lista
        estudiantes.add(A);
        estudiantes.add(B);
        estudiantes.add(C);
        estudiantes.add(D);
        
        System.out.println("Imprimiendo los 4 estudiantes");
        estudiantes.printList();
        System.out.println("-----------------------------------");
        
        System.out.println("Actualizando el nombre de un estudiante");
        estudiantes.updateName(4444, "Luis");
        estudiantes.printList();
        System.out.println("-----------------------------------");
        
        System.out.println("Eliminando un estudiante");
        estudiantes.removeByValue(3333);
        estudiantes.printList();
        System.out.println("-----------------------------------");
        
        System.out.println("Eliminando el primer estudiante");
        estudiantes.removeByValue(1111);
        estudiantes.printList();
        System.out.println("-----------------------------------");
    }
}
