package org.example;

class Pizza extends Food {
    private double diameter;

    public Pizza(String name, int calories, int weight, double diameter) {
        super(name, calories, weight);
        this.diameter = diameter;
    }

    @Override
    public String getTaste() {
        return "Вкусная сырная пицца с хрустящей корочкой";
    }

    public void slice() {
        System.out.println("🍕 Разрезаю пиццу \"" + getName() + "\" на стандартные 8 кусочков.");
    }

    public void slice(int pieces) {
        System.out.println("🍕 Разрезаю пиццу \"" + getName() + "\" на " + pieces + " кусочков.");
    }
}
