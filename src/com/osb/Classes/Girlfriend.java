package com.osb.Classes;

import java.util.Objects;

public class Girlfriend extends Human {

    private boolean loveHBF;

    public Girlfriend() {
    }

    public Girlfriend(String name, int age, String nationality, double height, double weight, boolean loveHBF) {
        super(name, age, nationality, height, weight);
        this.loveHBF = loveHBF;
    }

    public boolean isLoveHBF() {
        return loveHBF;
    }

    public void setLoveHBF(boolean loveHBF) {
        this.loveHBF = loveHBF;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "LoveHBF: " + loveHBF +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Girlfriend)) return false;
        if (!super.equals(o)) return false;
        Girlfriend that = (Girlfriend) o;
        return loveHBF == that.loveHBF;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loveHBF);
    }

}
