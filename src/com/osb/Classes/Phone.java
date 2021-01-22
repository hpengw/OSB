package com.osb.Classes;

import java.util.Objects;

public class Phone {

    private String brand;
    private String model;
    private String relDate;
    private String soc;
    private String memory;
    private String storage;
    private String display;
    private String camera;

    public Phone(String brand, String model, String relDate, String soc, String memory, String storage, String display, String camera) {
        this.brand = brand;
        this.model = model;
        this.relDate = relDate;
        this.soc = soc;
        this.memory = memory;
        this.storage = storage;
        this.display = display;
        this.camera = camera;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRelDate() {
        return relDate;
    }

    public void setRelDate(String relDate) {
        this.relDate = relDate;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Brand: '" + brand + '\'' +
                ", Model: '" + model + '\'' +
                ", Release Date: '" + relDate + '\'' +
                ", SoC: '" + soc + '\'' +
                ", Memory: '" + memory + '\'' +
                ", Storage: '" + storage + '\'' +
                ", Display: '" + display + '\'' +
                ", Camera: '" + camera + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return brand.equals(phone.brand) && model.equals(phone.model) && relDate.equals(phone.relDate) && soc.equals(phone.soc) && memory.equals(phone.memory) && storage.equals(phone.storage) && display.equals(phone.display) && camera.equals(phone.camera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, relDate, soc, memory, storage, display, camera);
    }

}
