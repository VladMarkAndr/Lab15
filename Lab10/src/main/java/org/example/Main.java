package org.example;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Assemblable.printInstructionWarning();
        System.out.println();

        List<Usable> furnitureList = new ArrayList<>();
        furnitureList.add(new Table("Обеденный", "Дуб", 4));
        furnitureList.add(new Table("Компьютерный", "Дуб", 4));
        furnitureList.add(new Table("Кофейный", "Стекло", 3));

        furnitureList.add(new Chair("Офисный", "Сетка/Пластик", true));
        furnitureList.add(new Chair("Барный табурет", "Металл/Кожа", false));
        for (Usable item : furnitureList) {

            System.out.println("Предмет: " + item.getPurpose());
            item.use();

            if (item instanceof Assemblable) {
                Assemblable assemblableItem = (Assemblable) item;
                assemblableItem.assemble();
                assemblableItem.disassemble();
            }
            System.out.println("---");
            StringBuilder str=new StringBuilder("you java");


        }
    }
}