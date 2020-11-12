/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf05review.generics.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author david
 */
public class RegExprMain {
    
    static boolean validateNif(String nif){
        Pattern p = Pattern.compile("\\d{8}[A-Z]");
        Matcher m1 = p.matcher(nif);
        return m1.matches();
    }
    
    static boolean validateNie(String nie){
        Pattern p = Pattern.compile("[A-Z]\\d{7}[A-Z]");
        Matcher m1 = p.matcher(nie);
        return m1.matches();
    }
    
    static boolean validateTlf(String tlf){
        Pattern p = Pattern.compile("\\d{9}");
        Matcher m1 = p.matcher(tlf);
        return m1.matches();
    }
    
    static boolean validateTlfEsp(String tlf){
        Pattern p = Pattern.compile("^(\\+34)?[67]\\d{8}");
        Matcher m1 = p.matcher(tlf);
        return m1.matches();
    }
    
    static boolean validateMatricula(String matricula){
        Pattern p = Pattern.compile("^\\d{4}\\s[A-Z]{3}");
        Matcher m1 = p.matcher(matricula);
        return m1.matches();
    }
    
    static boolean validateFecha(String fecha){
        Pattern p = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
        Matcher m1 = p.matcher(fecha);
        return m1.matches();
    }
    
    static boolean validateEmail(String email){
        Pattern p = Pattern.compile("^[_A-Za-z0-9-\\+]*@" + "[A-Za-z0-9-]*(\\.[A-Za-z]{2,})");
        Matcher m1 = p.matcher(email);
        return m1.matches();
    }
    
    public static void main(String[] args){
        
        boolean validarNif1 = validateNif("49660516C");
        boolean validarNif2 = validateNif("123C");
        System.out.println("Validacion Nif: " + validarNif1);
        System.out.println("Validacion Nif: " + validarNif2);
        
        
        boolean validarNie1 = validateNie("A8543214L");
        boolean validarNie2 = validateNie("123C");
        System.out.println("Validacion Nie: " + validarNie1);
        System.out.println("Validacion Nie: " + validarNie2);
        
        boolean validarTlf1 = validateTlf("459231442");
        boolean validarTlf2 = validateTlf("C1234567V");
        System.out.println("Validacion Tlf: " + validarTlf1);
        System.out.println("Validacion Tlf: " + validarTlf2);
        
        boolean validarTlfEsp1 = validateTlfEsp("+34666300191");
        boolean validarTlfEsp2 = validateTlfEsp("34C1234567V");
        System.out.println("Validacion TlfEsp: " + validarTlfEsp1);
        System.out.println("Validacion TlfEsp: " + validarTlfEsp2);
        
        boolean validarMatricula1 = validateMatricula("6852 KMB");
        boolean validarMatricula2 = validateMatricula("321312 DSAL");
        System.out.println("Validacion Matricula: " + validarMatricula1);
        System.out.println("Validacion Matricula: " + validarMatricula2);
        
        boolean validarFecha1 = validateFecha("05/11/2020");
        boolean validarFecha2 = validateFecha("110/371/320354");
        System.out.println("Validacion Fecha: " + validarFecha1);
        System.out.println("Validacion Fecha: " + validarFecha2);
        
        
        boolean validarEmail1 = validateEmail("dcaste99@gmail.com");
        boolean validarEmail2 = validateEmail("pepitpprueba@david");
        System.out.println("Validacion Email: " + validarEmail1);
        System.out.println("Validacion Email: " + validarEmail2);
    }  
}
