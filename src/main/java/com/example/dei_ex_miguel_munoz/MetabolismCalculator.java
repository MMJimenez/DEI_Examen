package com.example.dei_ex_miguel_munoz;

public class MetabolismCalculator {

    public static Double calculateGER(Person person){
        if (person.getSex().equals("Masculino")) {
            return 66.473 + (13.751 * person.getWeigth() + (5.0033 * person.heigth) - (6.755 * person.age));
        } else {
        return null;

        }
    }

    public static Double calculateGET(Person person) {
        Double activityFactor = 0.0;
        if (person.getSex().equals("Masculino")) {
            switch (person.activity) {
                case MUY_LIGERA:
                    return  1.3;
                case LIGERA:
                    return 1.6;
                case MODERADA:
                    return 1.7;
                default:
                    return 2.1;
            }
        } else {
            switch (person.activity) {
                case MUY_LIGERA:
                    return  1.3;
                case LIGERA:
                    return 1.5;
                case MODERADA:
                    return 1.6;
                default:
                    return 1.9;
            }
        }
    }

}
