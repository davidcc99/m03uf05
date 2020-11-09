/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf05review.generics.Collections.exercici;
import java.util.List;

/**
 *
 * @author david
 */
public interface Matcher {
    Persona matches(Persona persona, List<Persona> candidatos);
}
