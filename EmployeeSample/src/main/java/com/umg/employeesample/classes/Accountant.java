/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.employeesample.classes;

/**
 *
 * @author mrph0
 */
public class Accountant extends Employee {
    
    public Accountant(int dpi, String name, int hours){
        super(dpi, name, hours);
        hourPrice = 175;
        discountPercent = 3;
    }
}
