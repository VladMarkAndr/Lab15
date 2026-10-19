package org.example;

class Chair implements Assemblable, Usable {

    private String name;
    private String material;
    private boolean backrest;

    public Chair(String name, String material, boolean backrest) {
        this.name = name;
        this.material = material;
        this.backrest = backrest;
    }

    public String getName() {
        return name;
    }

    @Override
    public void assemble() {
        String backrestText = backrest ? "со спинкой" : "без спинки";
        System.out.println("Сборка: Соединяем сиденье и основу стула \"" + name + "\" (" + backrestText + ").");
    }
    @Override
    public void disassemble() {
        System.out.println("😍😍😍😍😍😍😍 Разбираем: Разъединяем стул \"" + name + "\" на детали.");
    }

    @Override
    public void use() {
        System.out.println("🙄🙄🙄🙄🙄 Используем: Садимся на стул \"" + name + "\". Удобно!");
    }

    @Override
    public String getPurpose() {
        return "Предназначен для сидения одного человека";
    }
}
