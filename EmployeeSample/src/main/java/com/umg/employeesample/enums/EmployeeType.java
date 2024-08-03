/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.employeesample.enums;

/**
 *
 * @author mrph0
 */
public enum EmployeeType {
    MANAGER(0, "Gerente"),
    EXECUTIVE(1, "Ejecutivo"),
    DEVELOPER(2,"Programador"),
    SECRETARY(3,"Secretaria");

    private final int id;
    private final String label;

    private EmployeeType(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public static EmployeeType valueOfLabel(String label) {
        for (EmployeeType e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }
    
    public static EmployeeType valueOfId(int id) {
        for (EmployeeType e : values()) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }
}
