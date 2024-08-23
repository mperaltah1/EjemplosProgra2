/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.tarea1.enums;

/**
 *
 * @author mrph0
 */
public enum ProductType {
    RICE(0, "Arroz"),
    BOOK(1, "Libro"),
    FRIDGE(3,"Regrigerador");

    private final int id;
    private final String label;

    private ProductType(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static ProductType valueOfLabel(String label) {
        for (ProductType e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }
    
    public static ProductType valueOfId(int id) {
        for (ProductType e : values()) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }
}
