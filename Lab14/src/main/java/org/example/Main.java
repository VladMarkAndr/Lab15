package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        task1();
        task2(scanner);
        task3(random);
        task4(scanner);
        task5(random);
    }

    private static void task1() {
        String filename = "holiday.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Мой любимый праздник — Новый год.\n");
            writer.write("Он отмечается 31 декабря.\n");
            writer.write("В этот день все украшают елку, дарят подарки и собираются с близкими.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File(filename);
        System.out.println("=== Задание 1 ===");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер файла: " + file.length() + " байт");
        System.out.println("Файл существует: " + file.exists());

        System.out.println("\nСодержимое файла:");
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    private static void task2(Scanner scanner) {
        String filename = "f_task2.txt";

        System.out.println("=== Задание 2 ===");
        System.out.println("Введите 10 целых чисел:");
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();
                writer.write(num + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Числа из файла:");
        int count = 0;
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num > 0 && num < 100) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nКоличество чисел, больших 0 и меньших 100: " + count + "\n");
    }

    private static void task3(Random random) {
        String f = "f_task3.txt";
        String g = "g.txt";
        String h = "h.txt";

        System.out.println("=== Задание 3 ===");
        try (FileWriter writer = new FileWriter(f)) {
            for (int i = 0; i < 15; i++) {
                int num = random.nextInt(100) - 25;
                writer.write(num + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(new File(f));
             FileWriter writerG = new FileWriter(g);
             FileWriter writerH = new FileWriter(h)) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 6 == 0) {
                    writerG.write(num + "\n");
                } else {
                    writerH.write(num + "\n");
                }
            }
            System.out.println("Файлы g.txt (кратно 6) и h.txt (остальные) успешно созданы!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void task4(Scanner scanner) {
        String filename = "power.txt";

        System.out.println("=== Задание 4 ===");
        System.out.println("Введите 12 вещественных значений мощности:");
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < 12; i++) {
                double power = scanner.nextDouble();
                writer.write(power + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Средняя мощность: " + average + "\n");
        } else {
            System.out.println("Файл пуст или содержит некорректные данные.\n");
        }
    }

    private static void task5(Random random) {
        String filename = "f_task5.txt";

        System.out.println("=== Задание 5 ===");
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100) - 50;
                writer.write(num + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        System.out.println("Числа из файла:");
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");
                if (num % 9 == 0) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nКоличество чисел, кратных 9: " + count + "\n");
    }
}