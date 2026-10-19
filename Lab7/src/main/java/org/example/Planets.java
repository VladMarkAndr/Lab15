package org.example;

class Planets {
    static int totalPlanets=0 ;
    static int totalMoons=0 ;
    private String name;
    private double diameter;

    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    int moons;

    public int getMoons() {
        return moons;
    }

    static double getAverageMoons() {

        return totalMoons / totalPlanets;
    }

    Planets(String name1, double dio1, int moons1) {
        name = name1;
        diameter = dio1;
        moons = moons1;
        totalPlanets+=1;
        totalMoons+=moons1;
    }

    static void getInfo(Planets[] planet) {
        for (int i = 0; i < totalPlanets; i++) {
            System.out.println(planet[i].getName() + ' ' + planet[i].getDiameter() + ' ' + planet[i].getMoons());
        }

    }
}
