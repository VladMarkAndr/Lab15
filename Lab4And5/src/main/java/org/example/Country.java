package org.example;

class Country {
    private String name;
    private int population;
    private String capital;

    public void showinfo() {
        System.out.println("Название: " + name + "Население:" + population + "Столица:" + capital);
    }

    public void showCapital() {
        System.out.println(capital);
    }

    String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    Country(String name1, int pop1, String cap3) {
        name = name1;
        population = pop1;
        capital = cap3;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                '}';
    }
}
