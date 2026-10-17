package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Food genericFood = new Food("Полуфабрикат", 200, 150);

        genericFood.cook();
        genericFood.cook(15);
        genericFood.cook("Запекание");

        Pizza pizzaItem = new Pizza("Маргарита", 800, 400, 30.5);
        pizzaItem.slice();
        pizzaItem.slice(6);

        Soup soupItem = new Soup("Борщ", 350, 500, true);
        soupItem.serve();
        soupItem.serve("Пампушки с чесноком");
        Food myPizza = new Pizza("Пепперони", 950, 450, 32.0);
        Food mySoup = new Soup("Солянка", 400, 450, true);

    }
}