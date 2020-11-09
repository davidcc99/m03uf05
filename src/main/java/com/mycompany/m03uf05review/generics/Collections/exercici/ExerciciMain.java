/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf05review.generics.Collections.exercici;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author david
 */
public class ExerciciMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList();
        listaPersonas.add(new Persona(1, Sexo.MUJER, 45, true, OrientacionSexual.BISEXUAL, Formacion.GRADO, OrientacionPolitica.EXTREMA_IZQUIERDA));
        listaPersonas.add(new Persona(2, Sexo.MUJER, 48, true, OrientacionSexual.BISEXUAL, Formacion.BACHILLERATO, OrientacionPolitica.IZQUIERDA));
        listaPersonas.add(new Persona(3, Sexo.HOMBRE, 24, false, OrientacionSexual.HETERO, Formacion.GRADO_SUPERIOR, OrientacionPolitica.CENTRO));
        listaPersonas.add(new Persona(4, Sexo.HOMBRE, 44, true, OrientacionSexual.HETERO, Formacion.GRADO_MEDIA, OrientacionPolitica.DERECHA));
        listaPersonas.add(new Persona(5, Sexo.MUJER, 21, false, OrientacionSexual.HETERO, Formacion.BACHILLERATO, OrientacionPolitica.DERECHA));
        listaPersonas.add(new Persona(6, Sexo.HOMBRE, 37, false, OrientacionSexual.GAY, Formacion.SECUNDARIA, OrientacionPolitica.EXTREMA_IZQUIERDA));
        listaPersonas.add(new Persona(7, Sexo.MUJER, 41, false, OrientacionSexual.LESBIANA, Formacion.GRADO_MEDIA, OrientacionPolitica.IZQUIERDA));
        listaPersonas.add(new Persona(8, Sexo.HOMBRE, 18, true, OrientacionSexual.HETERO, Formacion.SECUNDARIA, OrientacionPolitica.EXTREMA_DERECHA));
        listaPersonas.add(new Persona(9, Sexo.MUJER, 20, true, OrientacionSexual.HETERO, Formacion.GRADO_MEDIA, OrientacionPolitica.DERECHA));
        listaPersonas.add(new Persona(10, Sexo.MUJER, 54, false, OrientacionSexual.BISEXUAL, Formacion.CATEDRATICO, OrientacionPolitica.CENTRO));

//        for (Iterator it = listaPersonas.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }
//        Collections.sort(listaPersonas, new ComparatorFormacion());
//        Collections.sort(listaPersonas, new ComparatorOrientacionPolitica());
//        Collections.sort(listaPersonas, new ComparatorOrientacionSexual());
//        Collections.sort(listaPersonas, new ComparatorEdad());
//        Collections.sort(listaPersonas, new ComparatorFumador());
//        System.out.println(listaPersonas);
    }
}
