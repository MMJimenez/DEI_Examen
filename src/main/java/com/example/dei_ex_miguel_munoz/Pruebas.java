package com.example.dei_ex_miguel_munoz;

import com.example.dei_ex_miguel_munoz.model.MetabolismCalculator;
import com.example.dei_ex_miguel_munoz.model.Person;

public class Pruebas {
    public static void main(String[] args) {
//        Person per = new Person("Juan", Person.GENRE.MEN, 45, 70.5, 170, Person.ACTIVITY.MUY_LIGERA);

//        System.out.println(per.getGET());
//        System.out.println(per.getGER());

        var list = Person.GENRE.values();
        for (Person.GENRE g: list
             ) {
            System.out.println(g);
        }


    }
}
