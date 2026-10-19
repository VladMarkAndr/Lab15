package org.example;

class Table implements Assemblable, Usable {

    private String name;
    private String material;
    private int legs;

    public Table(String name, String material, int legs) {
        this.name = name;
        this.material = material;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    @Override
    public void assemble() {
        System.out.println("😈😈 Сборка: Прикручиваем " + legs + " ножки к столешнице стола \"" + name + "\".");
    }

    @Override
    public void disassemble() {
        System.out.println("😎😎 Разборка: Откручиваем ножки у стола \"" + name + "\".");
    }

    @Override
    public void use() {
        System.out.println("💔💔 Использование: Накрываем на стол \"" + name + "\" (" + material + ") обед.");
    }

    @Override
    public String getPurpose() {
        return "Служит рабочей или обеденной поверхностью";
    }
}
