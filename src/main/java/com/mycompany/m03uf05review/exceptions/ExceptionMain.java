/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf05review.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 *
 * Las excepciones derivadas de RuntimeException y la propia RuntimeException
 * son excepciones unchecked (no necesita try catch)
 */
public class ExceptionMain {

    static double division(double a, double b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Divisor no puede ser 0", new DivisorException());
        }
        else if (a == 0){
            throw new DivisionException("Dividendo no puede ser 0", new DividendoException());
        }
        else if (a/b > a){
            throw new DivisionException("Coeciente no puede ser mas grande que dividendo", new CoecienteException());
        }
        else if (a%b < 0){
            throw new DivisionException("Resto no puede ser negativo", new RestoException());
        }
        return a / b;
    }

    public static void main(String[] args) {
        double d = 0;
        try {
            d = division(5, 0);
            System.out.println(d);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /*
    static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br
                = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }/*

    public static void main(String[] args) {
        /*    }
        double d = 0;
        try {
            d = division(5, 3.0);
        } catch (Exception ex) {
            Logger.getLogger(ExceptionMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*finally {
        Siempre se ejecuta
            System.out.println("Finally");
        }*/
    //System.out.println(d);
    //}
}
