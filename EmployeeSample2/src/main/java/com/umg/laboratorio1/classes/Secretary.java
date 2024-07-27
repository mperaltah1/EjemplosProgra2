/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.laboratorio1.classes;

/**
 *
 * @author mrph0
 */
public class Secretary extends Employee {
    
    public Secretary(int dpi, String name, int hours){
        super(dpi, name, hours);
        hourPrice = 25;
        discountPercent = 0;
    }
    
}
