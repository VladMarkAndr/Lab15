package org.example;

public class Car {
    String model;
    Type type;

    public Car() {

    }

    public Car(String model1, Type type1) {
        model = model1;
        type = type1;
    }

    public String getModel() {
        return model;

    }

    public void setModel(String model1) {
        model = model1;
    }

    public Type getType() {
        return type;
    }

    public void showinfo() {
        System.out.println(model + ' ' + type);
    }

}
