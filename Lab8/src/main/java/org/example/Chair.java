package org.example;

class Chair extends Furniture {

    private boolean hasBackrest;

    public Chair(String name, String material, double price, boolean hasBackrest) {
        super(name, material, price);
        this.hasBackrest = hasBackrest;

    }

    public boolean HasBackrest() {
        return hasBackrest;
    }

    @Override
    public String getPurpose() {
        return "Для сидения";
    }
    @Override
    public  void displayInfo(){

        super.displayInfo();
        System.out.printf("Есть ли спинка?: %s",
                hasBackrest);
    }

    // Уникальный метод
    public void adjustHeight() {
        System.out.println(" Высота стула \"" + getName() + "\" отрегулирована под рост.");
    }
}
