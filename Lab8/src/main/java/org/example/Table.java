package org.example;

class Table extends Furniture {
    private int legs;

    public Table(String name, String material, double price, int legs) {
        super(name, material, price);
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public String getPurpose() {
        return "Служит поверхностью";
    }

    public void fold() {
        System.out.println(" Стол \"" + getName() + "\" успешно сложен для транспортировки.");
    }
}
