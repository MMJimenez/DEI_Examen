package com.example.dei_ex_miguel_munoz;

public class Person {
    public enum ACTIVITY {MUY_LIGERA, LIGERA, MODERADA, INTENSA}

    String name;
    String sex;
    Integer age;
    Double weigth;
    Integer heigth;
    ACTIVITY activity;

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
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
}
