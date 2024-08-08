/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umg.readcsvfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mrph0
 */
public class ReadCSVFile {
    static List<Student> list = new ArrayList<>();
    
    public static void main(String[] args) {
        readFile();
        printStudents();
    }
    
    public static void readFile() {
        //Tengan cuidado con las tíldes en los nombres ya que eso me dio problema al leer el archivo
        //Entonces se las quite
        String location = "Students.csv";
        File f = new File(location);
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                //Separar las columnas
                String[] data = line.split(",");
                //ya sabemos el orden en el que se guardaron los datos es
                // id, carne, nombre completo, correo
                Student e = new Student();
                e.setId(data[0]);
                e.setCarne(data[1]);
                e.setFullName(data[2]);
                e.setEmail(data[3]);
                list.add(e);
            }
            System.out.println("Archivo leido exitosamente");
        } catch (IOException ex) {
            System.out.println("Ocurrio un error al tratar de leer el archivo");
        }
    }
    
    public static void printStudents() {
        for(Student e : list) {
            System.out.println(e.toString());
        }
    }
    
}
