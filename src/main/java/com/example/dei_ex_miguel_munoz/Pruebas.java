package com.example.dei_ex_miguel_munoz;

public class Pruebas {
    public static void main(String[] args) {
        Person per = new Person();
        per.setAge(45);
        per.setActivity(Person.ACTIVITY.MUY_LIGERA);
        per.setHeigth(140);
        per.setWeigth(70.05);
        per.setSex("Masculino");

        Double GET = MetabolismCalculator.calculateGET(per);
        Double GER = MetabolismCalculator.calculateGER(per);
        System.out.println(GET);
        System.out.println(GER);
    }
}
