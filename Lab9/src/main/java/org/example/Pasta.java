package org.example;

class Pasta extends Meal {

    private String typee;

    public Pasta(String name, int weight, int cookingTime, String type) {
        super(name, weight, cookingTime);
        this.typee = type;
    }

    public String getType() {
        return typee;
    }

    @Override
    public void cook() {
        System.out.println("Процесс! " + getName() + ": Варится 10 минут.");
    }

    @Override
    public int getCaloriesPer100g() {
        return 130;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Тип пасты: " + typee + " | Калорийность: " + getCaloriesPer100g() + " ккал/100г");
    }
}
