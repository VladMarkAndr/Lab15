package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Проверка инстанцирования");
        List<Meal> menu = new ArrayList<>();

        menu.add(new Soup("Борщ ", 400, 45, "Свекла, капуста, картофель, говядина"));
        menu.add(new Soup("Крем-суп ", 300, 30, "Шампиньоны, сливки, лук"));

        menu.add(new Pasta("Паста Карбонара", 350, 15, "Спагетти"));
        menu.add(new Pasta("Паста Болоньезе", 380, 20, "Тальятелле"));
        menu.add(new Pasta("Паста Четыре сыра", 320, 12, "Пенне"));
         for (Meal dish : menu) {

            dish.displayInfo();


            dish.cook();
            System.out.printf("Итоговая калорийность порции (%d г): %d ккал %n",
                    dish.getWeight(), dish.calculateTotalCalories());
            System.out.println("---");
        }
    }
}