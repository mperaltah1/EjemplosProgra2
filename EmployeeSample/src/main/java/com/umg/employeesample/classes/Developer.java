/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.employeesample.classes;

/**
 *
 * @author mrph0
 */
public class Developer extends Employee {
    
    public Developer(int dpi, String name, int hours){
        super(dpi, name, hours);
        hourPrice = 100;
        discountPercent = 5;
    }
    
}
