package com.example.dei_ex_miguel_munoz.model;

import com.example.dei_ex_miguel_munoz.model.Person;

public class MetabolismCalculator {

    public static Double calculateGER(Person person){
        if (person.getSex() == Person.GENRE.MEN) {
            Double GER = 66.473 + 13.751 * person.getWeigth() + 5.0033 * person.getHeigth() - 6.755 * person.getAge();
            return  Math.round(GER * 100.0) / 100.0;
        } else {
            Double GER = 655.0955 + 9.463 * person.getWeigth() + 1.8496 * person.getHeigth() - 4.6756 * person.getAge();
            return  Math.round(GER * 100.0) / 100.0;
        }
    }

    //Para calcular el GET, necesitamos primero calcular el GER
    public static Double calculateGET(Person person) {
        Double activityFactor = 0.0;
        if (person.getSex() == Person.GENRE.MEN) {
            switch (person.getActivity()) {
                case MUY_LIGERA:
                    activityFactor =  1.3;
                    break;
                case LIGERA:
                    activityFactor = 1.6;
                    break;
                case MODERADA:
                    activityFactor = 1.7;
                    break;
                default:
                    activityFactor = 2.1;
            }
        } else {
            switch (person.getActivity()) {
                case MUY_LIGERA:
                    activityFactor =  1.3;
                    break;
                case LIGERA:
                    activityFactor = 1.5;
                    break;
                case MODERADA:
                    activityFactor = 1.6;
                    break;
                default:
                    activityFactor = 1.9;
            }
        }
        Double GET = activityFactor * person.getGER();
        return Math.round(GET * 100.0) / 100.0;
    }

}
