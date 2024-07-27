/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.laboratorio1;

import com.umg.laboratorio1.classes.Employee;
import com.umg.laboratorio1.classes.Executive;
import com.umg.laboratorio1.enums.EmployeeType;
import static com.umg.laboratorio1.enums.EmployeeType.EXECUTIVE;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mrph0
 */
public class FormularioTest {
    @Test
    void testEnumSelection() {
        EmployeeType type = EmployeeType.valueOfLabel("Ejecutivo");
        switch(type){
            case EXECUTIVE -> {
                System.out.println("yes");
            }
        }
    }
    
    @Test
    void testEnumbyId() {
        EmployeeType type = EmployeeType.valueOfId(2);
        switch(type){
            case PROGRAMMER -> {
                System.out.println("yes");
            }
        }
    }
}
