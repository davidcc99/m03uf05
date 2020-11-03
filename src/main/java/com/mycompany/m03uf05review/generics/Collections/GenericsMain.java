/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf05review.generics.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author david
 */
public class GenericsMain {

    /**
     * Escribe un método que retorne el último elemento de la lista
     */
    public static <T> T ultimo(List<T> lista) {
        if (!lista.isEmpty()) {
            System.out.println(lista.get(lista.size() - 1));
            return lista.get(lista.size() - 1);
        } else {
            return null;
        }
    }

    /* 
     * Escribe un método que retorne la media de una lista de Doubles
     */
    public static double media(List<Double> lista) {
        if (!lista.isEmpty()) {
            double total = 0;
            int size = lista.size();
            for (int i = 0; i < size; i++) {
                total += lista.get(i);
            }
            double media = total / 2;
            System.out.println(media);
            return media;
        } else {
            return 0.0;
        }
    }

    /*
     * Escribe un método que retorne la cadena mas larga de una lista de cadenas
     */
    public static String largo(List<String> lista) {
        if (!lista.isEmpty()) {
            int size = lista.size();
            String grande = lista.get(0);
            for (int i = 0; i < size; i++) {
                if (lista.get(i).length() > grande.length()) {
                    grande = lista.get(i);
                }
            }
            System.out.println(grande);
            return grande;
        } else {
            return null;
        }
    }

    /*
     * Escribe un método que retorne el máximo de una lista de enteros
     * */
    public static Integer maximo(List<Integer> lista) {
        if (!lista.isEmpty()) {
            int grande = lista.get(0);
            int size = lista.size();
            for (int i = 0; i < size; i++) {
                if (lista.get(i) > grande) {
                    grande = lista.get(i);
                }
            }
            System.out.println(grande);
            return grande;

        } else {
            return 0;
        }
    }

    /*
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> miLista = new ArrayList<>();
        miLista.add("Marta");
        miLista.add("Eva");
        miLista.add("Joan");
        miLista.add("Juan Antonio");
        miLista.add("Pep");

        if (miLista.isEmpty()) {
            System.out.println("Llista buida");
        } else {
            System.out.println("Llista te " + miLista.size() + " elements");
        }

        miLista.remove("Carles");
        Iterator it = miLista.iterator();

        //while(it.hasNext())
        //System.out.println(it.next());
        //List<String> l2 = miLista.subList(0, 2);
        ultimo(miLista);

        List<Double> listaD = new ArrayList<>();
        listaD.add(6.9);
        listaD.add(10.9);
        listaD.add(5.9);
        listaD.add(4.0);

        List<Integer> listaE = new ArrayList<>();
        listaE.add(4);
        listaE.add(14);
        listaE.add(24);
        listaE.add(54);
        listaE.add(404);

        media(listaD);
        largo(miLista);
        maximo(listaE);

    }
}
