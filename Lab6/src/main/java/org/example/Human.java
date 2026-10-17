package org.example;

class Human {
    private String firstname;
    private String lastname;
    private int birthyear;
    private double height;

    public void setHeight(double height1) {
        height = height1;
    }

    public double getHeight() {
        return height;
    }

    Human(String f1, String l2, int b3) {
        firstname = f1;
        lastname = l2;
        birthyear = b3;
    }

    public Human(String f1, String l1, int b1, double h1) {
        this(f1, l1, b1);
        height = h1;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public int getAge() {
        int currentyear = java.time.LocalDate.now().getYear();
        return currentyear - birthyear;
    }

    Human() {

    }


}
