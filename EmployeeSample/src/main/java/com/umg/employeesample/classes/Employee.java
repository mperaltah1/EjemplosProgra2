/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.employeesample.classes;

import com.umg.employeesample.interfaces.iEmployee;

public abstract class Employee implements iEmployee{
    private final int dpi;
    private final String name;
    private final int workedHours;
    protected double hourPrice;
    private double ordSalary;
    private double extSalary;
    private double discounts;
    protected double discountPercent;
    private double salary;
    
    public Employee(int dpi, String name, int hours) {
        this.dpi = dpi;
        this.name = name;
        this.workedHours = hours;
    }

    public int getDpi() {
        return dpi;
    }

    public String getName() {
        return name;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public double getOrdSalary() {
        return ordSalary;
    }

    public double getExtSalary() {
        return extSalary;
    }

    public double getDiscounts() {
        return discounts;
    }

    public double getSalary() {
        return salary;
    }
    
    private void calculateOrdSalary() {
        ordSalary = 160 * hourPrice;
    }
    
    private void calculateExtSalary() {
        extSalary = (workedHours - 160) * 1.5 * hourPrice;
    }
    
    private void calculateDiscounts() {
        discounts = ordSalary * discountPercent / 100;
    }
    
    @Override
    public void calculateSalary() {
        calculateOrdSalary(); 
        calculateExtSalary(); 
        calculateDiscounts();
        salary = ordSalary + extSalary - discounts;
    }
}
