package org.example;

abstract class Meal {

    private String name;
    private int weight; // в граммах
    private int cookingTime; // в минутах

    public Meal(String name, int weight, int cookingTime) {
        this.name = name;
        this.weight = weight;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public abstract void cook();

    public abstract int getCaloriesPer100g();

    public int calculateTotalCalories() {
        return (int) ((this.weight / 100.0) * getCaloriesPer100g());
    }

    public void displayInfo() {
        System.out.printf("Блюдо: %s | Вес: %d г | Время приготовления: %d мин%n",
                name, weight, cookingTime);
    }
}
