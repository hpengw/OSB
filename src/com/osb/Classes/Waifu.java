package com.osb.Classes;

import java.util.Objects;

public class Waifu extends Human {

    private String production;

    public Waifu() {
    }

    public Waifu(String name, String sex, int age, String nationality, double height, double weight, String production) {
        super(name, sex, age, nationality, height, weight);
        this.production = production;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Waifu{" +
                "Production of 'C': '" + production + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Waifu)) return false;
        if (!super.equals(o)) return false;
        Waifu waifu = (Waifu) o;
        return production.equals(waifu.production);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), production);
    }

}
