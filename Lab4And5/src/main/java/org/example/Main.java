package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        switch (num) {
            case 1:
                Counter counter = new Counter();
                for (int i = 0; i < 4; i++) {
                    counter.increment();
                }
                for (int i = 0; i < 1; i++) {
                    counter.decrement();
                }
                System.out.println(counter.getValue());

                break;
            case 2:
                Country bel = new Country("Беларусь", 21000000, "Минск");
                Country rus = new Country("Россия", 22000000, "Москва");
                Country uk = new Country("Украина", 23000000, "Киев");
                Country ger = new Country("Германия", 24000000, "Берлин");
                Country hohohoho = new Country("Франция", 25000000, "Париж");
                Country[] mass = {bel, rus, uk, ger, hohohoho};
                int max = 0;
                int timemin = 0;
                int curri=0;
                for (int i = 0; i < 5; i++) {
                    mass[i].showCapital();
                    timemin = mass[i].getPopulation();
                    if (timemin > max) {
                        max = timemin;
                        curri=i;
                    }
                }
                System.out.println(mass[curri].toString());

                System.out.println();
                break;
            case 3:
                Car car1 = new Car("ЯНеЗнаюНазванияМашин", Type.SUV);
                Car car2 = new Car("Чайка", Type.SUV);
                Car car3 = new Car("ЧайкаPRO", Type.COUPE);
                Car car4 = new Car("Омлет", Type.HATCHBACK);
                Car car6 = new Car("Чипсон", Type.CONVERTIBLE);
                Car car5 = new Car("КушатьХочется", Type.SEDAN);
                Car[] fatbuttcar = {car1, car2, car3, car4, car5, car6};
                for (int i = 0; i < fatbuttcar.length; i++) {
                    if (fatbuttcar[i].getType() == Type.SUV) {
                        fatbuttcar[i].showinfo();
                    }
                }
                break;
            default:
                System.out.println("Такого номера нет");

        }

        in.close();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}