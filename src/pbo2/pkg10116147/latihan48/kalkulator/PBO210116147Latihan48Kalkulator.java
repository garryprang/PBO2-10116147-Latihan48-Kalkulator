/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan48.kalkulator;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan hasil perhitungan kalkulator.
 */

public class PBO210116147Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7.0);
        kalkulator.setValue2(5.0);
        double value1 = kalkulator.getValue1();
        double value2 = kalkulator.getValue2();
        System.out.println("VALUE 1 = " + value1);
        System.out.println("VALUE 2 = " + value2);
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project show you how to manage method in java");
        System.out.println("This project show you how to manage method in java");
        double add = kalkulator.add(value1, value2);
        double minus = kalkulator.minus(value1, value2);
        double multiplication = kalkulator.multiplication(value1, value2);
        double division = kalkulator.division(value1, value2);
        System.out.println("Result Add is = " + add);
        System.out.println("Result Minus is = " + minus);
        System.out.println("Result Multiple is = " + multiplication);
        System.out.println("Result Division is = " + division);
    }
    
}
