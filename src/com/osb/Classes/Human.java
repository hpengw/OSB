package com.osb.Classes;

import java.util.Objects;

public class Human {

    private String nationality;

    private String name;

    private String sex;

    private int age;

    private double height;

    private double weight;

    public Human() {
    }

    public Human(String name, int age, String nationality, double height, double weight) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    public Human(String name, String sex, int age, String nationality, double height, double weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    public Human(String name, String sex, int age, double height, double weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Nationality: '" + nationality + '\'' +
                ", Name: '" + name + '\'' +
                ", Sex: '" + sex + '\'' +
                ", Age: " + age +
                ", Height: " + height +
                ", Weight: " + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return age == human.age && Double.compare(human.height, height) == 0 && Double.compare(human.weight, weight) == 0 && nationality.equals(human.nationality) && name.equals(human.name) && sex.equals(human.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nationality, name, sex, age, height, weight);
    }
}
