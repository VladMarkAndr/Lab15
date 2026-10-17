package org.example;

class Soup extends Food {
    private boolean isHot;

    public Soup(String name, int calories, int weight, boolean isHot) {
        super(name, calories, weight);
        this.isHot = isHot;
    }

    @Override
    public String getTaste() {
        return "Вкусный, ароматный и наваристый суп";
    }

    public void serve() {
        System.out.println("🥣 Подаю суп \"" + getName() + "\" в глубокой тарелке.");
    }

    public void serve(String breadType) {
        System.out.println("🥣 Подаю суп \"" + getName() + "\" вместе со свежим хлебом типа: " + breadType + ".");
    }
}
