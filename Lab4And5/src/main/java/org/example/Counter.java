package org.example;

class Counter {
    private int count;

    Counter() {
        count = 0;
    }

    public int getValue() {
        return count;
    }

    public int increment() {
        return count++;
    }

    public int decrement() {
        return count--;
    }

}
