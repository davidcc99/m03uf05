/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf05review.generics.Collections.exercici;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author david
 */
class ComparatorFormacion implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.getFormacion() == o2.getFormacion()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class ComparatorOrientacionSexual implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.getOrientacionSexual() == OrientacionSexual.HETERO && o2.getOrientacionSexual() == OrientacionSexual.HETERO && o1.getSexo() != o2.getSexo()) {
            return 1;
        } else if (o1.getOrientacionSexual() == OrientacionSexual.GAY && o2.getOrientacionSexual() == OrientacionSexual.GAY && o1.getSexo() == o2.getSexo()) {
            return 1;
        } else if (o1.getOrientacionSexual() == OrientacionSexual.LESBIANA && o2.getOrientacionSexual() == OrientacionSexual.LESBIANA && o1.getSexo() == o2.getSexo()) {
            return 1;
        } else if (o1.getOrientacionSexual() == OrientacionSexual.BISEXUAL && o2.getOrientacionSexual() == OrientacionSexual.HETERO && o1.getSexo() != o2.getSexo()) {
            return 1;
        } else if (o1.getOrientacionSexual() == OrientacionSexual.BISEXUAL && o2.getOrientacionSexual() == OrientacionSexual.GAY && o1.getSexo() == o2.getSexo()) {
            return 1;
        } else if (o1.getOrientacionSexual() == OrientacionSexual.BISEXUAL && o2.getOrientacionSexual() == OrientacionSexual.LESBIANA && o1.getSexo() == o2.getSexo()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class ComparatorOrientacionPolitica implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.getOrientacionPolitica() == o2.getOrientacionPolitica()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class ComparatorEdad implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.getEdad() == o2.getEdad()) {
            return 1;
        } else if ((o1.getEdad() - o2.getEdad()) == 1 || (o2.getEdad() - o1.getEdad()) == 1) {
            return 1;
        } else if ((o1.getEdad() - o2.getEdad()) == 2 || (o2.getEdad() - o1.getEdad()) == 2) {
            return 1;
        } else if ((o1.getEdad() - o2.getEdad()) == 3 || (o2.getEdad() - o1.getEdad()) == 3) {
            return 1;
        } else {
            return -1;
        }
    }
}

class ComparatorFumador implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.isFumador() == o2.isFumador()) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class MatcherImpl implements Matcher {

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        candidatos = new ArrayList<>();
        //Persona prueba = new Persona(11, Sexo.HOMBRE, 21, true, OrientacionSexual.HETERO, Formacion.GRADO_MEDIA, OrientacionPolitica.DERECHA);
        Collections.sort(candidatos, new ComparatorFormacion());
        Collections.sort(candidatos, new ComparatorOrientacionSexual());
        Collections.sort(candidatos, new ComparatorOrientacionPolitica());
        Collections.sort(candidatos, new ComparatorEdad());
        Collections.sort(candidatos, new ComparatorFumador());
        
        return candidatos.get(0);
    }

}
