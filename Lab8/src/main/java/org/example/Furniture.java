package org.example;

class Furniture {

    private String name;
    private String material;
    private double price;

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPurpose() {
        return "Общее назначение мебели";
    }

    public void displayInfo() {
        System.out.printf("Название: %s, Материал: %s, Цена: %.2f руб., Назначение: %s%n",
                name, material, price, getPurpose());
    }
}
