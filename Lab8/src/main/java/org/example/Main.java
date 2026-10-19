package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Furniture[] catalog = new Furniture[5];
        catalog[0] = new Table("Обеденный стол", "Дуб", 450.00, 4);
        catalog[1] = new Table("Журнальный столик", "Стекло", 150.00, 3);
        catalog[2] = new Table("Письменный стол", "МДФ", 300.00, 4);
        catalog[3] = new Chair("Офисное кресло", "Ткань/Пластик", 180.00, true);
        catalog[4] = new Chair("Табурет для кухни", "Сосна", 45.00, false);


        for (Furniture item : catalog) {
            item.displayInfo();
            if (item instanceof Table) {
                Table table = (Table) item;
                table.fold();

            } else if (item instanceof Chair) {
                Chair chair = (Chair) item;
                chair.adjustHeight();
            }
            System.out.println("--");
        }
        Furniture a = new Chair("","",8,true);
        a.displayInfo();
        Chair b = new Chair("","",8,true);

    }
}