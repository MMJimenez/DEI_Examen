package com.example.dei_ex_miguel_munoz.model;

import java.io.Serializable;

public class Person implements Serializable {
    public enum ACTIVITY {
        MUY_LIGERA("Muy Ligera"),
        LIGERA("Ligera"),
        MODERADA("Moderada"),
        INTENSA("Intensa");

        private String str;
        ACTIVITY(String str) {
            this.str = str;
        }
        public String getStr() {
            return str;
        }

        public static ACTIVITY setActivityFrom(String str) {
            if (str.equals("Muy Ligera")) {
                return MUY_LIGERA;
            } else if (str.equals("Ligera")) {
                return LIGERA;
            } else if (str.equals("Moderada")) {
                return MODERADA;
            } else if (str.equals("Intensa")) {
                return INTENSA;
            }
            return null;
        }
    }
    public enum GENRE {
        MEN("Hombre"),
        WOMEN("Mujer");
        private String str;
        GENRE(String str) {
            this.str = str;
        }
        public String getStr() {
            return str;
        }

        public static GENRE setGenreFrom(String str) {
            if (str.equals("Hombre")) {
                return MEN;
            } else if (str.equals("Mujer")) {
                return WOMEN;
            }
            return null;
        }
    }

    private String name;
    private GENRE sex;
    private Integer age;
    private Double weigth;
    private Integer heigth;
    private ACTIVITY activity;

    private Double GER;

    private Double GET;

    public Person(String name, GENRE sex, Integer age, Double weigth, Integer heigth, ACTIVITY activity) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weigth = weigth;
        this.heigth = heigth;
        this.activity = activity;

        this.GER = MetabolismCalculator.calculateGER(this);
        this.GET = MetabolismCalculator.calculateGET(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GENRE getSex() {
        return sex;
    }

    public void setSex(GENRE sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeigth() {
        return weigth;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    public Integer getHeigth() {
        return heigth;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }

    public ACTIVITY getActivity() {
        return activity;
    }

    public void setActivity(ACTIVITY activity) {
        this.activity = activity;
    }

    public Double getGER() {
        return GER;
    }

    public void setGER(Double GER) {
        this.GER = GER;
    }

    public Double getGET() {
        return GET;
    }

    public void setGET(Double GET) {
        this.GET = GET;
    }
}
