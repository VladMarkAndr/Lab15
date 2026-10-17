package org.example;

class Food {
    private String name;
    private int calories;
    private int weight;

    public Food(String name, int calories, int weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void cook() {
        System.out.println("🍳 Базовый метод 3 Готовлю еду: " + name);
    }

    public void cook(int minutes) {
        System.out.println("⏱️ Базовый метод 1 Готовлю " + name + " в течение " + minutes + " минут.");
    }

    public void cook(String method) {
        System.out.println("🔥 Базовый метод 2 Готовлю " + name + " методом: " + method + ".");
    }

    public String getTaste() {
        return "Нейтральный вкус";
    }
}
