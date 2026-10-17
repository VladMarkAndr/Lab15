package org.example;

class Soup extends Meal {

    private String ingredients;

    public Soup(String name, int weight, int cookingTime, String ingredients) {
        super(name, weight, cookingTime);
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public void cook() {
        System.out.println("Процесс! " + getName() + ": Варится 40 минут.");
    }

    @Override
    public int getCaloriesPer100g() {
        return 50;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Состав: " + ingredients + " | Калорийность: " + getCaloriesPer100g() + " ккал/100г");
    }
}
